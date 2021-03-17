/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhinadri
 */
import java.io.*;
import java.util.StringTokenizer;
import java.io.FileWriter;

public class Conference {
    private String confID;
    private String patientID;
    private String doctorID;
    private String time;
    
    public String getConfID() {
        return confID;
    }
    
    public String getPatientID() {
        return patientID;
    }
    
    public String getDoctorID() {
        return doctorID;
    }
    
    public String getTime() {
        return time;
    }
    
    public String toString() {
        // stringify doctor class
        return "";
    }

        public String Conference(String confID, String patientID, String doctorID, String time) {
        this.doctorID = doctorID;
        this.confID = confID;
        this.patientID = patientID;
        this.time = time;
        
        String confvalue = "Conference Details :\n"+confID+" has Begun, your link is meet.google.com/xyz-abc-123. \n Patient Id: "+patientID+"\n Doctor Id: "+doctorID+"\n Session Time: "+time+"\n";
        return confvalue;
    }
   
}

