package org.olf
import org.olf.licenses.License

/**
 * This service checks for existing Local KBs with the title 'LOCAL' and where readonly
 * is not set to TRUE. It sets readonly to TRUE for this RemoteKB.
 */
public class EndDateSemanticsCleanup {

    def checkUnsetValues() {
        log.debug("EndDateSemanticsCleanup: Check for unset values")

          License lic = License.findByEndDateSemanticsIsNull()
          log.debug(lic)
//        RemoteKB kb = RemoteKB.findByName('LOCAL')
//        if (kb) {
//            if (!kb.readonly) {
//                log.debug("Found 'LOCAL' RemoteKB with readonly==false. Setting it to true...")
//                kb.readonly = Boolean.TRUE
//                kb.save(flush:true, failOnError:true)
//            }
//        }
    }

}
