// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;


/** \ingroup ModSecurity_CPP_API */
@Namespace("modsecurity") @NoOffset @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class Transaction extends TransactionAnchoredVariables {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Transaction(Pointer p) { super(p); }
    public TransactionSecMarkerManagement asTransactionSecMarkerManagement() { return asTransactionSecMarkerManagement(this); }
    @Namespace public static native @Name("static_cast<modsecurity::TransactionSecMarkerManagement*>") TransactionSecMarkerManagement asTransactionSecMarkerManagement(Transaction pointer);

    public Transaction(ModSecurity transaction, RulesSet rules, Pointer logCbData) { super((Pointer)null); allocate(transaction, rules, logCbData); }
    private native void allocate(ModSecurity transaction, RulesSet rules, Pointer logCbData);
    public Transaction(ModSecurity transaction, RulesSet rules, @Cast("char*") BytePointer id,
            Pointer logCbData) { super((Pointer)null); allocate(transaction, rules, id, logCbData); }
    private native void allocate(ModSecurity transaction, RulesSet rules, @Cast("char*") BytePointer id,
            Pointer logCbData);
    public Transaction(ModSecurity transaction, RulesSet rules, @Cast("char*") ByteBuffer id,
            Pointer logCbData) { super((Pointer)null); allocate(transaction, rules, id, logCbData); }
    private native void allocate(ModSecurity transaction, RulesSet rules, @Cast("char*") ByteBuffer id,
            Pointer logCbData);
    public Transaction(ModSecurity transaction, RulesSet rules, @Cast("char*") byte[] id,
            Pointer logCbData) { super((Pointer)null); allocate(transaction, rules, id, logCbData); }
    private native void allocate(ModSecurity transaction, RulesSet rules, @Cast("char*") byte[] id,
            Pointer logCbData);

    
    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Transaction b);
    

    /** TODO: Should be an structure that fits an IP address */
    public native int processConnection(@Cast("const char*") BytePointer client, int cPort,
            @Cast("const char*") BytePointer server, int sPort);
    public native int processConnection(String client, int cPort,
            String server, int sPort);
    public native int processURI(@Cast("const char*") BytePointer uri, @Cast("const char*") BytePointer protocol,
            @Cast("const char*") BytePointer http_version);
    public native int processURI(String uri, String protocol,
            String http_version);

    /**
     * Types of request body that ModSecurity may give a special treatment
     * for the data.
     */
    /** enum modsecurity::Transaction::RequestBodyType */
    public static final int
      /**
       *
       */
      UnknownFormat = 0,
      /**
       *
       */
      MultiPartRequestBody = 1,
      /**
       *
       */
      WWWFormUrlEncoded = 2,
      /**
       *
       */
      JSONRequestBody = 3,
      /**
       *
       */
      XMLRequestBody = 4;

    public native int processRequestHeaders();
    public native int addRequestHeader(@StdString BytePointer key, @StdString BytePointer value);
    public native int addRequestHeader(@StdString String key, @StdString String value);
    public native int addRequestHeader(@Cast("const unsigned char*") ByteBuffer key, @Cast("const unsigned char*") ByteBuffer value);
    public native int addRequestHeader(@Cast("const unsigned char*") byte[] key, @Cast("const unsigned char*") byte[] value);
    public native int addRequestHeader(@Cast("const unsigned char*") BytePointer key, @Cast("size_t") long len_key,
            @Cast("const unsigned char*") BytePointer value, @Cast("size_t") long len_value);
    public native int addRequestHeader(@Cast("const unsigned char*") ByteBuffer key, @Cast("size_t") long len_key,
            @Cast("const unsigned char*") ByteBuffer value, @Cast("size_t") long len_value);
    public native int addRequestHeader(@Cast("const unsigned char*") byte[] key, @Cast("size_t") long len_key,
            @Cast("const unsigned char*") byte[] value, @Cast("size_t") long len_value);

    public native int processRequestBody();
    public native int appendRequestBody(@Cast("const unsigned char*") BytePointer body, @Cast("size_t") long size);
    public native int appendRequestBody(@Cast("const unsigned char*") ByteBuffer body, @Cast("size_t") long size);
    public native int appendRequestBody(@Cast("const unsigned char*") byte[] body, @Cast("size_t") long size);
    public native int requestBodyFromFile(@Cast("const char*") BytePointer path);
    public native int requestBodyFromFile(String path);

    public native int processResponseHeaders(int code, @StdString BytePointer proto);
    public native int processResponseHeaders(int code, @StdString String proto);
    public native int addResponseHeader(@StdString BytePointer key, @StdString BytePointer value);
    public native int addResponseHeader(@StdString String key, @StdString String value);
    public native int addResponseHeader(@Cast("const unsigned char*") ByteBuffer key, @Cast("const unsigned char*") ByteBuffer value);
    public native int addResponseHeader(@Cast("const unsigned char*") byte[] key, @Cast("const unsigned char*") byte[] value);
    public native int addResponseHeader(@Cast("const unsigned char*") BytePointer key, @Cast("size_t") long len_key,
            @Cast("const unsigned char*") BytePointer value, @Cast("size_t") long len_value);
    public native int addResponseHeader(@Cast("const unsigned char*") ByteBuffer key, @Cast("size_t") long len_key,
            @Cast("const unsigned char*") ByteBuffer value, @Cast("size_t") long len_value);
    public native int addResponseHeader(@Cast("const unsigned char*") byte[] key, @Cast("size_t") long len_key,
            @Cast("const unsigned char*") byte[] value, @Cast("size_t") long len_value);

    public native int processResponseBody();
    public native int appendResponseBody(@Cast("const unsigned char*") BytePointer body, @Cast("size_t") long size);
    public native int appendResponseBody(@Cast("const unsigned char*") ByteBuffer body, @Cast("size_t") long size);
    public native int appendResponseBody(@Cast("const unsigned char*") byte[] body, @Cast("size_t") long size);

    public native int processLogging();
    public native int updateStatusCode(int status);

    public native @Cast("bool") boolean intervention(ModSecurityIntervention it);

    public native @Cast("bool") boolean addArgument(@StdString BytePointer orig, @StdString BytePointer key,
            @StdString BytePointer value, @Cast("size_t") long offset);
    public native @Cast("bool") boolean addArgument(@StdString String orig, @StdString String key,
            @StdString String value, @Cast("size_t") long offset);
    public native @Cast("bool") boolean extractArguments(@StdString BytePointer orig, @StdString BytePointer buf,
            @Cast("size_t") long offset);
    public native @Cast("bool") boolean extractArguments(@StdString String orig, @StdString String buf,
            @Cast("size_t") long offset);

    public native @Cast("const char*") BytePointer getResponseBody();
    public native @Cast("size_t") long getResponseBodyLength();
    public native @Cast("size_t") long getRequestBodyLength();

