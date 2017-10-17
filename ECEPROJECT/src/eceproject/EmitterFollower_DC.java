package eceproject;

import java.util.Scanner;

public class EmitterFollower_DC {
    final static double VBE=0.7;
    double VCC=0,RB=0,IE=0,IC=0,IB=0,VCE=0,B=0, RE=0;
    double result=0;
    
    public double calculateIB(){
        IB= (VCC-VBE)/RB+((B+1)*RE);
        return result;
    }
    
    public double calculateIE(){
        IE=(B+1)*IB;
        return result;
    }
    
    public double calculateIC(){       
            IC=B*IB;
        return result;
    }

    public double calculateVCE(){       
            VCE=VCC-(IE*RE);
        return result;
    }
}