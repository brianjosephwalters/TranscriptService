package com.eduservices.db;

import com.eduservices.schema.transcript.AddressType;
import com.eduservices.schema.transcript.AddressesType;
import com.eduservices.schema.transcript.CertificateRecordType;
import com.eduservices.schema.transcript.CertificateRecordsType;
import com.eduservices.schema.transcript.CourseRecordType;
import com.eduservices.schema.transcript.CourseRecordsType;
import com.eduservices.schema.transcript.PhoneNumbersType;
import com.eduservices.schema.transcript.StudentInfoType;
import com.eduservices.schema.transcript.StudentRecordsType;
import com.eduservices.schema.transcript.TranscriptType;
import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class TranscriptDB {
	
    public TranscriptDB() {
    }
    
    //connection
    public Connection dbConnection() {
        Connection conn = null;
        String url = "jdbc:oracle:thin:@dbsvcs.cs.uno.edu:1521:orcl";
        String driver = "oracle.jdbc.driver.OracleDriver";
        String userName = "bwalters"; 
        String password = "TZZQGkMQ";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url,userName, password);
            } catch (ClassNotFoundException | 
                     InstantiationException | 
                     IllegalAccessException | 
                     SQLException e) {
                e.printStackTrace();
            }
            return conn;
    }
    
    public TranscriptType getTranscript(String SSNumber) 
            throws SQLException {
        TranscriptType transcript = new TranscriptType();
        
        StudentInfoType studentInfo = getStudentInfo(SSNumber);
        transcript.setStudentInfo(studentInfo);

        StudentRecordsType studentRecords = getStudentRecords(SSNumber);
        transcript.setStudentRecords(studentRecords);
        return transcript;
    }
    
    public StudentInfoType getStudentInfo(String SSNumber) 
            throws SQLException {        
        Connection connection = this.dbConnection();
        String query = "SELECT * FROM person WHERE ss_number = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1,SSNumber);
        ResultSet results = stmt.executeQuery();
        connection.close();
        
        StudentInfoType studentInfo = new StudentInfoType();
        results.next();
        String firstName = results.getString("first_name");
        String lastName = results.getString("last_name");
        PhoneNumbersType phoneNumbers = getPhoneNumbers(SSNumber);
        AddressesType addresses = getAddresses(SSNumber);
        
        studentInfo.setSSNumber(SSNumber);
        studentInfo.setFirstName(firstName);
        studentInfo.setLastName(lastName);
        studentInfo.setPhoneNumbers(phoneNumbers);
        studentInfo.setAddresses(addresses);
        
        return studentInfo;
    }
    
    public PhoneNumbersType getPhoneNumbers(String SSNumber) 
            throws SQLException {
        Connection connection = this.dbConnection();
        String query = "SELECT *"
                + " FROM person_phone NATURAL JOIN phone_number"
                + " WHERE ss_number = ? ";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1,SSNumber);
        ResultSet results = stmt.executeQuery();
        connection.close();
        
        PhoneNumbersType phoneNumbers = new PhoneNumbersType();
        while (results.next()) {
            phoneNumbers.getPhoneNumber().add(results.getString("phone_num"));
        }
        return phoneNumbers;
    }
    
    public AddressesType getAddresses(String SSNumber) 
            throws SQLException {
        Connection connection = this.dbConnection();
        String query = "SELECT * "
                + " FROM person_address NATURAL JOIN address"
                + " WHERE ss_number = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, SSNumber);
        ResultSet results = stmt.executeQuery();
        connection.close();
        
        AddressesType addresses = new AddressesType();
        while (results.next()) {
            AddressType address = new AddressType();
            address.setAddressCode(results.getString("address_code"));
            address.setAddressType(results.getString("address_type"));
            address.setFirstLine(results.getString("street_1"));
            address.setSecondLine(results.getString("street_2"));
            address.setCity(results.getString("city"));
            address.setZipCode(results.getString("zipcode"));
            addresses.getAddress().add(address);
        }
        return addresses;
    }
    
    public StudentRecordsType getStudentRecords(String SSNumber) 
            throws SQLException {
        CourseRecordsType courseRecords = getCourseRecords(SSNumber);
        CertificateRecordsType certificateRecords = getCertificateRecords(SSNumber);
        
        StudentRecordsType studentRecords = new StudentRecordsType();
        studentRecords.setCourseRecords(courseRecords);
        studentRecords.setCertificateRecords(certificateRecords);
        
        return studentRecords;
    }
    
    public CourseRecordsType getCourseRecords(String SSNumber)
            throws SQLException {
        Connection connection = this.dbConnection();
        String query = "SELECT *"
                + " FROM attended NATURAL JOIN course "
                + " WHERE ss_number = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, SSNumber);
        ResultSet results = stmt.executeQuery();
        connection.close();
        
        DatatypeFactory factory = null;
        try {
             factory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        
        CourseRecordsType courseRecords = new CourseRecordsType();
        while (results.next()) {
            CourseRecordType courseRecord = new CourseRecordType();
            courseRecord.setCourseCode(results.getString("course_code"));
            courseRecord.setSectionCode(results.getString("section_code"));
            courseRecord.setCourseTitle(results.getString("course_title"));
            courseRecord.setScore(results.getShort("score"));
            courseRecord.setCourseLevel(results.getString("course_level"));

            XMLGregorianCalendar cal1 = factory.newXMLGregorianCalendar();
            cal1.setYear(results.getInt("year"));
            courseRecord.setYear(cal1);
            
            Date completedDate = results.getDate("completed_date");
            if (completedDate != null) {
                GregorianCalendar gc = new GregorianCalendar();
                gc.setTime(completedDate);
                XMLGregorianCalendar cal2 = factory.newXMLGregorianCalendar(gc);
                courseRecord.setCompletedDate(cal2);
            }
            courseRecords.getCourseRecord().add(courseRecord);
        }
        return courseRecords;
    }
    
    public CertificateRecordsType getCertificateRecords(String SSNumber) 
            throws SQLException {
        Connection connection = this.dbConnection();
        String query = "SELECT * "
                + " FROM exam_taken NATURAL JOIN exam_type NATURAL JOIN exam NATURAL JOIN certificate"
                + " WHERE ss_number = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, SSNumber);
        ResultSet results = stmt.executeQuery();
        connection.close();
        
        DatatypeFactory factory = null;
        try {
             factory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        CertificateRecordsType certificateRecords = new CertificateRecordsType();
        while (results.next()) {
            CertificateRecordType certificateRecord = new CertificateRecordType();
            certificateRecord.setCertificateCode(results.getString("certificate_code"));
            certificateRecord.setCertificateTitle(results.getString("certificate_title"));
            
            Date examDate = results.getDate("exam_date");
            int daysValid = results.getInt("days_valid");
            
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(examDate);
            gc.add(Calendar.DATE, daysValid);
        
            XMLGregorianCalendar cal = factory.newXMLGregorianCalendar(gc);
            certificateRecord.setCertificateExpiration(cal);
            certificateRecords.getCertificateRecord().add(certificateRecord);
        }
        return certificateRecords;
    }
	
}
