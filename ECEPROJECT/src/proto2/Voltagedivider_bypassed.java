/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proto2;

/**
 *
 * @author user
 */
public class Voltagedivider_bypassed {

    double VBE=0.7,VB=0,IB=0,IE=0; /// DC constants
    double VCC,R1,R2,RC,RE,BETA;// user input
    double re=0,Zi=0,Zo=0,Av=0,Ai=0; // AC parameters
   
    public Voltagedivider_bypassed(double VCC, double R1, double R2, double RC, double RE, double BETA){
        this.VCC=VCC;
        this.R1=R1;
        this.R2=R2;
        this.RC=RC;
        this.RE=RE;
        this.BETA=BETA;
    }
    
    public double getre(){
        VB=(VCC)*(R2/(R1+R2));
        IE=(VB-VBE)/(RE);
        re=0.026/(IE);
        return re;
    }
    
    public double getZi(){
        Zi=getre()*BETA;
        return Zi;
    }
    
    public double getZo(){
        Zo=RC;
        return Zo;
    }
    
    public double getAv(){
        Av=(-RC)/getre();
        return Av;
    }
    
//    public void setAvwithload(double loadingeffects){
//        Av=-( (RC)*(loadingeffects)/(RC+loadingeffects)  ) / getre();
//    }
}
