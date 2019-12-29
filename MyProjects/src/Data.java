

import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;


/**
 * Data defines the various entries in Data Dictionary
 *
 * @param <T> the Java type of the Data
 */
public class Data<T> {

    /**
     * The enumerated form of {@link Data}.
     * This might be used e.g. in switch/case statement.
     * Values are documented in matching {@link Data} constants.
     */
    @SuppressWarnings("javadoc")
    public static enum E {
        SERVICE_KEY, CALLED_PARTY_NUMBER, CALLING_PARTY_NUMBER, CALLING_PARTYS_CATEGORY, CG_ENCOUNTERED, EVENT_TYPE_BCSM,
        IP_SSP_CAPABILITIES, IP_AVAILABLE, LOCATION_NUMBER, ORIGINAL_CALLED_PARTY_ID, EXTENSIONS, HIGH_LAYER_COMPATIBILITY, SERVICE_INTERCATION_INDICATORS,
        SERVICE_INTERCATION_INDICATORS2, ADDITIONAL_CALLING_PARTY_NUMBER, FORWARD_CALL_INDICATORS, BEARER_CAPABILITY, REDIRECTING_PARTY_ID, REDIRECTING_INFORMATION,
        IMSI, SubscriberState, LOCATION_INFORMATION, BASIC_SERVICE_CODE, CALL_REFERENCE_NUMBER, MSC_ADDRESS, CALLED_PARTY_BCD_NUMBER, TIME_AND_ZONE, GSM_FORWARD_PENDING, INITIAL_DP_ARG_EXTENSION,
        DESTINATION_ROUTING_ADDRESS, ALERTING_PATTERN, CORRELATION_ID, CUT_AND_PASTE, ROUTE_LIST, SCIF_ID, GENERIC_NUMBERS, SURPRISE_OF_ANNOUNCEMENT, OCSI_APPLICABLE,
        NA_INFO, BCSM_EVENTS, EVENT_SPECIFIC_INFO_BCSM, LEG_ID, MESSAGE_TYPE, RELEASE_CALL_ARG, ASSISTING_SSPI_ROUTING_ADDRESS, DISCONNECT_FWD_CONN_ARG, PARTY_TO_CHARGE,
        APPLY_CHARGING_REPORT_ARG, A_CH_BILLING_CHARGING_CHARACTERISTICS



    }


    private static final Map<E, Data<?>> _data = new EnumMap<>(E.class);

    /**
     * IDP Service Key
     */
    public static final Data<String> SERVICE_KEY = new Data<>(E.SERVICE_KEY);

//    /**
//     * IDP calledPartyNumber
//     */
//    public static final Data<Address> CALLED_PARTY_NUMBER = new Data<>(E.CALLED_PARTY_NUMBER);
//
//    /**
//     * IDP and CON callingPartyNumber
//     */
//    public static final Data<Address> CALLING_PARTY_NUMBER = new Data<>(E.CALLING_PARTY_NUMBER);

    /**
     * IDP and CON callingPartysCategory
     */
    public static final Data<Integer> CALLING_PARTYS_CATEGORY = new Data<>(E.CALLING_PARTYS_CATEGORY);





    /**
     * The various possible values of IDP cGEncoutered parameter
     */
    public static enum CGEncountered {
        /**
         * manualCGencountered
         */
        MANUAL,
        /**
         * scpOverload
         */
        OVERLOAD
    }

    ;

    /**
     * IDP cGEncountered
     */
    public static final Data<CGEncountered> CG_ENCOUNTERED = new Data<>(E.CG_ENCOUNTERED);

    /**
     * IDP iPSSPCapabilities
     */
    public static final Data<byte[]> IP_SSP_CAPABILITIES = new Data<>(E.IP_SSP_CAPABILITIES);

    /**
     * IDP iPAvailaible
     */
    public static final Data<byte[]> IP_AVAILABLE = new Data<>(E.IP_AVAILABLE);