// #ifndef NO_LOGS
    public native void debug(int arg0, @StdString BytePointer arg1);
    public native void debug(int arg0, @StdString String arg1);
// #endif
    public native void serverLog(@SharedPtr RuleMessage rm);

    public native int getRuleEngineState();

    public native @StdString BytePointer toJSON(int parts);
    public native @StdString BytePointer toOldAuditLogFormat(int parts, @StdString BytePointer trailer);
    public native @StdString String toOldAuditLogFormat(int parts, @StdString String trailer);
    public native @StdString BytePointer toOldAuditLogFormatIndex(@StdString BytePointer filename,
            double size, @StdString BytePointer md5);
    public native @StdString String toOldAuditLogFormatIndex(@StdString String filename,
            double size, @StdString String md5);

    /**
     * Filled during the class instantiation, this variable can be later
     * used to fill the SecRule variable {@code duration'. The variable }duration'
     * is dynamic calculated, it is always relative to the value found in
     * m_creationTimeStamp.
     *
     * \note There is space for performance improvement. This value don't
	 *       need to be filled if there is no rule using the variable
	 *       {@code duration'.
     */

    /**
     * Holds the client IP address.
     */

    /**
     * Holds the HTTP version: 1.2, 2.0, 3.0 and so on....
     */
    public native @StdString BytePointer m_httpVersion(); public native Transaction m_httpVersion(BytePointer setter);

    /**
     * Holds the server IP Address
     */

    /**
     * Holds the raw URI that was requested.
     */
    public native @StdString BytePointer m_uri(); public native Transaction m_uri(BytePointer setter);

    /**
     * Holds the URI that was requests (without the query string).
     */

    /**
     * Holds the combined size of all arguments, later used to fill the
     * variable  ARGS_COMBINED_SIZE.
     */
    public native double m_ARGScombinedSizeDouble(); public native Transaction m_ARGScombinedSizeDouble(double setter);

    /**
     * Client tcp port.
     */
    public native int m_clientPort(); public native Transaction m_clientPort(int setter);

    /**
     * This variable is set by the action {@code severity' and later can be
     * consulted via the SecLanguage variable HIGHEST_SEVERITY.
     */
    public native int m_highestSeverityAction(); public native Transaction m_highestSeverityAction(int setter);

    /**
     * Holds the HTTP return code when it is known. If 0 nothing was
	 * set.
     */
    public native int m_httpCodeReturned(); public native Transaction m_httpCodeReturned(int setter);

    /**
     * Holds the server port.
     */
    public native int m_serverPort(); public native Transaction m_serverPort(int setter);

    /**
     * ModSecurity instance used to start this transaction. Basically used
     * to fill the server log whenever is needed.
     */
    public native ModSecurity m_ms(); public native Transaction m_ms(ModSecurity setter);

    /**
     * Holds the type of the request body, in case there is one.
     */
    public native @Cast("modsecurity::Transaction::RequestBodyType") int m_requestBodyType(); public native Transaction m_requestBodyType(int setter);

    /**
     * Holds the request body "processor"
     */
    public native @Cast("modsecurity::Transaction::RequestBodyType") int m_requestBodyProcessor(); public native Transaction m_requestBodyProcessor(int setter);

    /**
     * Rules object utilized during this specific transaction.
     */
    public native RulesSet m_rules(); public native Transaction m_rules(RulesSet setter);

    /**
     *
     */

    /**
     *
     */
    public native @ByRef StringList m_ruleRemoveByTag(); public native Transaction m_ruleRemoveByTag(StringList setter);

    /**
     *
     */

    /**
     *
     */

    /**
     *
     */
    public native int m_requestBodyAccess(); public native Transaction m_requestBodyAccess(int setter);

    /**
     * The list m_auditLogModifier contains modifications to the {@code auditlogs'
     * for this specific request, those modifications can happens via the
     * utilization of the action: }ctl:auditLogParts='
     *
     */

    /**
     * This variable holds all the messages asked to be save by the utilization
     * of the actions: {@code log_data' and }msg'. These should be included on the
     * auditlogs.
     */
    public native @ByRef RuleMessageList m_rulesMessages(); public native Transaction m_rulesMessages(RuleMessageList setter);

    /**
     * Holds the request body, in case of any.
     */

    /**
     * Holds the response body, in case of any.
     */

    /**
     * Contains the unique ID of the transaction. Use by the variable
	 * {@code UNIQUE_ID'. This unique id is also saved as part of the AuditLog.
     */

    /**
     * Holds the amount of rules that should be skipped. If bigger than 0 the
     * current rule should be skipped and the number needs to be decreased.
     */
    public native int m_skip_next(); public native Transaction m_skip_next(int setter);

    /**
     * If allow action was utilized, this variable holds the allow type.
     */
    public native @Cast("modsecurity::actions::disruptive::AllowType") int m_allowType(); public native Transaction m_allowType(int setter);

    /**
     * Holds the decode URI. Notice that m_uri holds the raw version
     * of the URI.
     */
    public native @StdString BytePointer m_uri_decoded(); public native Transaction m_uri_decoded(BytePointer setter);

    /**
     * Actions (disruptive?) that should be taken by the connector related to
     * that transaction.
     */
    public native @StdVector ModSecurityIntervention m_actions(); public native Transaction m_actions(ModSecurityIntervention setter);
    public native @ByRef ModSecurityIntervention m_it(); public native Transaction m_it(ModSecurityIntervention setter);

    /**
     * Holds the creation time stamp, using std::time.
     *
     * TODO: m_timeStamp and m_creationTimeStamp may be merged into a single
     *       variable.
     */
    public native @ByRef @Cast("time_t*") Pointer m_timeStamp(); public native Transaction m_timeStamp(Pointer setter);


    /**
     * Holds all the collections related to that transaction.
     */

    /**
     * Holds the whatever matched in the operation utilization.
     * That variable will be further used by the capture action.
     *
     */
    public native @ByRef StringList m_matched(); public native Transaction m_matched(StringList setter);

    public native XML m_xml(); public native Transaction m_xml(XML setter);
    public native JSON m_json(); public native Transaction m_json(JSON setter);

    public native int m_secRuleEngine(); public native Transaction m_secRuleEngine(int setter);

    public native @StdString BytePointer m_variableDuration(); public native Transaction m_variableDuration(BytePointer setter);
    public native @StdString BytePointer m_variableHighestSeverityAction(); public native Transaction m_variableHighestSeverityAction(BytePointer setter);
    public native @StdString BytePointer m_variableRemoteUser(); public native Transaction m_variableRemoteUser(BytePointer setter);
    public native @StdString BytePointer m_variableTime(); public native Transaction m_variableTime(BytePointer setter);
    public native @StdString BytePointer m_variableTimeDay(); public native Transaction m_variableTimeDay(BytePointer setter);
    public native @StdString BytePointer m_variableTimeEpoch(); public native Transaction m_variableTimeEpoch(BytePointer setter);
    public native @StdString BytePointer m_variableTimeHour(); public native Transaction m_variableTimeHour(BytePointer setter);
    public native @StdString BytePointer m_variableTimeMin(); public native Transaction m_variableTimeMin(BytePointer setter);
    public native @StdString BytePointer m_variableTimeSec(); public native Transaction m_variableTimeSec(BytePointer setter);
    public native @StdString BytePointer m_variableTimeWDay(); public native Transaction m_variableTimeWDay(BytePointer setter);
    public native @StdString BytePointer m_variableTimeYear(); public native Transaction m_variableTimeYear(BytePointer setter);
}
