package org.olf.licenses

import com.k_int.web.toolkit.custprops.CustomProperties
import com.k_int.web.toolkit.custprops.types.CustomPropertyContainer
import com.k_int.web.toolkit.domain.traits.Clonable
import com.k_int.web.toolkit.tags.Tag
import grails.gorm.MultiTenant
import org.olf.general.Org
import org.olf.general.DocumentAttachment
import com.k_int.web.toolkit.refdata.RefdataValue;
import com.k_int.web.toolkit.refdata.Defaults;

class License extends LicenseCore implements CustomProperties, MultiTenant<License>, Clonable<License> {

  @Defaults(['Local', 'Consortial', 'National', 'Alliance' ])
  RefdataValue type
  String localReference

  Set<AlternateName> alternateNames

  static copyByCloning = ['customProperties', 'docs', 'supplementaryDocs', 'contacts']
  static cloneStaticValues = [
    name: { "Copy of: ${owner.name}" /* Owner is the current object. */ },
    version: { 0 }
  ]  
  
  static hasMany = [
    alternateNames: AlternateName,
    orgs:LicenseOrg,
    amendments:LicenseAmendment
  ]

  static mappedBy = [
    alternateNames: 'owner',
    orgs: 'owner',
    amendments: 'owner'
  ]

  static constraints = {
    type(nullable:true, blank:false)
    localReference(nullable:true, blank:false)
    orgs (validator: { orgs ->
      int num_licensor_orgs = orgs.findAll { it.role?.value?.equalsIgnoreCase('Licensor') }.size()
      // If there is more than one licensor, return an error message relating to the i18n message validation.onlyOneLicensor
      if ( num_licensor_orgs > 1 ) return [ 'validation.onlyOneLicensor' ]
    })
  }

  static mapping = {
    type column: 'lic_type_rdv_fk'
    orgs cascade: 'all-delete-orphan'
    localReference column: 'lic_local_reference'
    alternateNames cascade: 'all-delete-orphan'
    amendments cascade: 'all-delete-orphan', sort: 'startDate', order: 'desc'
  }
  
  @Override
  public License clone () {
    Clonable.super.clone()
  }
}
