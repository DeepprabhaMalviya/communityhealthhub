/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipeSysFiles;
import java.util.*;
import java.io.*; 
/**
 *
 * @author nine
 */
public class SearchManager extends javax.swing.JFrame {

    // EQUIPE SECTION
    static boolean isLoggedin = true;
    static String key = "";
    static ArrayList<String> diseases1 = new ArrayList<String>();
    static ArrayList<String> diseases2 = new ArrayList<String>();
    static ArrayList<String> diseases3 = new ArrayList<String>();
    static ArrayList<String> diseases4 = new ArrayList<String>();
    
    
    static ArrayList<String> ENT = new ArrayList<String>();
    static ArrayList<String> Cardiologist = new ArrayList<String>();
    static ArrayList<String> Gynaecologist = new ArrayList<String>();
    static ArrayList<String> GenPhys = new ArrayList<String>();   
    
    static String result1 = "";
    static String result2 = "";
    static String result3 = "";
    static String result4 = ""; 
    
    
    //END OF EQUIPE SECTION
    /**
     * Creates new form Home
     */
    public SearchManager() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(958, 592));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Community Health Hub");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setAlignmentY(0.7F);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.setMargin(new java.awt.Insets(0, 30, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EquipeSysFiles/Start-Menu-Search-iconmedium.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(66, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        kButton1.setText("My Profile");
        kButton1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        kButton1.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Select");
        jButton2.setToolTipText("Guest Mode ! Please Login");
        jButton2.setVisible(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });

        jLabel2.setVisible(false);
        jLabel2.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jButton5.setText("Select");
        jButton5.setToolTipText("Guest Mode ! Please Login");
        jButton5.setVisible(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
        });

        jButton6.setText("Select");
        jButton6.setToolTipText("Guest Mode ! Please Login");
        jButton6.setVisible(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
        });

        jButton7.setText("Select");
        jButton7.setToolTipText("Guest Mode ! Please Login");
        jButton7.setVisible(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lato", 3, 50)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Community Health Hub");

        jLabel8.setVisible(false);
        jLabel8.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setVisible(false);
        jLabel9.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setVisible(false);
        jLabel10.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setVisible(false);
        jLabel4.setBackground(new java.awt.Color(255, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Unknown Search Key - Consult General Physicians Here");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(812, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel7))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(168, 168, 168)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel8))
                .addGap(12, 12, 12)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void search(String key,ArrayList<String> listname){
        
        if(listname.contains(key)){
            showresults(listname);
        }
        
    }      
    public static void showresults(ArrayList<String> listname) {
    
      result1 = listname.get(0); 
      result2 = listname.get(1);
      result3 = listname.get(2);
      result4 = listname.get(3);    
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel4.setVisible(false);
        key = "";        
        key = this.jTextField1.getText();
        

        if (diseases1.contains(key)){
            // read Cardiologist.csv
            result1 = Cardiologist.get(0);
            result2 = Cardiologist.get(1);
            result3 = Cardiologist.get(2);
            result4 = Cardiologist.get(3);      
        }
        
        else if (diseases2.contains(key)){
            // read ENT.csv
            result1 = ENT.get(0);
            result2 = ENT.get(1);
            result3 = ENT.get(2);
            result4 = ENT.get(3);
        }
                
        else if (diseases3.contains(key)){
            // read Gynaecologist.csv
            result1 = Gynaecologist.get(0);
            result2 = Gynaecologist.get(1);
            result3 = Gynaecologist.get(2);
            result4 = Gynaecologist.get(3);            
        }        
        
        else if (diseases4.contains(key)){
            // read Gynaecologist.csv
            
            result1 = GenPhys.get(0);
            result2 = GenPhys.get(1);
            result3 = GenPhys.get(2);
            result4 = GenPhys.get(3);                   
        } 
        
        else{
            // read GeneralPhysician.csv
            jLabel4.setVisible(true);
            result1 = GenPhys.get(0);
            result2 = GenPhys.get(1);
            result3 = GenPhys.get(2);
            result4 = GenPhys.get(3); 
        }      

        this.jButton2.setVisible(true);        
        this.jButton5.setVisible(true);
        this.jButton6.setVisible(true);
        this.jButton7.setVisible(true);

        this.jLabel2.setText(result1);
        this.jLabel8.setText(result2);
        this.jLabel9.setText(result3);
        this.jLabel10.setText(result4);

        
        this.jLabel2.setVisible(true);
        this.jLabel8.setVisible(true);
        this.jLabel9.setVisible(true);
        this.jLabel10.setVisible(true);     
                
        if (isLoggedin == true)
        {            
            this.jButton2.setToolTipText("Visit Profile");
            this.jButton5.setToolTipText("Visit Profile");
            this.jButton6.setToolTipText("Visit Profile");
            this.jButton7.setToolTipText("Visit Profile");
        }        
        else{
            this.jButton2.setEnabled(false);
            this.jButton5.setEnabled(false);
            this.jButton6.setEnabled(false);
            this.jButton7.setEnabled(false);         
            this.jButton2.setToolTipText("Guest Mode ! Please Login");
            this.jButton5.setToolTipText("Guest Mode ! Please Login");
            this.jButton6.setToolTipText("Guest Mode ! Please Login");
            this.jButton7.setToolTipText("Guest Mode ! Please Login");
        }  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        this.jButton2.setVisible(true);        
        
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseEntered

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        this.jTextField1.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */

    public static void main(String args[])throws Exception {       

		diseases1.add("Arrhythmias");
		diseases1.add("Deep venous thrombosis");
		diseases1.add("Heart Attack");
		diseases1.add("Hypertension");
		diseases1.add("Endocarditis");
		diseases1.add("Myocarditis");
		diseases1.add("Pericardial disease");
		diseases1.add("Ischemic disease");
		diseases1.add("Peripheral vascular disease");
		diseases2.add("Shock");
		diseases2.add("Syncope");
		diseases2.add("Valvular disease");
		diseases2.add("Asthma");
		diseases2.add("Chronic obstructive pulmonary disease");
		diseases2.add("Interstitial lung disease");
		diseases2.add("Neoplasms/Malignancies");
		diseases2.add("Pleural disease");
		diseases2.add("Pneumonia");
		diseases2.add("Pneumothorax");
		diseases2.add("Pulmonary embolism");
		diseases2.add("Tuberculosis");
		diseases2.add("Bleeding");
		diseases3.add("Constipation");
		diseases3.add("Diverticulosis");
		diseases3.add("Inflammatory bowel disease");
		diseases3.add("Infections");
		diseases3.add("Ischemia");
		diseases3.add("Adrenal gland disease");
		diseases3.add("Diabetes mellitus");
		diseases3.add("Acid-base disorders");
		diseases4.add("Acute kidney injury");
		diseases4.add("Chronic kidney disease/End-stage renal disease");
		diseases4.add("Neoplasms/Malignancies");
		diseases4.add("Nephrolithiasis");
		diseases4.add("Urinary tract infections");
		diseases4.add("Anemias");
		diseases4.add("Bone marrow disorders");
		diseases4.add("Coagulopathies"); 
           
{  
Scanner sc = new Scanner(new File("ENT.csv"));
while(sc.hasNext())
{  
sc.useDelimiter(",");
ENT.add(sc.next());
}   
//System.out.println(ENT);  
//System.out.println(ENT.size());
sc.close();  //closes the scanner  
}      

{  
Scanner sc = new Scanner(new File("Cardiologist.csv"));
while(sc.hasNext())
{  
sc.useDelimiter(",");
Cardiologist.add(sc.next());

}  
//System.out.println(Cardiologist);  
//System.out.println(Cardiologist.size());
sc.close();  //closes the scanner  
}

{  
Scanner sc = new Scanner(new File("Gynaecologist.csv"));
while(sc.hasNext())
{  
sc.useDelimiter(",");
Gynaecologist.add(sc.next());
}   
//System.out.println(Gynaecologist);  
//System.out.println(Gynaecologist.size());
sc.close();  //closes the scanner  
}

{  
Scanner sc = new Scanner(new File("GeneralPhysician.csv"));
while(sc.hasNext())
{  
sc.useDelimiter(",");
GenPhys.add(sc.next());
}   
//System.out.println(GenPhys);  
//System.out.println(GenPhys.size());
sc.close();  //closes the scanner  
} 
                              
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new SearchManager().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KButton kButton1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
