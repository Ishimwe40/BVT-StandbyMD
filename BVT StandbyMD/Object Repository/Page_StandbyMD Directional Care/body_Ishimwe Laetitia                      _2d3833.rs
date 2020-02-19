<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Ishimwe Laetitia                      _2d3833</name>
   <tag></tag>
   <elementGuidId>5bd82416-b26a-43b3-80a9-945e20aaf9ed</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
        





































































    
        
            
                    
                        

                    

            
            

                         Ishimwe, Laetitia 
                        
                            
                        
                        
                        
                Version 4.11.0-beta.109

            
            
                


    /*.red-tooltip + .tooltip > .tooltip-inner {
        background-color: #f00;
        width: 600px;
    }*/
    .tooltip_templates {
        display: none;
    }
    /* Dropdown Button */
    .dropbtn {
        background-color: #08497f;
        color: white;
        padding: 2px 16px 0px 16px; 
        font-size: 16px;
        border: none;
    }

    /* The container &lt;div> - needed to position the dropdown content */
    .dropdown {
        position: relative;
        display: inline-block;
    }

    /* Dropdown Content (Hidden by Default) */
    .dropdown-content {
        display: none;
        position: absolute;
        background-color: #EBF9FF;
        min-width: 160px;
        box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
        z-index: 1;
    }

    /* Links inside the dropdown */
    .dropdown-content a {
        color: black;
        padding: 12px 10px;
        text-decoration: none;
        display: block;
    }

    /* Change color of dropdown links on hover */
        .dropdown-content a:hover {
            background-color: #08497f;
            color: white;
        }

    /* Show the dropdown menu on hover */
    .dropdown:hover .dropdown-content {display: block;}

    /* Change the background color of the dropdown button when the dropdown content is shown */
    .dropdown:hover .dropbtn {
        background-color: #EBF9FF;
        color: black;
    }





    
        
        
            English
            French
            German
            Spanish
        
    

        
            
        


    
        
    


    var started = $('#hdnStarted').val();
    if (started == 1) {
        $('#lngDropdwn').css('display', 'none');
    }
    //debugger;
    //$('#patientImg').tooltipster('content', $(&quot;#tooltip_content&quot;).html());
    
    $('#patientImg').tooltipster({
        theme: 'tooltipster-noir'
    });






            
        


    





    #map {
        width: 100%;
        height: 300px;
        background-color: grey;
    }

    .locationButtons {
        position: absolute;
        bottom: 15px;
        left: 33px;
        margin-left: auto;
        margin-right: auto;
    }

    .controls {
        margin-top: 10px;
        border: 1px solid transparent;
        border-radius: 2px 0 0 2px;
        box-sizing: border-box;
        -moz-box-sizing: border-box;
        height: 32px;
        outline: none;
        box-shadow: 0 2px 6px rgba(0, 0, 0, 0.3);
    }

    #pac-input {
        background-color: #fff;
        font-family: Roboto;
        font-size: 15px;
        font-weight: 300;
        margin-left: 12px;
        padding: 0 11px 0 13px;
        text-overflow: ellipsis;
        width: 300px;
    }










    
        

    

    
        
            
        
        
            
                
            
            
                Male / 31 (12/12/1988)
            
            
                
                     | 
                
            
        
        
            
                

            
        
    



 
