/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhinadri
 */



import java.io.*;
import java.util.*;


public class PatientManager {
    
    public Patient[] readAll(String filename) {
        
        FileReader reader = null;
        BufferedReader bufReader = null;
        try {
            reader = new FileReader(filename);
            bufReader = new BufferedReader(reader);
            String oneLine = bufReader.readLine();
            Patient myPatient = null;
            int counts = 0;
            assert oneLine == null : "Incorrect Input"; 
            while(oneLine != null){
                counts++;
                StringTokenizer st = new StringTokenizer(oneLine, "|");
                while (st.hasMoreTokens()) {
                    System.out.println(st.nextToken());
                }
                
                oneLine = bufReader.readLine();

            }
            bufReader.close();
            reader.close();
            
        } catch (FileNotFoundException e) {
                //do something clever with the exception
                System.out.println("File Not Found");
        } catch (IOException e) {
                //do something clever with the exception
                System.out.println("IO Exception");              
        } finally {
            return new Patient[10];
        } 

    }
    
    public boolean doHousekeeping() {
        return true;
    }
    
    boolean writeAll(String filename,String docnum,String docname, String degree, String age) {
        
        boolean result = false;
        
        File outFile = new File(filename);
        // check existence
        if (!outFile.exists()) {
            
            try {
                PrintWriter pwStream = new PrintWriter(
                new BufferedWriter(new FileWriter(filename)));
                //int num;
                pwStream.append(docnum+","+docname+","+degree+","+age);
                pwStream.flush();
                pwStream.close();
                result = true;
                
            } catch (FileNotFoundException e) {
                //do something clever with the exception
                System.out.println("File Not Found");
            } catch (IOException e) {
                    //do something clever with the exception
                    System.out.println("IO Exception");              
            }
        } // end if (!outFile.exists())
        
        
        return result;
    }
    
    public static void writeAudit(String actionName,String filename,String firstname,String lastname,String emailid) {
    String whereWrite = (filename+".csv");

    try {
        FileWriter fw = new FileWriter(whereWrite, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(actionName+","+firstname+","+lastname+","+emailid);
        pw.flush();
        pw.close();

    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public boolean init(String filename) {
        
        boolean result = false;
        result = true;
        return result;
    }
    
    
    public static void main(String args[]) {
        
        Patient[] listPatient;        
        PatientManager myMgr = new PatientManager();
           String csvFilename = "pat.csv";
        
        listPatient = myMgr.readAll("pat.csv");
    }
}

