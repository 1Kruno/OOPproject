/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author x18100252
 */
public class HousingGUI extends javax.swing.JFrame implements Serializable{

    
    
    Property p;
    int noOfBeds;
    int noOfToilets;
    String theArea;
    int price;
    
    ArrayList <Property> property = new ArrayList();
    ArrayList <Property> pList = new ArrayList();
    
    public static String[] Area = {"Dublin 1", "Dublin 2", "Dublin 3", "Dublin 4", "Dublin 5", "Dublin 6",
                     "Dublin 6w", "Dublin 7", "Dublin 8", "Dublin 9", "Dublin 10", "Dublin 11",
                     "Dublin 12", "Dublin 13", "Dublin 14", "Dublin 15", "Dublin 16", "Dublin 17",
                     "Dublin 18", "Dublin 20", "Dublin 22", "Dublin 24" };
        
    
       //area,2 bed house, 3 bed house, 4 bed house
    public static int[][] HousePrice = { {1, 1923, 2399, 2966},
                               {2, 2193, 2606, 3102},
                               {3, 1832, 2129, 2434},
                               {4, 2244, 2571, 2878},
                               {5, 1644, 1923, 2117},
                               {6, 2040, 2386, 2627},
                               {61, 1807, 2114, 2327},
                               {7, 1781, 2083, 2294},
                               {8, 1874, 2191, 2413},
                               {9, 1658, 1939, 2135},
                               {10, 1526, 1785, 1965},
                               {11, 1551, 1814, 1997},
                               {12, 1637, 1915, 2108},
                               {13, 1620, 1895, 2086},
                               {14, 1788, 2092, 2303},
                               {15, 1504, 1759, 1936},
                               {16, 1633, 1910, 2103},
                               {17, 1558, 1823, 2007},
                               {18, 1809, 2115, 2329},
                               {20, 1631, 1907, 2100},
                               {22, 1473, 1723, 1897},
                               {24, 1507, 1763, 1941},   
    };
    
