/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eduservices.business;

import com.eduservices.db.DolDB;
import com.eduservices.schema.transcript.TranscriptType;
import java.sql.SQLException;

/**
 *
 * @author bjw
 */
public class TranscriptServiceImpl {
    public TranscriptType getTranscript(String SSNumber) {
        DolDB db = new DolDB();
        TranscriptType transcript = null;
        try {
            transcript = db.getTranscript(SSNumber);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transcript;
    }
}
