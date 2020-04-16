package org.olf

import com.google.common.eventbus.Subscribe
import com.k_int.okapi.OkapiClient
import grails.events.annotation.Events
import grails.events.annotation.Subscriber
import grails.events.annotation.gorm.Listener
import grails.gorm.multitenancy.CurrentTenant
import grails.gorm.transactions.Transactional
import groovy.util.logging.Slf4j

import org.codehaus.groovy.transform.GroovyASTTransformationClass
import org.grails.datastore.gorm.GormEntity
import org.grails.datastore.mapping.engine.event.DatastoreInitializedEvent
import org.grails.datastore.mapping.engine.event.PreDeleteEvent
import org.olf.licenses.License

@Slf4j
class LicenseService {
  
  OkapiClient okapiClient
  
  boolean canDelete(License license) {
    
    okapiClient.withTenant().canTalk("erm", "")
    
    return false
  }
}