    public static int[][] ApartmentPrice = { {1, 1585, 1895, 2300},
                               {2, 1834, 2250, 2602},
                               {3, 1553, 1850, 2034},
                               {4, 1981, 2383, 2778},
                               {5, 1426, 1623, 1917},
                               {6, 1770, 1886, 2127},
                               {61, 1567, 1814, 2027},
                               {7, 1545, 1783, 1994},
                               {8, 1625, 1891, 2013},
                               {9, 1438, 1739, 1935},
                               {10, 1324, 1585, 1965},
                               {11, 1345, 1414, 1797},
                               {12, 1420, 1615, 1808},
                               {13, 1405, 1595, 1886},
                               {14, 1551, 1792, 2003},
                               {15, 1304, 1659, 1936},
                               {16, 1416, 1710, 2003},
                               {17, 1352, 1523, 2007},
                               {18, 1569, 2015, 2329},
                               {20, 1414, 1707, 2100},
                               {22, 1278, 1523, 1897},
                               {24, 1307, 1663, 1939},
            
        
    };
    /**
     * Creates new form HousingGUI
     */
    public HousingGUI() {
        initComponents();
        cmbhousebeds.setVisible(false);
        cmbapartmentbeds.setVisible(false);
        lblhousebed.setVisible(false);
        lblaprtmentbed.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbproperty = new javax.swing.JComboBox<>();
        lbltitle = new javax.swing.JLabel();
        cmbarea = new javax.swing.JComboBox<>();
        lblproperty = new javax.swing.JLabel();
        lblarea = new javax.swing.JLabel();
        btngetprice = new javax.swing.JButton();
        cmbhousebeds = new javax.swing.JComboBox<>();
        cmbapartmentbeds = new javax.swing.JComboBox<>();
        cmbnoOfToilets = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lblhousebed = new javax.swing.JLabel();
        lblaprtmentbed = new javax.swing.JLabel();
        lbltoilet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        cmbproperty.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cmbproperty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "House", "Apartment" }));
        cmbproperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpropertyActionPerformed(evt);
            }
        });
        getContentPane().add(cmbproperty);
        cmbproperty.setBounds(40, 90, 540, 38);

        lbltitle.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Housing App");
        getContentPane().add(lbltitle);
        lbltitle.setBounds(220, 10, 200, 60);

        cmbarea.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cmbarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dublin 1", "Dublin 2", "Dublin 3", "Dublin 4", "Dublin 5", "Dublin 6", "Dublin 6w", "Dublin 7", "Dublin 8", "Dublin 9", "Dublin 10", "Dublin 11", "Dublin 12", "Dublin 13", "Dublin 14", "Dublin 15", "Dublin 16", "Dublin 17", "Dublin 18", "Dublin 20", "Dublin 22", "Dublin 24" }));
        cmbarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbareaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbarea);
        cmbarea.setBounds(40, 170, 540, 39);

        lblproperty.setBackground(new java.awt.Color(255, 255, 255));
        lblproperty.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblproperty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblproperty.setText("Property type");
        lblproperty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblproperty);
        lblproperty.setBounds(260, 130, 110, 17);

        lblarea.setBackground(new java.awt.Color(255, 255, 255));
        lblarea.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblarea.setText("Area");
        getContentPane().add(lblarea);
        lblarea.setBounds(280, 210, 60, 17);

        btngetprice.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btngetprice.setText("Get average price");
        btngetprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetpriceActionPerformed(evt);
            }
        });
        getContentPane().add(btngetprice);
        btngetprice.setBounds(220, 360, 184, 45);

        cmbhousebeds.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cmbhousebeds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 beds", "3 beds", "4 beds" }));
        cmbhousebeds.setMaximumSize(new java.awt.Dimension(119, 39));
        cmbhousebeds.setMinimumSize(new java.awt.Dimension(119, 39));
        cmbhousebeds.setPreferredSize(new java.awt.Dimension(119, 39));
        cmbhousebeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbhousebedsActionPerformed(evt);
            }
        });
        getContentPane().add(cmbhousebeds);
        cmbhousebeds.setBounds(40, 250, 140, 39);

        cmbapartmentbeds.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cmbapartmentbeds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Studio", "2 beds", "3 beds" }));
        cmbapartmentbeds.setMaximumSize(new java.awt.Dimension(119, 39));
        cmbapartmentbeds.setMinimumSize(new java.awt.Dimension(119, 39));
        cmbapartmentbeds.setName(""); // NOI18N
        cmbapartmentbeds.setPreferredSize(new java.awt.Dimension(119, 39));
        cmbapartmentbeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbapartmentbedsActionPerformed(evt);
            }
        });
        getContentPane().add(cmbapartmentbeds);
        cmbapartmentbeds.setBounds(240, 250, 140, 39);

        cmbnoOfToilets.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cmbnoOfToilets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Toilet", "2 Toilets" }));
        cmbnoOfToilets.setMaximumSize(new java.awt.Dimension(119, 39));
        cmbnoOfToilets.setMinimumSize(new java.awt.Dimension(119, 39));
        cmbnoOfToilets.setName(""); // NOI18N
        cmbnoOfToilets.setPreferredSize(new java.awt.Dimension(119, 39));
        cmbnoOfToilets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnoOfToiletsActionPerformed(evt);
            }
        });
        getContentPane().add(cmbnoOfToilets);
        cmbnoOfToilets.setBounds(440, 250, 140, 39);

        jButton1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jButton1.setText("Review search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 410, 140, 38);

        lblhousebed.setBackground(new java.awt.Color(255, 255, 255));
        lblhousebed.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblhousebed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhousebed.setText("Number of bedrooms");
        getContentPane().add(lblhousebed);
        lblhousebed.setBounds(40, 300, 130, 17);

        lblaprtmentbed.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblaprtmentbed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblaprtmentbed.setText("Number of bedrooms");
        lblaprtmentbed.setPreferredSize(new java.awt.Dimension(120, 14));
        getContentPane().add(lblaprtmentbed);
        lblaprtmentbed.setBounds(230, 300, 140, 14);

        lbltoilet.setBackground(java.awt.Color.white);
        lbltoilet.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbltoilet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltoilet.setText("Number of toilets");
        getContentPane().add(lbltoilet);
        lbltoilet.setBounds(440, 300, 120, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\x18100252\\Desktop\\landscape.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbpropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpropertyActionPerformed
        // TODO add your handling code here:
            
         if(cmbproperty.getSelectedItem().equals("House"))
        {
            cmbhousebeds.setVisible(true);
            cmbapartmentbeds.setVisible(false);
            lblhousebed.setVisible(true);
            lblaprtmentbed.setVisible(false);
             p = new House(); 
             //JOptionPane.showMessageDialog(null, "You are looking for a house to rent");
        }
         else if(cmbproperty.getSelectedItem().equals("Apartment"))
        {
            cmbhousebeds.setVisible(false);
            cmbapartmentbeds.setVisible(true);
            lblaprtmentbed.setVisible(true);
            lblhousebed.setVisible(false);
              p = new Apartment();
              //JOptionPane.showMessageDialog(null, "You are looking for an apartment to rent");
        }
         else{JOptionPane.showMessageDialog(null, "Please select on of the options");}
    }//GEN-LAST:event_cmbpropertyActionPerformed

    private void writeToFile(){
    try{
	File f = new File("output.dat");
	FileOutputStream fStream = new FileOutputStream(f, true);
        ObjectOutputStream oStream = new ObjectOutputStream(fStream);
        oStream.writeObject(pList);
        oStream.close();
        System.out.println("The Object  was succesfully written to a file");
    }
    catch(IOException q)
    {
        System.out.println(q);
    }
}
    
    public void readFromFile()
    {
        try{
            File f = new File("output.dat");
            FileInputStream is = new FileInputStream(f);
	    ObjectInputStream ois = new ObjectInputStream(is);
	    Property p = (Property) ois.readObject();
            ois.readObject();
            ois.close();
            is.close();
            JOptionPane.showMessageDialog(null,p.toString());
        /*File f = new File("output.dat");
	FileInputStream fStream = new FileInputStream(f);
        ObjectInputStream iStream = new ObjectInputStream(fStream);
        
        
        //property = (ArrayList<Property>)oStream.readObject();
        //oStream.readObject();
        iStream.close();
        */}
        catch(ClassNotFoundException | IOException e)
    {
        System.out.println(e);
    }
    }
    
    
    private void cmbareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbareaActionPerformed
        // TODO add your handling code here:
      
        for(int x=0;x<25;x++){
        if(cmbarea.getSelectedItem().equals(Area[x])){
            break;
        }
        }   
    }//GEN-LAST:event_cmbareaActionPerformed

    private void btngetpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetpriceActionPerformed
        // TODO add your handling code here:
        
         if(cmbproperty.getSelectedItem().equals("House")){
            if(cmbhousebeds.getSelectedItem().equals("2 beds")){
                for(int x=0;x<25;x++){
                if(cmbarea.getSelectedItem().equals(Area[x])){
                p.setPrice(HousePrice[x][1]);
                writeToFile();
                break;
            }
            }}
            else if(cmbhousebeds.getSelectedItem().equals("3 beds")){
                for(int x=0;x<25;x++){
                if(cmbarea.getSelectedItem().equals(Area[x])){
                p.setPrice(HousePrice[x][2]);
                writeToFile();
                break;
            }
            }}
            else if(cmbhousebeds.getSelectedItem().equals("4 beds")){
                for(int x=0;x<25;x++){
                if(cmbarea.getSelectedItem().equals(Area[x])){
                p.setPrice(HousePrice[x][3]);
                writeToFile();
                break;
        }
    }}}
          if(cmbproperty.getSelectedItem().equals("Apartment")){
            if(cmbhousebeds.getSelectedItem().equals("Studio")){
                for(int x=0;x<25;x++){
                if(cmbarea.getSelectedItem().equals(Area[x])){
                p.setPrice(ApartmentPrice[x][1]);
                writeToFile();
                break;
            }
            }}
            else if(cmbhousebeds.getSelectedItem().equals("2 beds")){
                for(int x=0;x<25;x++){
                if(cmbarea.getSelectedItem().equals(Area[x])){
                p.setPrice(ApartmentPrice[x][2]);
                writeToFile();
                break;
            }
            }}
            else if(cmbhousebeds.getSelectedItem().equals("3 beds")){
                for(int x=0;x<25;x++){
                if(cmbarea.getSelectedItem().equals(Area[x])){
                p.setPrice(ApartmentPrice[x][3]);
                writeToFile();
                break;
        }
    }}}
         else{}
        for(Property p:property)
       {
          if(cmbnoOfToilets.getSelectedItem().equals("1 Toilet")){
           JOptionPane.showMessageDialog(null,"Property info: "+cmbproperty.getSelectedItem()+" in "+
                   cmbarea.getSelectedItem()+ "\n Number of beds "+p.getNoOfBeds()+"\n Number of toilets "
                   +p.getNoOfToilets()+"\n Average price: €"+p.getPrice() );
                   pList.add(p);
                   writeToFile();
                   break;
          }
          else{
              JOptionPane.showMessageDialog(null,"Property info: "+cmbproperty.getSelectedItem()+" in "+
                   cmbarea.getSelectedItem()+ "\n Number of beds "+p.getNoOfBeds()+"\n Number of toilets "
                   +(p.getNoOfToilets()+1)+"\n Average price: €"+(p.getPrice()+100) );
                   pList.add(p);
                   writeToFile();
                   break;
          }
         
       }
        writeToFile();
    }//GEN-LAST:event_btngetpriceActionPerformed

    
    
    private void cmbhousebedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbhousebedsActionPerformed
        // TODO add your handling code here:
        
        int noOfBeds = 1;
        
        if(cmbhousebeds.getSelectedItem().equals("2 beds")){
            p.setNoOfBeds(noOfBeds + 1);
            property.add(p);
        }
        else if(cmbhousebeds.getSelectedItem().equals("3 beds")){
            p.setNoOfBeds(noOfBeds + 2);
            property.add(p);
        }
        else if(cmbhousebeds.getSelectedItem().equals("4 beds")){
            p.setNoOfBeds(noOfBeds + 3);
            property.add(p);
        }
        else{JOptionPane.showMessageDialog(null, "Please select number of bedrooms");
        }
        
    }//GEN-LAST:event_cmbhousebedsActionPerformed

    private void cmbapartmentbedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbapartmentbedsActionPerformed
        // TODO add your handling code here:
        
        int noOfBeds = 1;
        
        if(cmbapartmentbeds.getSelectedItem().equals("Studio")){
            p.setNoOfBeds(noOfBeds);
            property.add(p);
        }
        else if(cmbapartmentbeds.getSelectedItem().equals("2 beds")){
            p.setNoOfBeds(noOfBeds + 1);
            property.add(p);
        }
        else if(cmbapartmentbeds.getSelectedItem().equals("3 beds")){
            p.setNoOfBeds(noOfBeds + 2);
            property.add(p);
        }
        else{JOptionPane.showMessageDialog(null, "Please select number of bedrooms");
        }
       
    }//GEN-LAST:event_cmbapartmentbedsActionPerformed

    private void cmbnoOfToiletsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnoOfToiletsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbnoOfToiletsActionPerformed

 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       readFromFile();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(HousingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HousingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HousingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HousingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HousingGUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngetprice;
    private javax.swing.JComboBox<String> cmbapartmentbeds;
    private javax.swing.JComboBox<String> cmbarea;
    private javax.swing.JComboBox<String> cmbhousebeds;
    private javax.swing.JComboBox<String> cmbnoOfToilets;
    private javax.swing.JComboBox<String> cmbproperty;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblaprtmentbed;
    private javax.swing.JLabel lblarea;
    private javax.swing.JLabel lblhousebed;
    private javax.swing.JLabel lblproperty;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lbltoilet;
    // End of variables declaration//GEN-END:variables
}
