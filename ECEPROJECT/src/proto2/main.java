/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proto2;
import eceproject.*;
import tulongko.*;
import javax.swing.*;
import java.util.Scanner;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sysno = Integer.parseInt(JOptionPane.showInputDialog("Enter number of systems: "));
       int counter=0;
       
       double Avt=1;
       twoport[] tp = new twoport[sysno]; // we will make twoport objects which will store memory of each system instances
       while (counter<sysno){
           // here for each config, setup will be done
           
           int config = Integer.parseInt(JOptionPane.showInputDialog("Choose configuration\n1 - Voltage Divider(Bypassed):"));
           switch (config){
               case 1:
                   
                   // gathering of user input phase
                   Ro_Voltage_Divider vdb = new Ro_Voltage_Divider();
                   vdb.setSize(1150,720);
                   vdb.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
                   vdb.setVisible(true);
                   Scanner sc = new Scanner(System.in);
                   System.out.println("Enter Anything to continue...");
                   String space=sc.nextLine();
                   double VCC = vdb.VCCval;
                   double R1 =  vdb.R1val;
                   double R2 =  vdb.R2val;
                   double RC =  vdb.RCval;
                   double RE =  vdb.REval;
                   double BETA = vdb.BETAval;
//                   double VCC = Double.parseDouble(JOptionPane.showInputDialog("Enter VCC"));
//                   double R1 = Double.parseDouble(JOptionPane.showInputDialog("Enter R1")); 
//                   double R2 = Double.parseDouble(JOptionPane.showInputDialog("Enter R2")); 
//                   double RC = Double.parseDouble(JOptionPane.showInputDialog("Enter RC")); 
//                   double RE = Double.parseDouble(JOptionPane.showInputDialog("Enter RE")); 
//                   double BETA = Double.parseDouble(JOptionPane.showInputDialog("Enter BETA"));
                   // computation phase
                   Voltagedivider_bypassed vdivider = new Voltagedivider_bypassed(VCC,R1,R2,RC,RE,BETA);
                   System.out.println("re is "+vdivider.getre());
                   // mutation of the Av of previous system when a new system is added
                   if(counter>0){
                       System.out.println("Loading effects on System "+counter+" is equal to "+vdivider.getZi());
                       tp[counter-1].setAvwithload(vdivider.getZi());
                       System.out.println("New voltage gain value of System "+(counter-1)+" is "+tp[counter-1].Av);
                   }
                   
                   // making the two port system
                   tp[counter] = new twoport(vdivider.getZi(),vdivider.getZo(),vdivider.getAv());
                   System.out.println("Thte total voltage gain of system "+(counter+1)+" is: "+tp[counter].Av);
           }
           counter++;
       }
       counter=0;
       while(counter<tp.length){
           Avt*=tp[counter].Av;
           counter++;
       }
       System.out.println("The total voltage gain is "+Avt);
       twoportsystem tps = new twoportsystem(sysno,tp);
       tps.setSize(1300, 540);
       tps.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
       tps.setVisible(true);
       JOptionPane.showMessageDialog(null, "The total voltage gain is: "+(Avt));
       // After loop
       // Config 0 Av * COnfig 1 Av * Config 2 Av
    }
    
}
