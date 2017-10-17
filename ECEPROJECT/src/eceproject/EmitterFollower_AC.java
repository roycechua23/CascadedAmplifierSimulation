package eceproject;
import java.util.*;

public class EmitterFollower_AC extends EmitterFollower_DC {
    
    double Zi=0, Zo=0, Av=0, Ai=0, re=0, ro=0, Zb=0;
    
    public double calculateRE(){
        re=0.026/IE;
        return result;
    }
    
    public double calculateZi(){
        if(ro>10*(RE)){
            Zb=B*RE;
            Zi=((RB*(B*RE))/(RB+(B*RE)));
        }
        else{
            Zb=B*re+(((B+1)*RE)/(1+(RE/ro)));
            Zi=((RB*(B*RE))/(RB+(B*RE)));
        }
        return result;
    }
    
    public double calculateZo(){
        if(RE>re){
            Zo=re;
        }
        else{
            Zo=((RE*re)/(RE+re));
        }
        return result;
    }
    
    public double calculateVoltageGain(){
        if(ro>(10*RE)){
            Av=1;
        }
        else{
            Av=(((B+1)*(RE/Zb)/1+(RE/ro)));
        }
        return result;
    }
    
    public double calculateCurrentGain(){      
            Ai=(-B*RE)/RB+(RB+Zb);        
        return result;
    }
}