/*Menu Patient */

    var menuPatientLoaded = true;

    $(document).ready(function () {
        $('#patientImg').tooltipster({
            theme: 'tooltipster-noir'
        });

        $('#hdLocation').tooltipster({
            theme: 'default',
            animation: 'fade',
            content: ''
        });


        $('#memName').tooltipster({
            theme: 'default',
            animation: 'fade',
            content: ''
        });

        UpdateMemberMenuPatient();

        UpdateDobGenderMenuPatient();

        UpdateLocationMenuPatient();

        UpdateTimeMenuPatient();

    });



    
        
                
                    
                        
                            
                        
                        
                            Demographics
                        
                    
                
                            
                    
                        
                            
                        
                        
                            
                                    
                                        Location
                                    


                            
                        
                    
                
                            
                    
                        
                            
                        
                        
                            Symptoms
                        
                    
                
                                        
                    
                        
                            
                        
                        
                            Related
                        
                    
                
                            
                    
                        
                            
                        
                        
                            Interview
                        
                    
                
                            
                    
                        
                            
                        
                        
                            
                                    
                                        Coordinate
                                    
                            
                        
                    

                
        
    
    

    
    
        
            Contacts
        

        
                
                    
                
        

    
    
        
            Action
        
        
            Type
        
        
            Name
        
        
            Phone
        
       
    
    

        
            
                
                
            

        
    



    var deleteContact = 'Delete Contact';
    var deleteContQuestion = 'Are you sure you want to delete the contact?';
    var message = '';
    var cantaddPatient = 'You can&amp;#x27;t insert another patient. Please verify.';
    var contacts = 'Contacts';


    if (message != '') {
        $.confirm({
            title: contacts,
            content: message,
            buttons: {
                Yes: {
                    text: yes,
                    btnClass: 'btn-info',
                    action: function () {
                        return;
                    }
                }

            }
        });
    }
    //$('.contactType').tooltipster({
    //    theme: 'tooltipster-noir',
    //    contentAsHTML: true
    //});

    
        
    



    $(document).ready(function() {
        LoadContacts('');
    });


        
            
                
                    
                        
                            
                            Map DataMap data ©2020 GoogleMap DataMap data ©2020 GoogleMap data ©2020 GoogleTerms of UseReport a map errorMapTerrainSatelliteLabels

                            
                                function initAutocomplete() {
                                    var map = new google.maps.Map(document.getElementById('map'),
                                        {
                                            center: { lat: 45.398837, lng: -71.901594 },
                                            zoom: 13,
                                            mapTypeId: 'roadmap'
                                        });

                                    // Create the search box and link it to the UI element.
                                    //var input = $(
                                    //    '&lt;input id=&quot;pac-input&quot; class=&quot;controls&quot; type=&quot;text&quot; placeholder=&quot;Enter Address&quot; style=&quot;height:31px margin-left: 15px;margin-top:12px&quot;>')
                                    //[0];

                                    var input = document.getElementById('pac-input');

                                    searchBox = new google.maps.places.SearchBox(input);
                                    map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);

                                    // Bias the SearchBox results towards current map's viewport.
                                    map.addListener('bounds_changed',
                                        function() {
                                            searchBox.setBounds(map.getBounds());
                                        });

                                    var markers = [];
                                    // Listen for the event fired when the user selects a prediction and retrieve
                                    // more details for that place.
                                    searchBox.addListener('places_changed',
                                        function() {

                                            var places = searchBox.getPlaces();

                                            if (places.length == 0) {
                                                return;
                                            }

                                            // Clear out the old markers.
                                            markers.forEach(function(marker) {
                                                marker.setMap(null);
                                            });
                                            markers = [];

                                            // For each place, get the icon, name and location.
                                            var bounds = new google.maps.LatLngBounds();
                                            places.forEach(function(place) {
                                                if (!place.geometry) {
                                                    console.log(&quot;Returned place contains no geometry&quot;);
                                                    return;
                                                }
                                                var icon = {
                                                    url: place.icon,
                                                    size: new google.maps.Size(71, 71),
                                                    origin: new google.maps.Point(0, 0),
                                                    anchor: new google.maps.Point(17, 34),
                                                    scaledSize: new google.maps.Size(25, 25)
                                                };

                                                // Create a marker for each place.
                                                markers.push(new google.maps.Marker({
                                                    map: map,
                                                    icon: icon,
                                                    title: place.name,
                                                    position: place.geometry.location
                                                }));

                                                if (place.geometry.viewport) {
                                                    // Only geocodes have viewport.
                                                    bounds.union(place.geometry.viewport);
                                                } else {
                                                    bounds.extend(place.geometry.location);
                                                }
                                            });
                                            map.fitBounds(bounds);
                                        });
                                }

                            
                        

                        
                    
                    
                        
                            Next
                        
                    
                
            

        
    



    var arrSynonym = [];
    var claim = 'SBMD202002110826';
    var validAddress = 'Please enter a valid address';
    var autononomousError = 'Searches by autonomous regions are not permitted. Please enter a complete address to proceed.';
    var locationMenu = 'Location';
    var errorOutsideUSA = 'You can&amp;#x27;t select locations outside the United States';
    var cantSelectLocation = 'You can&amp;#x27;t select locations within &amp;lt;country&amp;gt;';

    var addressCantProcess = 'The request can&amp;#x27;t be processed, please enter a different address.';

    $(document).ready(function () {
        
        
        $('#hdnFacIdent').val(claim);
        GetSynonyms();
       
        $('#locationNextStep').bind('click', LoadPredefined);
        ClearHeader();

    });





    $(document).ready(function() {
        ShowAnimation('bodymovin', '/animation/home_main.json');

        //$('#btnYesEmer').bind('click', LoadEmergencyTriage);
        $('#btnYesEmer').on('click', LoadEmergencyTriage);
        //$('#btnNoEmer').bind('click', LoadIsDisclaimer);
        $('#btnNoEmer').on('click', LoadIsDisclaimer);
    });










    .rowSpaceMemDet {
        margin-bottom: 5px;
    }




    
        

             Member Details 
        

        
            
                
                    
                        Member
                    
                    
                        
                    
                
                
                    
                        Organization
                    
                    
                        
