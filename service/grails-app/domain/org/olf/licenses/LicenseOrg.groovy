package org.olf.licenses
import org.olf.general.Org
import com.k_int.web.toolkit.domain.traits.Clonable
import com.k_int.web.toolkit.refdata.CategoryId
import com.k_int.web.toolkit.refdata.Defaults
import com.k_int.web.toolkit.refdata.RefdataValue

import grails.gorm.MultiTenant


/**
 * Link a subscription agreement with an org and attach a role
 */
public class LicenseOrg implements MultiTenant<LicenseOrg>, Clonable<LicenseOrg>{

  String id
  Org org

  @CategoryId(defaultInternal=true)
  @Defaults(['Licensor', 'Licensee', 'Consortium', 'Consortium Administrator'])
  RefdataValue role
  String note

  static belongsTo = [
    owner: License
  ]

    static mapping = {
                   id column: 'sao_id', generator: 'uuid2', length:36
              version column: 'sao_version'
                owner column: 'sao_owner_fk'
                  org column: 'sao_org_fk'
                 role column: 'sao_role'
                 note column: 'sao_note', type: 'text'
  }

  static constraints = {
    owner(nullable:false, blank:false)
    org(nullable:true)
    role(nullable:true)
    note(nullable:true, blank:false)
  }
  
  @Override
  public LicenseOrg clone () {
    Clonable.super.clone()
  }
}
