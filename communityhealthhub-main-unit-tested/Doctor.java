/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kajal
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Doctor {
    private String doctorID;
    private String doctorName;
    private String doctorDegree;
    private String doctorAge;

    public String getdoctorID() {
        return doctorID;
    }

    public String getdoctorName() {
        return doctorName;
    }

    public String getdoctorDegree() {
        return doctorDegree;
    }
    
    public String getDoctorAge(){
        return doctorAge;
    }
    
    public Doctor(String doctorID, String doctorName, String doctorDegree, String doctorAge) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.doctorDegree = doctorDegree;
        this.doctorAge = doctorAge;
    }
    
    public String toString() {
        // stringify doctor class
        return "";
    }
     
}

