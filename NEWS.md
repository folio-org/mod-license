## 1.6.0 2019-06-11
* ERM-245 Tenant bootstrap improvements
  * ERM-247 Change descriptors to reflect new interface version
  * ERM-249 Create bootstrap data
* ERM-154 Set supplementary information for a licence amendment
* ERM-153 Manage core documents for an amendment
* ERM-144 Add note option to license custom properties
* ERM-147 Manage amendments for a license
  * ERM-93 Display amendment to a License
  * ERM-87 Remove amendment from a License
  * ERM-86 Edit amendment to a License
  * ERM-85 Add amendment to a License
* ERM-82 Support amendments for a license
  * ERM-138 Create amendment class
  * ERM-137 Create license abstraction
  * ERM-88 Add Amendment Domain model

## 1.6.0 2019-05-21
 * ERM-219 Support Organizations app as source of Organizations in Licenses
 * ERM-163 View internal contacts for a license
 * ERM-162 Manage internal contacts for a license
   * ERM-178 Save contact records to licenses
   * ERM-177 Add gson templates
   * ERM-176 Clone internal contact from agreements to licenses
 * ERM-92 	Require UUIDs that are RFC 4122 compliant
   * ERM-136 Dump all existing data on test environment
   * ERM-135 Change UUID generator from UUID to UUID-2

## 1.5.0 2019-05-07

 * ERM-166 Remove unwanted extra license section
 * ERM-133 Configure Document Categories
 * ERM-143 Add License / Supplementaty License Information Panel UI
 * ERM-181 Fix data sync issue with GOKb (Resumption Token and Broken Coverage)
 * ERM-139 Convert from SearchAndSort to SearchAndSortQuery
 * ERM-79 Set supplementary informaiton for a license
 * ERM-173 Manage Tags on Agreements
 * ERM-174 Seach Agreements by Tag
 * ERM-194 BUGFIX: Opening edit/create license with only one page does not work


## 1.4.0 2019-04-08 

 * ERM-115 Provide correct data for agreement line
 * ERM-111 Build Settings Page
 * ERM-112 Build Wrapper Component for supression
 * ERM-113 Use Wrapper Component in Agreements
 * ERM-114 Write tests
 * ERM-98 Rendering Controlling Terms License
 * ERM-127 Resources with no coverage set should not display
 * ERM-110 Agreement Detail record - View attached EBSCO eResource
 * ERM-109 Support the ability to create an agreement from eHoldings
 * ERM-108 Supress agreements app functions
 * ERM-64 Show Controlling License Terms

## 1.3.0 2019-03-22
 * ERM-63 View linked agreement details in a license

## 1.2.0 2019-03-12
 * ERM-71 Add Model for JSON resource
 
 * ERM-37 Manage core documents for a license
 * ERM-69 Add DocumentAttachment Domain model
 * ERM-40 Remove a core document from a license
 * ERM-39 Edit license core document details
 * ERM-38 Add core documents to a License
   
 * ERM-7 Add an Organisation to a License 
 * ERM-32 Add organization role validation to license to enforce no more than one Org per license with role:Licensor
 * ERM-25 Copy Organization structure from Agreements to Licenses
 * ERM-10 Remove an Organisation from a License
 * ERM-48 Make sure organizations can be removed from licenses in the backend
 * ERM-9 Change a license organisation's role

## 1.1.1 2019-02-23

 * ERM-1 eResource Managers can manually create licenses
 * ERM-6 Set pre-defined Terms for a License
 * ERM-7 Add an Organisation to a License
 * ERM-8 Add an Organisation to an existing License
 * ERM-10 Remove an Organisation from a License
 * ERM-11 eResource Managers can edit basic license details
 * ERM-12 Filter License Search Results by License Status
 * ERM-13 Filter License Search Results by License Type
 * ERM-16 Set open-ended License Expiry
 * ERM-17 See basic License details in search results
 * ERM-35 Filter Agreement Search Results by Organisation Role

## mod-licenses v1.1.0 released 2018-12-21

 * upgrade web-toolit dependencies, allow for override of DB parameters

## mod-licenses v1.0.1 released 2018-12-04

 * Jenkinsfile bugfix

## mod-licenses v1.0.0 released 2018-12-04 

 * First release allowing licenese titles, custom properties / license terms and tags.