    /**
     * IDP locationNumber
     */
    public static final Data<String> LOCATION_NUMBER = new Data<>(E.LOCATION_NUMBER);

    /**
     * IDP And Con originalCalledPartyId
     */
    public static final Data<String> ORIGINAL_CALLED_PARTY_ID = new Data<>(E.ORIGINAL_CALLED_PARTY_ID);


    /**
     * IDP Connect
     * RRBE
     * ERB
     * ETC
     * AC
     * EXTENSIONS
     */
    public static final Data<Object> EXTENSIONS = new Data<>(E.EXTENSIONS);

    /**
     * IDP highLayerCompatibility
     */
    public static final Data<byte[]> HIGH_LAYER_COMPATIBILITY = new Data<>(E.HIGH_LAYER_COMPATIBILITY);


    /**
     * IDP
     * Connect
     * ETC
     * serviceInteractionIndicators
     */
    public static final Data<byte[]> SERVICE_INTERCATION_INDICATORS = new Data<>(E.SERVICE_INTERCATION_INDICATORS);


    /**
     * The various possible values of IDP  CONNECT  ETC  serviceInteractionIndicators  parameter
     */
    public static enum SERVICE_INTERCATION_INDICATORS2 {
    }


    /**
     * IDP
     * Connect
     * ETC
     * serviceInteractionIndicators2
     */
    public static final Data<SERVICE_INTERCATION_INDICATORS2> SERVICE_INTERCATION_INDICATORS2 = new Data<>(E.SERVICE_INTERCATION_INDICATORS2);


    /**
     * IDP
     * <p>
     * additionalCallingPartyNumber
     */
    public static final Data<String> ADDITIONAL_CALLING_PARTY_NUMBER = new Data<>(E.ADDITIONAL_CALLING_PARTY_NUMBER);


    /**
     * IDP
     * <p>
     * forwardCallIndicators
     */
    public static final Data<byte[]> FORWARD_CALL_INDICATORS = new Data<>(E.FORWARD_CALL_INDICATORS);


    /**
     * IDP
     * <p>
     * BEARER_CAPABILITY
     */
    public static final Data<byte[]> BEARER_CAPABILITY = new Data<>(E.BEARER_CAPABILITY);


    /**
     * The various possible values of IDP ERB eventTypeBCSM  parameter
     */
    public static enum EVENT_TYPE_BCSM {
    }

    /**
     * IDP
     * ERB
     * <p>
     * eventTypeBCSM
     */
    public static final Data<EVENT_TYPE_BCSM> EVENT_TYPE_BCSM = new Data<>(E.EVENT_TYPE_BCSM);


    /**
     * IDP
     * Connect
     * <p>
     * redirectingPartyID
     */
    public static final Data<String> REDIRECTING_PARTY_ID = new Data<>(E.REDIRECTING_PARTY_ID);


    /**
     * IDP
     * Connect
     * <p>
     * redirectionInformation
     */
    public static final Data<byte[]> REDIRECTING_INFORMATION = new Data<>(E.REDIRECTING_INFORMATION);


    /**
     * IDP
     * imsi
     */
    public static final Data<String> IMSI = new Data<>(E.IMSI);


    /**
     * The various possible values of IDP IMSI  parameter
     */
    public static enum SubscriberState {
    }

