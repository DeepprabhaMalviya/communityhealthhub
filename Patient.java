/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhinadri
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Patient {
    private String patientID;
    private String patientName;
    private String patientAge;

    public String getpatientID() {
        return patientID;
    }

    public String getpatientName() {
        return patientName;
    }

    public String getpatientAge() {
        return patientAge;
    }

    
    public Patient(String patientID, String patientName,String patientAge) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientAge = patientAge;
    }
    
    public String toString() {
        // stringify patient class
        return "";
    }
    
    
}

