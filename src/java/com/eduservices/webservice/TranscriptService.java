/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eduservices.webservice;

import javax.jws.WebService;

/**
 *
 * @author bjw
 */
@WebService(serviceName = "TranscriptService", 
            portName = "portTranscriptSOAP", 
            endpointInterface = "com.eduservices.contract.transcript.PtGetTranscript", 
            targetNamespace = "http://eduservices.com/contract/transcript/", 
            wsdlLocation = "WEB-INF/wsdl/TranscriptService/Transcript.wsdl")
public class TranscriptService {

    public com.eduservices.schema.transcript.TranscriptType opGetTranscript(java.lang.String ssNumber) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
