/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eduservices.business;

import com.eduservices.db.TranscriptDB;
import com.eduservices.schema.transcript.TranscriptType;
import java.sql.SQLException;

/**
 *
 * @author bjw
 */
public class TranscriptServiceImpl {
    public TranscriptType getTranscript(String SSNumber) {
        TranscriptDB db = new TranscriptDB();
        TranscriptType transcript = null;
        try {
            transcript = db.getTranscript(SSNumber);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transcript;
    }
}
