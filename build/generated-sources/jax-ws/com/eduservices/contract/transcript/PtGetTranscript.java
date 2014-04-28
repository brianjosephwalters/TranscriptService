
package com.eduservices.contract.transcript;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.eduservices.schema.transcript.TranscriptType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ptGetTranscript", targetNamespace = "http://eduservices.com/contract/transcript/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.codesynthesis.xmlns.xsstl.ObjectFactory.class,
    com.eduservices.schema.transcript.ObjectFactory.class
})
public interface PtGetTranscript {


    /**
     * 
     * @param ssNumber
     * @return
     *     returns com.eduservices.schema.transcript.TranscriptType
     */
    @WebMethod
    @WebResult(name = "Transcript", targetNamespace = "http://eduservices.com/schema/transcript/", partName = "Transcript")
    public TranscriptType opGetTranscript(
        @WebParam(name = "SSNumber", targetNamespace = "http://eduservices.com/schema/transcript/", partName = "SSNumber")
        String ssNumber);

}