    /**
     * IDP
     * subscriberState
     */
    public static final Data<SubscriberState> SubscriberState = new Data<>(E.SubscriberState);


//    /**
//     * IDP
//     * locationInformation
//     */
//
//
//    public static final Data<LocationInformation> LOCATION_INFORMATION= new Data<>(E.LOCATION_INFORMATION);
//
//
//    /**
//     * IDP
//     * locationInformation
//     */
//
//
//    public static final Data<BasicServiceCode[]> BASIC_SERVICE_CODE = new Data<>(E.BASIC_SERVICE_CODE);
//
//
//    /**
//     * IDP
//     * callReferenceNumber
//     */
//    public static final Data<Address> CALL_REFERENCE_NUMBER = new Data<>(E.CALL_REFERENCE_NUMBER);
//
//
//    /**
//     * IDP
//     * mscAddress
//     */
//    public static final Data<Address> MSC_ADDRESS = new Data<>(E.MSC_ADDRESS);
//
//
//    /**
//     * IDP
//     * calledPartyBCDNumber
//     */
//    public static final Data<Address> CALLED_PARTY_BCD_NUMBER = new Data<>(E.CALLED_PARTY_BCD_NUMBER);
//
//
//    /**
//     * IDP
//     * timeAndZone
//     */
//    public static final Data<byte[]> TIME_AND_ZONE = new Data<>(E.TIME_AND_ZONE);
//
//
//    /**
//     * IDP
//     * gsmForwardingPending
//     */
//    public static final Data<Boolean> GSM_FORWARD_PENDING = new Data<>(E.GSM_FORWARD_PENDING);
//
//
//    /**
//     * IDP
//     * initialDPArgExtenson
//     */
//
//
//    public static final Data<InitialDPArgExtension> INITIAL_DP_ARG_EXTENSION = new Data<>(E.INITIAL_DP_ARG_EXTENSION);
//
//
//    /**
//     * CONNECT
//     * destinationRoutingAddress
//     */
//    public static final Data<Address> DESTINATION_ROUTING_ADDRESS = new Data<>(E.DESTINATION_ROUTING_ADDRESS);
//
//
//    /**
//     * CONNECT
//     * alertingPattern
//     */
//    public static final Data<byte[]> ALERTING_PATTERN = new Data<>(E.ALERTING_PATTERN);
//
//
//    /**
//     * CONNECT
//     * ETC
//     * correlationID
//     */
//    public static final Data<byte[]> CORRELATION_ID = new Data<>(E.CORRELATION_ID);
//
//
//    /**
//     * CONNECT
//     * cutAndPaste
//     */
//    public static final Data<int[]> CUT_AND_PASTE = new Data<>(E.CUT_AND_PASTE);
//
//
//    /**
//     * CONNECT
//     * routeList
//     */
//    public static final Data<Address[]> ROUTE_LIST = new Data<>(E.ROUTE_LIST);
//
//    /**
//     * Connect
//     * ETC
//     * scfID
//     */
//    public static final Data<byte[]> SCIF_ID = new Data<>(E.SCIF_ID);
//
//
//    /**
//     * Connect
//     *
//     * genericNumbers
//     */
//    public static final Data<Address[]> GENERIC_NUMBERS = new Data<>(E.GENERIC_NUMBERS);
//
//
//    /**
//     * Connect
//     *
//     * suppressionOfAnnouncement
//     */
//    public static final Data<Boolean> SURPRISE_OF_ANNOUNCEMENT = new Data<>(E.SURPRISE_OF_ANNOUNCEMENT);
//
//
//    /**
//     * Connect
//     *
//     * oCSIApplicable
//     */
//    public static final Data<Boolean> OCSI_APPLICABLE = new Data<>(E.OCSI_APPLICABLE);
//
//    /**
//     * Connect
//     * ETYC
//     *
//     * naInfo
//     */
//    public static final Data<NAInfo> NA_INFO = new Data<>(E.NA_INFO);
//
//    /**
//     * RRBE
//     *
//     * bcsmEvents
//     */
//    public static final Data<BSCMEvents> BCSM_EVENTS = new Data<>(E.BCSM_EVENTS);
//
//
//    /**
//     * ERB
//     *
//     * eventSpecificInfoBCSM
//     */
//    public static final Data<EventSpecificInfoBCSM[]> EVENT_SPECIFIC_INFO_BCSM = new Data<>(E.EVENT_SPECIFIC_INFO_BCSM);
//
//   public static enum LEG_ID{
//
//   }
//
//    /**
//     *
//     * ERB
//     *
//     * legId
//     */
//    public static final Data<LEG_ID> LEG_ID = new Data<>(E.LEG_ID);
//
//
//    public static enum MESSAGE_TYPE{
//
//    }
//
//
//    /**
//     * ERB
//     *
//     * messageType
//     */
//    public static final Data<MESSAGE_TYPE> MESSAGE_TYPE = new Data<>(E.MESSAGE_TYPE);
//
//
//
//    /**
//     * RC
//     *
//     * releaseCallArg
//     */
//    public static final Data<byte[]> RELEASE_CALL_ARG = new Data<>(E.RELEASE_CALL_ARG);
//
//
//
//    /**
//     * ETC
//     *
//     * assistingSSPIPRoutingAddress
//     */
//    public static final Data<Address> ASSISTING_SSPI_ROUTING_ADDRESS = new Data<>(E.ASSISTING_SSPI_ROUTING_ADDRESS);
//
//
//    /**
//     * ERB
//     *
//     * disconnectFwdConnArg
//     */
//    public static final Data<DisconnectFwdConnArg[]> DISCONNECT_FWD_CONN_ARG = new Data<>(E.DISCONNECT_FWD_CONN_ARG);
//
//
//    public static enum PARTY_TO_CHARGE{
//
//    }
//
//
//    /**
//     * AC
//     *
//     * partyToCharge
//     */
//    public static final Data<PARTY_TO_CHARGE> PARTY_TO_CHARGE = new Data<>(E.PARTY_TO_CHARGE);
//
//
//    /**
//     * ACR
//     *
//     * applyChargingReportArg
//     */
//    public static final Data<ApplyChargingReportArg> APPLY_CHARGING_REPORT_ARG = new Data<>(E.APPLY_CHARGING_REPORT_ARG);
//
//
//    /**
//     * AC
//     *
//     * aChBillingChargingCharacteristics
//     */
//    public static final Data<AChBillingChargingCharacteristics> A_CH_BILLING_CHARGING_CHARACTERISTICS = new Data<>(E.A_CH_BILLING_CHARGING_CHARACTERISTICS);