C&amp;F Services (TII)
Lloyd's
Manulife
Orion
Other
STARR – Canada
STARR – US

                    
                
                
                    
                        Sub Org
                    
                    
                        
                    
                
                
                    
                        Policy #
                    
                    
                        
                    
                
                
                    
                        Case #
                    
                    
                        
                    
                
                    
                        
                            Phone
                        
                        
                            
                        
                    

                    
                        
                            Email
                        
                        
                            
                        
                    

            
        
        
        
            
                    Skip
                Save
            

        
    



    var completeOrgSubOrg = 'Please complete Organization and Suborganization';

    var subOrg = -1;
    var org = 0;
    $(document).ready(function () {
        $(&quot;input[data-val-length-max]&quot;).each(function (index, element) {
            var length = parseInt($(this).attr(&quot;data-val-length-max&quot;));
            $(this).prop(&quot;maxlength&quot;, length);
        });
        $(&quot;#Phone&quot;).prop('maxlength', 19);

        $(&quot;#Phone&quot;).keypress(function(e){
            var keyCode = e.which;
            /*
              8 - (backspace)
              32 - (space)
              48-57 - (0-9)Numbers
            */
            
            if ( (keyCode != 8 || keyCode ==32 ) &amp;&amp; (keyCode &lt; 48 || keyCode > 57) &amp;&amp; keyCode !== 46 &amp;&amp; keyCode !== 40 &amp;&amp; keyCode !== 41 &amp;&amp; keyCode !== 45) { 
                return false;
            }
        });
        $(&quot;#Member&quot;).keydown(function (event) {
            if (event.ctrlKey==true &amp;&amp; (event.which == '118' || event.which == '86')) {
                event.preventDefault();
            }
        });

        $(&quot;#Member&quot;).prop('maxlength', 70);
        $('#Member').on('keypress', function(e) {
            var regex = new RegExp(&quot;^[a-zA-Z ]*$&quot;);
            var str = String.fromCharCode(!e.charCode ? e.which : e.charCode);
            if (regex.test(str)) {
                return true;
            }
            e.preventDefault();
            return false;
        });

        $(&quot;#Phone&quot;).keydown(function (event) {
            if (event.ctrlKey==true &amp;&amp; (event.which == '118' || event.which == '86')) {
                event.preventDefault();
            }
        });


        $('#Organization').bind('change', LoadSubOrgs);
        $(&quot;#btnSkip&quot;).bind('click', LoadMainTriage);

        if (subOrg > -1 || org > -1) {
            LoadSubOrgs();
        }

    });















    var actionGetIsEmergency = '/en-US/Home/GetIsEmergency';
    var actionGetDisclaimerApproval = '/en-US/Home/GetDisclaimerApproval';
    var actionGetMainTriage = '/en-US/Home/GetMainTriage';
    var actionGetLocation= '/en-US/Home/GetLocation';
    var actionGetSymptoms = '/en-US/Home/GetSymptoms';

    var actionUpdateLogLocation = '/en-US/Home/UpdateLogLocation';

    var actionGetSymptomsText = '/en-US/Home/GetSymptomsText';
    var actionGetCoordination = '/en-US/Home/GetCoordination';
    var actionGetContacts = '/en-US/Home/GetContacts';
    var actionSaveNotes = '/en-US/Home/SaveNote';
    var actionGetEmergencyTriage = '/en-US/Home/GetEmergencyTriage';
    var actionGetEmergencyCoordination = '/en-US/Home/GetEmergencyCoordination';
    var actionGetFacilityCoordination = '/en-US/Home/GetFacilityCoordination';
    var actionBackToPredefinedConditions = '/en-US/Home/BackToPredefinedConditions';
    var actionGetFinalPreview = '/en-US/Home/GetFinalPreview';
    var actionSearchClaim = '/en-US/Home/SearchClaim';

    var actionGetAddContact = '/en-US/Home/GetAddContact';
    var actionAddContact = '/en-US/Home/AddUpdateContact';
    var actionRemoveContact = '/en-US/Home/RemoveContact';

    var actionGetTerms = '/en-US/Home/GetTerms';
    var actionStoreSelectedTerms = '/en-US/Home/StoreSelectedTerms';

    var actionGetSymptomsTerms = '/en-US/Home/GetSymptomsTerms';
    var actionDeleteSelectedTerm = '/en-US/Home/DeleteSelectedTerm';
    var actionIndex = '/';
    var actionAllowedToAddPatient = '/en-US/Home/AllowedToAddPatient';
    var actionHouseCallCoordination= '/en-US/Home/HouseCallCoordination';
    var actionFacilityCoordination= '/en-US/Home/FacilityCoordination';
    var actionGetUpdateLocation = '/en-US/Home/GetUpdateLocation';
    var actionUpdateLocation = '/en-US/Home/UpdateLocation';
    var actionSubmit = '/en-US/Home/Submit';
    var actionSaveTelemedicineCoordination = '/en-US/Home/SaveTelemedicineCoordination';
    var actionAddPharmaContact = '/en-US/Home/AddPharmaContact';
    var actionAddVendorContact = '/en-US/Home/AddVendorContact';
    var actionAddHouseCallContact = '/en-US/Home/AddHouseCallContact';
    var actionAddFacilityContact = '/en-US/Home/AddFacilityContact';
    var actionGetSubOrgs = '/en-US/Home/GetSubOrgs';
    var actionGetCurrentTime = '/en-US/Home/GetZonedTime';
    var actionGetStates = '/en-US/Home/GetStates';
    var actionGetCities = '/en-US/Home/GetCities';
    var actionGetJsonZonedTime = '/en-US/Home/GetJsonZonedTime';
    var actionUpdateAddressLocation = '/en-US/Home/UpdateAddressLocation';
    var actionGetSynonyms = '/en-US/Home/GetSynonyms';

    var actionExistsEmailFax = '/en-US/Home/ExistsEmailFax';
    var actionBackToEmergencyCoordination = '/en-US/Home/BackToEmergencyCoordination';
    var actionGetJsonLtLnTime = '/en-US/Home/GetJsonLtLnTime';
    var actionReOrderLocations = '/en-US/Home/ReOrderLocations';
    var actionRefreshFacility = '/en-US/Home/RefreshFacility';
    var actionReportBug = '/en-US/Home/ReportBug';
    var actionSearchLinkClaim = '/en-US/Home/SearchLinkClaim';
    var actionSearchLinkClaimDetail = '/en-US/Home/SearchLinkClaimDetail';
    var actionShowLinkClaim= '/en-US/Home/ShowLinkClaim';
    var actionSendBug = '/en-US/Home/SendBug';
    var actionLinkClaimFinal= '/en-US/Home/LinkClaimFinal';
    var actionSearchClaimMemberData = '/en-US/Home/SearchClaimMemberData';
    var actionShowHeader = '/en-US/Home/ShowHeader';
    var actionGetHouseVisitAddress = '/en-US/Home/GetHouseVisitAddress';
    var actionGetPatientAddressHouseCall = '/en-US/Home/GetPatientAddressHouseCall';
    var actionValidatePatientAddressHouseCall = '/en-US/Home/ValidatePatientAddressHouseCall';
    var actionUpdatePatientAddressHouseCall = '/en-US/Home/UpdatePatientAddressHouseCall';
    var actionLoadPharma = '/en-US/Home/LoadPharma';
    var actionGetFacilities = '/en-US/Home/GetFacilities';
    var actionRefreshCoordination = '/en-US/Home/RefreshCoordination';
    var actionAuthorizedCountriesPerRole = '/en-US/Home/AuthorizedCountriesPerRole';
    var actionGetMemberDetails = '/en-US/Home/GetMemberDetails';
    var actionSaveMemberDetails = '/en-US/Home/SaveMemberDetails';
    var actionCleanMemberData = '/en-US/Home/CleanMemberData';
    var actionSignOut = '/en-US/Home/SignOut';
    var actionGetCareDeclined = '/en-US/Home/GetCareDeclined';
    var actionCareDecline = '/en-US/Home/CareDecline';
    var actionPharmacyLinkClicked = '/en-US/Home/PharmacyLinkClicked';
    var actionClearSymptomsTerm = '/en-US/Home/ClearSymptomsTerm';
    var actionOpenCitySearch = '/en-US/Home/OpenCitySearch';
    var actionCitySearch = '/en-US/Home/CitySearch';
    var actionCheckACMOrganization = '/en-US/Home/CheckACMOrganization';
    var actionCheckACMMemberDetails = '/en-US/Home/CheckACMMemberDetails';
    var actionGetTimeUntilExpiration = '/en-US/Home/GetTimeUntilExpiration';
    var actionExtendSession = '/en-US/Home/ExtendSession';
    var actionCleanFinalCache = '/en-US/Home/CleanFinalCache';

    var actionGetCacheTerms = '/en-US/Home/GetCacheTerms';


    var actionRemoveDeclinedFlag = '/en-US/Home/RemoveDeclinedFlag';
    var actionCheckMemberDetails = '/en-US/Home/CheckMemberDetails';
    var actionReportTwo = '/en-US/Report/VCardPageTwo';
    var actionReportOne = '/en-US/Report/VCardPageOne';
    var actionClientSummary = '/en-US/Home/ClientSummary';
    var actionPartialClientSummary = '/en-US/Home/PartialClientSummary';
    var actionUpdateClientSummaryContact = '/en-US/Home/UpdateClientSummaryContact';
    var actionPossibleCauses = '/en-US/Home/GetPossibleCauses';
    var actionPossibleCausesDetails = '/en-US/Home/GetPossibleCausesDetails';
    var actionGetHeaderData = '/en-US/Home/GetHeaderData';
    var actionPreLoadTerms = '/en-US/Home/PreLoadTerms';
    var actionFullReport = '/en-US/Report/FullReport';
    var actionCheckHVAvailability = '/en-US/Home/CheckHVAvailability';
    var actionGetResend = '/en-US/Home/GetResend';
    var actionResend= '/en-US/Home/Resend';
    var actionGetTelemedicineScript = '/en-US/Home/GetTelemedicineScript';
    var actionCustomizableTelemedicineValidation = '/en-US/Home/CustomizableTelemedicineValidation'
    var actionGetAdministrationUrl = '/en-US/Home/GetAdministrationUrl';
    var actionGetAdministrationLevel = '/en-US/Home/GetAdministrationLevel';
    var actionGetAgeRiskFactors = '/en-US/Home/GetAgeRiskFactors';
    var actionGetSelectableSymptoms = '/en-US/Home/GetSelectableSymptoms';
    var actionGetRedFlags = '/en-US/Home/GetRedFlagsView';
    var actionGetReportedLine = '/en-US/Home/GetReportedLine';
    var actionGetRelated = '/en-US/Home/GetRelated';
    var actionSaveRelatedGetInterviewMain = '/en-US/Home/SaveRelatedGetInterviewMain';
    var actionGetInterviewProcessQuestions = '/en-US/Home/GetInterviewProcessQuestions';
    var actionGetQuestionByOrder = '/en-US/Home/GetQuestionByOrder';
    var actionShowDisclaimer = '/en-US/Home/ShowDisclaimer';
    var actionGetFlagFacility = '/en-US/Home/GetFlagFacility';

    var actionConfirmFlagFacility = '/en-US/Home/ConfirmFlagFacility';
    var actionGetTelemedicineAvailable = '/en-US/Home/GetTelemedicineAvailable';
    var actionGetPreCoordination = '/en-US/Home/GetPreCoordination';
    var actionGetTelemedicineDeclined = '/en-US/Home/GetTelemedicineDeclined';
    var actionTelemedicineDecline = '/en-US/Home/TelemedicineDecline';
    var actionGetPossibleConditions = '/en-US/Home/GetPossibleConditions';
    var actionGetPreSubmit = '/en-US/Home/GetPreSubmit';
    var actionSetTriageDateAndTime = '/en-US/Home/SetTriageDateAndTime';
    var actionGetCareDeclinedSubOptions = '/en-US/Home/GetCareDeclinedSubOptions';
    var actionUpdateScreenResolution = '/en-US/Home/UpdateScreenResolution';
    var actionEndSession= '/en-US/Home/EndSession';


    var searchBox;
    var tryAgain = 'Try Again!';
    var systemError = 'Click OK and try again, if the issue persists please report the issue.';
    var opNotAuth = 'Operation not authorized';
    var cancelSession = 'Cancel Session';
    var cancelSessionQuestion = 'Are you sure you wish to cancel this triage? All data will be lost.';
    var completeAllFields = 'Please complete all the fields';
    var linkClaim = 'Link Claim';
    var claimLinkSuccesful = 'The claim was linked succesfully';

    var sessionAboutExpire = 'Session is about to expire';
    var wishSessionExtension = 'Do you want to extend the session?';
    var yes = 'Yes';
    var no = 'No';
    var sessionExtended = 'Session extended';
    var version = '4.11.0-beta.109';
    var status = '0';


    var memberDetails = 'Member Details';
    var subOrgMandatory = 'Please complete all member detail fields in order to continue';
    var isAdmin = 'False'; //hay que mostrar u ocultar btnSubmit segun corresponda
    var isDebug = 'False'; //hay que mostrar u ocultar btnSubmit segun corresponda



    var menuPatient = {
        Member: '',
        Age: '',
        Dob: '',
        Gender: '',
        Location: {
            FullAddress: '',
            City: '',
            State: '',
            Time: ''
        }
    };
    var pregnantRiskId = '' ;
    var postPartumRiskId = '';

    $(document).ready(function () {

        GetCacheTerms();
        $('#hdnStarted').val(0);
        $('#lblVersion').html('Version ' + version);

        var admin = (/true/i).test(isAdmin);
        if (admin) {
            $('#btnSubmit').css('display', 'inline-block');
        } else {
            $('#btnSubmit').css('display', 'none');
        }


        var $debug = (/true/i).test(isDebug);

        if ($debug) {
            $('#divDebugAddressAndDate').css('display', 'block');
            var today = new Date(new Date().getFullYear(), new Date().getMonth(), new Date().getDate());
            debugger;
            $('#triageDateAndTime').datetimepicker({
                format:'mm/dd/yyyy HH:MM'
            });
        } else {
            $('#divDebugAddressAndDate').css('display', 'none');
        }


        window.onbeforeunload = function() {
            //alert('closing');
            //return false;
            debugger;
            EndSession();
            //if we return nothing here (just calling return;) then there will be no pop-up question at all
            //return;
        };

        setInterval(UpdateHeaderTimeZone, 60000);

        setInterval(checkTimeoutSession, 60000);


        var isMobile = false; //initiate as false
        // device detection
        if (/(android|bb\d+|meego).+mobile|avantgo|bada\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|ipad|iris|kindle|Android|Silk|lge |maemo|midp|mmp|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino/i.test(navigator.userAgent)
            || /1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\-(n|u)|c55\/|capi|ccwa|cdm\-|cell|chtm|cldc|cmd\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\-s|devi|dica|dmob|do(c|p)o|ds(12|\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\-|_)|g1 u|g560|gene|gf\-5|g\-mo|go(\.w|od)|gr(ad|un)|haie|hcit|hd\-(m|p|t)|hei\-|hi(pt|ta)|hp( i|ip)|hs\-c|ht(c(\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\-(20|go|ma)|i230|iac( |\-|\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\/)|klon|kpt |kwc\-|kyo(c|k)|le(no|xi)|lg( g|\/(k|l|u)|50|54|\-[a-w])|libw|lynx|m1\-w|m3ga|m50\/|ma(te|ui|xo)|mc(01|21|ca)|m\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\-2|po(ck|rt|se)|prox|psio|pt\-g|qa\-a|qc(07|12|21|32|60|\-[2-7]|i\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\-|oo|p\-)|sdk\/|se(c(\-|0|1)|47|mc|nd|ri)|sgh\-|shar|sie(\-|m)|sk\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\-|v\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\-|tdg\-|tel(i|m)|tim\-|t\-mo|to(pl|sh)|ts(70|m\-|m3|m5)|tx\-9|up(\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\-|your|zeto|zte\-/i.test(navigator.userAgent.substr(0, 4))) {
            isMobile = true;
        }
        if (isMobile) {
            $('#divMainDesktop').css('display', 'none');
            $('#divMainMobile').css('display', 'block');

        } else {


            LoadHeader('');

            $(&quot;#ClaimNumber&quot;).keydown(function (e) {
                // Allow: backspace, delete, tab, escape, enter and .
                if ($.inArray(e.keyCode, [46, 8, 9, 27, 13]) !== -1 ||
                    // Allow: home, end, left, right, down, up
                    (e.keyCode >= 35 &amp;&amp; e.keyCode &lt;= 40)) {
                    // let it happen, don't do anything
                    return;
                }
                // Ensure that it is a number and stop the keypress
                if ((e.shiftKey || (e.keyCode &lt; 48 || e.keyCode > 57)) &amp;&amp; (e.keyCode &lt; 96 || e.keyCode > 105)) {
                    e.preventDefault();
                }
            });


            $('#ClaimNumber').keypress(function (e) {
                if (e.which == 13) {
                    searchClaim();
                }
            });

            if (status == 20) {
                $('#divTopHeader').html('');
            }
        }


        if (window.appInsights.queue != undefined) {
            window.appInsights.queue.push(function () {

                var userName = 'acm3@globalexcel.com';

                appInsights.context.user.authenticatedId = userName;
                appInsights.context.user.accountId = userName;
                appInsights.context.user.id = userName;
            });

        }

        var $height = $(window).height();
        var $width = $(window).width();


        UpdateScreenResolution('31299', $height, $width);

    });
    function logout() {
        window.location = actionSignOut;
    }



        
            
                
                    Triage Date and time:
                
                
                    
                
            
            
                
                
                    
                
                
            

        

        
        
    

    








    var logOut = 'Log out';
    var logoutQuestion = 'Are you sure you want to log out?';
    var yes = 'Yes';
    var no = 'No';
    $('#logout').tooltipster({
        theme: 'tooltipster-noir'
    });

    $('#reportError').tooltipster({
        theme: 'tooltipster-noir'
    });
    GetAdministrationLevel();


    function ValidateLogout() {
        $.confirm({
            title: logOut,
            content: logoutQuestion,
            buttons: {
                Yes: {
                    text: yes,
                    btnClass: 'btn-success',
                    action: function () {
                        window.location = actionSignOut;

                    }
                },
                No: {
                    text: no,
                    btnClass: 'btn-danger',
                    action: function () {
                        return;
                    }
                }
            }
        });
        return false;
    }

/html[1]/body[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>
