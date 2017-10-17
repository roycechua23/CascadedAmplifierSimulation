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
public class twoport {

    public double Zi=0,Zo=0,Av=0;
    
    public twoport(double Zi, double Zo, double Av){
        this.Zi=Zi;
        this.Zo=Zo;
        this.Av=Av;
    }
    
    public void setAvwithload(double load){
        Av=Av*(load/(load+Zo));
    }
}