    /**
     * Retrieves the Data object matching enumerated value
     *
     * @param anEnum the enumerated value
     * @return the matching data
     * @throws IllegalArgumentException no Data object matches
     */
    public static Data<?> valueOf(E anEnum) throws IllegalArgumentException {
        Data<?> lData = _data.get(anEnum);
        if (lData == null)
            throw new IllegalArgumentException("Unknown " + Data.class + " object: " + anEnum);
        return lData;
    }

    /**
     * Retrieves the Data object with specified name
     *
     * @param aName the name
     * @return the matching data
     * @throws IllegalArgumentException no Data object matches
     */
    public static Data<?> valueOf(String aName) throws IllegalArgumentException {
        return valueOf(E.valueOf(aName));
    }

    /**
     * Retrieves the set of defined data in enumeration order
     *
     * @return the defined data
     */
    public static Collection<Data<?>> values() {
        return Collections.unmodifiableCollection(_data.values());
    }


    private final E e;

    /**
     * Constructor, made private as all Data shall be defined statically in this class
     *
     * @param anEnum the enumerated value matching this data
     */
    private Data(E anEnum) {
        e = anEnum;
        if (e == null)
            throw new RuntimeException("Cannot build " + Data.class + " object without matching enum value");
        if (_data.put(e, this) != null)
            throw new RuntimeException("Cannot associate 2 " + Data.class + " objects to the same enum value " + e);
    }

    /**
     * Retrieves the enumerated value matching this data
     *
     * @return the data enum value
     */
    public E asEnum() {
        return e;
    }

    /**
     * Retrieves this data name
     *
     * @return the data name
     */
    public String name() {
        return e.name();
    }

    @Override
    public String toString() {
        return e.toString();
    }
}
