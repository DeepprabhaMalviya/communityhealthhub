/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhinadri
 */
import java.io.*;
import java.util.*;
//import java.io.FileWriter;
public class ConferenceManager extends Conference {
   
    Conference[] readAll(String filename) {
        
        FileReader reader = null;
        BufferedReader bufReader = null;
        try {
  
            reader = new FileReader(filename);
            bufReader = new BufferedReader(reader);

            
            String oneLine = bufReader.readLine();
            assert oneLine == null : "Incorrect Input"; 
            Conference myConference = null;
            int counts = 0;
            while(oneLine != null){
           
                counts++;
                
                StringTokenizer st = new StringTokenizer(oneLine, "|");
                while (st.hasMoreTokens()) {
                    st.nextToken();
                }
                
                oneLine = bufReader.readLine();

            }
            bufReader.close();
            reader.close();
            
        } catch (FileNotFoundException e) {
                
                System.out.println("File Not Found");
        } catch (IOException e) {
           
                System.out.println("IO Exception");              
        } finally {
            return new Conference[10];
        } 

    
    }
    
    public boolean doHousekeeping() {
        return true;
    }
    
        public boolean init(String filename) {
        
        boolean result = false;
        result = true;
        return result;
    }
    
    
    public static void display(String Stringsss){
        System.out.print(Stringsss);
    }
    
    static ArrayList<String> valuer = new ArrayList<String>();
    public static void main(String args[])throws Exception {
      
    Conference[] listConference;        
     ConferenceManager myMgr = new ConferenceManager();
     listConference = myMgr.readAll("conference.csv");
     assert listConference == null : "Invalid Data to Read"; 
   
      {  
        Scanner sc = new Scanner(new File("conference.csv"));
        sc.next();
        while(sc.hasNext())
        {  
            
        sc.useDelimiter(",");
        valuer.add(sc.next());
        }

      //These Values To Be Fetched from CSV
     String confid = "c001";
     String patientid = "8400";
     String doctorid = "2400";
     String time = "12:22";
     // Switch to CSV
     //System.out.print(valuer);
     //display(myMgr.Conference(confid,patientid,doctorid,time));
    display(myMgr.Conference(valuer.get(0),valuer.get(1),valuer.get(2),valuer.get(3)));
    
}
}
}
