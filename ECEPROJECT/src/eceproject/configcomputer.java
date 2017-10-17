/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eceproject;

public class configcomputer {

    public int sysno;
    double VBE=0.7,IB=0,IE=0,re=0,RB=0,VTH=0,AV=0;
    
    public double voltagedividerbypassed(double VCC,double R1, double R2, double RC, double RE, double BETA){
        RB = (R1 * R2) / (R1 + R2);
        VTH = (VCC * R2) / (R1 + R2);
        IB = (VTH - VBE) / (RB + (BETA + 1) * RE);
        IE = (BETA + 1) * IB;
        re = 0.026 / IE;
        AV=(-RC)/re;
        return AV;
    }
    
}
