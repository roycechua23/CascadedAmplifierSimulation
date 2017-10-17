package eceproject;

import javax.swing.JOptionPane;
import tulongko.*;

public class ConfigurationsCom {

    public int number, value,sysno;
//    Ro_Voltage_Divider VDBypassed = new Ro_Voltage_Divider();

    public double R1, R2, VBE = 0.7, Zb, Rsense, RLoad, sourceVoltage, inputVoltage, outputVoltage, loadVoltage, ZiCascaded, ZoCascaded, AvCascaded, AiCascaded, Avs, AvLoaded, AiLoaded, Ais;
    //DC 
//    public double[] VCC, IE, IB, RB, RC, RE, alphabet, RF1, RF2;
//    public double[] VEE, VTH;
//    public double[] re, Av, Ai, Zi, Zo;
//    public double[] AvL;

//        this.number = number;
//        this.inputVoltage = inputVoltage;
    //DC
        public int initialize(){
            this.value=sysno;
            return value;
        }
    
        
        public double[] VCC = new double[10];
        public double[] IE = new double[10];
        public double[] IB = new double[10];
        public double[] RB = new double[10];
        public double[] RC = new double[10];
        public double[] RE = new double[10];
        public double[] alphabet = new double[10];
        //special cases
        public double[] VEE = new double[10];
        public double[] VTH = new double[10];
        public double[] RF1 = new double[10];
        public double[] RF2 = new double[10];
        //AC
        public double[] re = new double[10];
//       ro = new double[number];
        public double[] Av = new double[10];
        public double[] Ai = new double[10];
        public double[] Zi = new double[10];
        public double[] Zo = new double[10];
        public double[] AvL = new double[10];
//        System.out.println("array initialized");
//        System.out.println("Number: "+ number);
    

    public void FixedBias() {
        //needed values
        VCC[value] = Double.parseDouble(JOptionPane.showInputDialog("VCC"));
        RB[value] = Double.parseDouble(JOptionPane.showInputDialog("RB"));
        RC[value] = Double.parseDouble(JOptionPane.showInputDialog("RC"));
        alphabet[value] = Double.parseDouble(JOptionPane.showInputDialog("Beta"));
        //computed values DC
        IB[value] = (VCC[value] - VBE) / RB[value];
        IE[value] = (alphabet[value] + 1) * IB[value];
        re[value] = 0.026 / IE[value];
        System.out.println("IB " + IB[value]);
        System.out.println("IE " + IE[value]);
        System.out.println("re " + re[value]);
        //computed values AC
//        ro[value] = Double.parseDouble(JOptionPane.showInputDialog("ro: , (0 if ro = inf ohms)"));
        //ZI
        if (RB[value] >= 10 * alphabet[value] * re[value]) {
            Zi[value] = alphabet[value] * re[value];
        } //exact btm
        else {
            Zi[value] = (RB[value] * (alphabet[value] * re[value])) / (RB[value] + (alphabet[value] * re[value]));
        }
        //ZO
        Zo[value] = RC[value];
        //AV 
        Av[value] = (-1 * RC[value]) / re[value];
        //AI
        Ai[value] = alphabet[value];
        System.out.println("Zi " + Zi[value]);
        System.out.println("Zo " + Zo[value]);
        System.out.println("Av " + Av[value]);
        System.out.println("Ai " + Ai[value]);
        //unused values
        VEE[value] = 0;
        VTH[value] = 0;
        RE[value] = 0;
        RF1[value] = 0;
        RF2[value] = 0;

        System.out.println("Value: " + value);
    }

    public void VoltageDividerBypassed() {
        //needed values
//        VCC[value] = Double.parseDouble(JOptionPane.showInputDialog("VCC"));
//        R1 = Double.parseDouble(JOptionPane.showInputDialog("R1"));
//        R2 = Double.parseDouble(JOptionPane.showInputDialog("R2"));
//        RC[value] = Double.parseDouble(JOptionPane.showInputDialog("RC"));
//        RE[value] = Double.parseDouble(JOptionPane.showInputDialog("RE"));
//        alphabet[value] = Double.parseDouble(JOptionPane.showInputDialog("Beta"));
        //computed values
        RB[value] = (R1 * R2) / (R1 + R2);
        VTH[value] = (VCC[value] * R2) / (R1 + R2);
        IB[value] = (VTH[value] - VBE) / (RB[value] + (alphabet[value] + 1) * RE[value]);
        IE[value] = (alphabet[value] + 1) * IB[value];
        re[value] = 0.026 / IE[value];
        System.out.println("RTH " + RB[value]);
        System.out.println("VTH " + VTH[value]);
        System.out.println("IB " + IB[value]);
        System.out.println("IE " + IE[value]);
        System.out.println("re " + re[value]);
        //computed values AC
        Zi[value] = (RB[value] * (alphabet[value] * re[value])) / ((RB[value]) + (alphabet[value] * re[value]));
        Zo[value] = RC[value];
        Av[value] = -1 * (RC[value] / re[value]);
        Ai[value] = (alphabet[value] * RB[value]) / (RB[value] + (alphabet[value] * re[value]));
        System.out.println("Zi " + Zi[value]);
        System.out.println("Zo " + Zo[value]);
        System.out.println("Av " + Av[value]);
        System.out.println("Ai " + Ai[value]);
        //unused values
        VEE[value] = 0;
        RF1[value] = 0;
        RF2[value] = 0;

        System.out.println("Value: " + value);
    }

    public void VoltageDividerUnbypassed() {
        //needed values
        VCC[value] = Double.parseDouble(JOptionPane.showInputDialog("VCC"));
        R1 = Double.parseDouble(JOptionPane.showInputDialog("R1"));
        R2 = Double.parseDouble(JOptionPane.showInputDialog("R2"));
        RC[value] = Double.parseDouble(JOptionPane.showInputDialog("RC"));
        RE[value] = Double.parseDouble(JOptionPane.showInputDialog("RE"));
        alphabet[value] = Double.parseDouble(JOptionPane.showInputDialog("Beta"));
        //computed values
        RB[value] = (R1 * R2) / (R1 + R2);
        VTH[value] = (VCC[value] * R2) / (R1 + R2);
        IB[value] = (VTH[value] - VBE) / (RB[value] + (alphabet[value] + 1) * RE[value]);
        IE[value] = (alphabet[value] + 1) * IB[value];
        re[value] = 0.026 / IE[value];
        System.out.println("RTH " + RB[value]);
        System.out.println("VTH " + VTH[value]);
        System.out.println("IB " + IB[value]);
        System.out.println("IE " + IE[value]);
        System.out.println("re " + re[value]);
        //computed values AC
        Zb = alphabet[value] * RE[value];
        Zi[value] = (RB[value] * Zb) / (RB[value] + Zb);
        Zo[value] = RC[value];
        if (RE[value] >= 10 * re[value]) {
            Av[value] = -RC[value] / RE[value];
        }//exact
        else {
            Av[value] = -RC[value] / (re[value] + RE[value]);
        }
        Ai[value] = (-alphabet[value] * RB[value]) / (RB[value] + Zb);
        System.out.println("Zi " + Zi[value]);
        System.out.println("Zo " + Zo[value]);
        System.out.println("Av " + Av[value]);
        System.out.println("Ai " + Ai[value]);
        //unused values
        RF1[value] = 0;
        RF2[value] = 0;
        VEE[value] = 0;
        value++;
        System.out.println("Value: " + value);
    }

    public void EmitterBiasBypassed() {
        //needed values
        VCC[value] = Double.parseDouble(JOptionPane.showInputDialog("VCC"));
        RB[value] = Double.parseDouble(JOptionPane.showInputDialog("RB"));
        RC[value] = Double.parseDouble(JOptionPane.showInputDialog("RC"));
        RE[value] = Double.parseDouble(JOptionPane.showInputDialog("RE"));
        alphabet[value] = Double.parseDouble(JOptionPane.showInputDialog("Beta"));
        //computed values
        IB[value] = (VCC[value] - VBE) / (RB[value] + ((alphabet[value] + 1) * RE[value]));
        IE[value] = (alphabet[value] + 1) * IB[value];
        re[value] = 0.026 / IE[value];
        System.out.println("IB " + IB[value]);
        System.out.println("IE " + IE[value]);
        System.out.println("re " + re[value]);
        //computed values AC
        //Zb
        // RE >> re
        if (RE[value] >= 10 * re[value]) {
            Zb = alphabet[value] * RE[value];
        } else {
            Zb = alphabet[value] * (re[value] + RE[value]);
        }
        System.out.println("Zb " + Zb);
        //ZI
        Zi[value] = (RB[value] * (Zb)) / (RB[value] + (Zb));
        //ZO
        Zo[value] = RC[value];
        //AV
        Av[value] = (-1 * RC[value]) / re[value];
        //AI
        Ai[value] = alphabet[value];

        System.out.println("Zi " + Zi[value]);
        System.out.println("Zo " + Zo[value]);
        System.out.println("Av " + Av[value]);
        System.out.println("Ai " + Ai[value]);
        //unused values
        RF1[value] = 0;
        RF2[value] = 0;
        VEE[value] = 0;
        VTH[value] = 0;
        value++;
        System.out.println("Value: " + value);
    }

    public void EmitterBiasUnbypassed() {
        //needed values
        VCC[value] = Double.parseDouble(JOptionPane.showInputDialog("VCC"));
        RB[value] = Double.parseDouble(JOptionPane.showInputDialog("RB"));
        RC[value] = Double.parseDouble(JOptionPane.showInputDialog("RC"));
        RE[value] = Double.parseDouble(JOptionPane.showInputDialog("RE"));
        alphabet[value] = Double.parseDouble(JOptionPane.showInputDialog("Beta"));
        //computed values
        IB[value] = (VCC[value] - VBE) / (RB[value] + ((alphabet[value] + 1) * RE[value]));
        IE[value] = (alphabet[value] + 1) * IB[value];
        re[value] = 0.026 / IE[value];
        System.out.println("IB " + IB[value]);
        System.out.println("IE " + IE[value]);
        System.out.println("re " + re[value]);
        //computed values AC
        Zb = alphabet[value] * re[value];
        Zi[value] = (RB[value] * Zb) / (RB[value] + Zb);
        Zo[value] = RC[value];
        if (RE[value] > 10 * re[value]) {
            Av[value] = -(RC[value] / RE[value]);
        } else {
            Av[value] = -(RC[value]) / (re[value] + RE[value]);
        }
        Ai[value] = -(alphabet[value] * RB[value]) / (RB[value] + Zb);
        System.out.println("Zi " + Zi[value]);
        System.out.println("Zo " + Zo[value]);
        System.out.println("Av " + Av[value]);
        System.out.println("Ai " + Ai[value]);
        //unused values
        RF1[value] = 0;
        RF2[value] = 0;
        VEE[value] = 0;
        VTH[value] = 0;
        value++;
        System.out.println("Value: " + value);
    }

    public void CommonBase() {
        VCC[value] = Double.parseDouble(JOptionPane.showInputDialog("VCC"));
        VEE[value] = Double.parseDouble(JOptionPane.showInputDialog("VEE"));
        RC[value] = Double.parseDouble(JOptionPane.showInputDialog("RC"));
        RE[value] = Double.parseDouble(JOptionPane.showInputDialog("RE"));
        alphabet[value] = Double.parseDouble(JOptionPane.showInputDialog("Alpha"));
        //computed values
        IE[value] = (VEE[value] - VBE) / RE[value];
        re[value] = 0.026 / IE[value];
        //AC
        Zi[value] = (re[value] * RC[value]) / (re[value] + RC[value]);
        Zo[value] = RC[value];
        Av[value] = RC[value] / re[value];
        Ai[value] = alphabet[value];
        //unused
        RF1[value] = 0;
        RF2[value] = 0;
        RB[value] = 0;
        IB[value] = 0;
        VTH[value] = 0;
        value++;
    }

    public void EmitterFollower() {
        VCC[value] = Double.parseDouble(JOptionPane.showInputDialog("VCC"));
        RB[value] = Double.parseDouble(JOptionPane.showInputDialog("RB"));
        RE[value] = Double.parseDouble(JOptionPane.showInputDialog("RE"));
        alphabet[value] = Double.parseDouble(JOptionPane.showInputDialog("Beta"));
        //computed
        IB[value] = (VCC[value] - VBE) / (RB[value] + (alphabet[value] + 1) * RE[value]);
        IE[value] = (alphabet[value] + 1) * IB[value];
        re[value] = 0.026 / IE[value];
        //ac
//        if (ro[value] > 10 * (RE[value])) {
//            Zb = alphabet[value] * RE[value];
//            Zi[value] = ((RB[value] * (alphabet[value] * RE[value])) / (RB[value] + (alphabet[value] * RE[value])));
//        } else {
//            Zb = alphabet[value] * re[value] + (((alphabet[value] + 1) * RE[value]) / (1 + (RE[value] / ro[value])));
//            Zi[value] = ((RB[value] * (alphabet[value] * RE[value])) / (RB[value] + (alphabet[value] * RE[value])));
//        }
        if (RE[value] >= 10 * re[value]) {
            Zb = alphabet[value] * RE[value];
            Zi[value] = (RB[value] * Zb) / (RB[value] + Zb);
        } else {
            Zb = alphabet[value] * (re[value] * RE[value]);
            Zi[value] = (RB[value] * Zb) / (RB[value] + Zb);
        }
        if (RE[value] > 10 * re[value]) {
            Zo[value] = re[value];
        } else {
            Zo[value] = ((RE[value] * re[value]) / (RE[value] + re[value]));
        }
        Av[value] = 1;
        Ai[value] = (-alphabet[value] * RE[value]) / RB[value] + (RB[value] + Zb);

        RC[value] = 0;
        RF1[value] = 0;
        RF2[value] = 0;
        VEE[value] = 0;
        VTH[value] = 0;
        value++;
    }

    public void CollectorFeedbackWithoutRE() {
        VCC[value] = Double.parseDouble(JOptionPane.showInputDialog("VCC"));
        RF1[value] = Double.parseDouble(JOptionPane.showInputDialog("RF"));
        RC[value] = Double.parseDouble(JOptionPane.showInputDialog("RC"));
        alphabet[value] = Double.parseDouble(JOptionPane.showInputDialog("Beta"));
        //dc computed
        IB[value] = (VCC[value] - VBE) / (RF1[value] + (alphabet[value] * RC[value]));
        IE[value] = (alphabet[value] + 1) * IB[value];
        re[value] = (0.026 / IE[value]);
        //ac
        Zi[value] = (re[value]) / ((1 / alphabet[value]) + (RC[value] / (RC[value] + RF1[value])));
        Zo[value] = (RC[value] * RF1[value]) / (RC[value] + RF1[value]);
        Av[value] = -(RC[value] / re[value]);
//        Ai[value] = alphabet[value]*RF1[value]/(RF1[value]+ (alphabet[value]*RC[value]));
        Ai[value] = (alphabet[value] * RF1[value]) / (RF1[value] + (alphabet[value] * RC[value]));
        System.out.println("Zi " + Zi[value]);
        System.out.println("Zo " + Zo[value]);
        System.out.println("Av " + Av[value]);
        System.out.println("Ai " + Ai[value]);
        RB[value] = 0;
        RE[value] = 0;
        RF2[value] = 0;
        VEE[value] = 0;
        VTH[value] = 0;

        value++;
    }

    public void CollectorFeedbackwithRE() {
        VCC[value] = Double.parseDouble(JOptionPane.showInputDialog("VCC"));
        RF1[value] = Double.parseDouble(JOptionPane.showInputDialog("RF"));
        RC[value] = Double.parseDouble(JOptionPane.showInputDialog("RC"));
        RE[value] = Double.parseDouble(JOptionPane.showInputDialog("RE"));
        alphabet[value] = Double.parseDouble(JOptionPane.showInputDialog("Beta"));
        //dc computed
        IB[value] = (VCC[value] - VBE) / (RF1[value] + (alphabet[value] * RC[value]) + ((alphabet[value] + 1) * RE[value]));
        IE[value] = (alphabet[value] + 1) * IB[value];
        re[value] = (0.026) / IE[value];
        //ac
        Zi[value] = RE[value] / ((1 / alphabet[value]) + ((RE[value] + RC[value]) / (RF1[value])));
        Zo[value] = (RC[value] * RF1[value]) / (RC[value] + RF1[value]);
        Av[value] = -(RC[value] / RE[value]);

        Ai[value] = 1 / ((1 + alphabet[value]) + ((RE[value] + RC[value]) / RF1[value]));
        System.out.println("Zi " + Zi[value]);
        System.out.println("Zo " + Zo[value]);
        System.out.println("Av " + Av[value]);
        System.out.println("Ai " + Ai[value]);
        RB[value] = 0;
        RF2[value] = 0;
        VEE[value] = 0;
        VTH[value] = 0;
        value++;

    }

    public void CollectorFeedbackTwoRF() {
        VCC[value] = Double.parseDouble(JOptionPane.showInputDialog("VCC"));
        RF1[value] = Double.parseDouble(JOptionPane.showInputDialog("RF1"));
        RF2[value] = Double.parseDouble(JOptionPane.showInputDialog("RF2"));
        RC[value] = Double.parseDouble(JOptionPane.showInputDialog("RC"));
        alphabet[value] = Double.parseDouble(JOptionPane.showInputDialog("Beta"));
        //dc
        IB[value] = ((VCC[value] - VBE) / ((RF1[value] + RF2[value]) + (alphabet[value] * RC[value])));
        IE[value] = (alphabet[value] + 1) * IB[value];
        re[value] = (0.026) / IE[value];
        //ac
        Zi[value] = ((RF1[value]) * (alphabet[value] * re[value])) / ((RF1[value]) + (alphabet[value] * re[value]));
        Zo[value] = ((RC[value]) * (RF2[value])) / ((RC[value]) + (RF2[value]));
        Av[value] = -((Zo[value]) / (re[value]));
        Ai[value] = -Av[value] * Zi[value] / RC[value];
        System.out.println("Zi " + Zi[value]);
        System.out.println("Zo " + Zo[value]);
        System.out.println("Av " + Av[value]);
        System.out.println("Ai " + Ai[value]);
        RE[value] = 0;
        RB[value] = 0;
        VEE[value] = 0;
        VTH[value] = 0;
        value++;
    }

    public void CascadedValues() {

        ZiCascaded = Zi[0];
        ZoCascaded = Zo[number - 1];
        System.out.println("Input Voltage" + inputVoltage);
        System.out.println("Zi Final:" + ZiCascaded);
        System.out.println("Zo Final:" + ZoCascaded);
        System.out.println("Av Final:" + AvCascaded);
    }

    public double AvLoaded() {
        int counter = 0;
        AvCascaded = 1;
        while (counter < (number - 1)) {
//            AvL[counter] = parallel(Av[counter],Zi[counter+1]);
            System.out.println("Av:" + Av[counter]);
            System.out.println("Zi:" + Zi[counter + 1]);
            System.out.println("Zo:" + Zo[counter]);
            AvL[counter] = (Zi[counter + 1] * Av[counter]) / (Zi[counter + 1] + Zo[counter]);
            System.out.println("AvL " + counter + ": " + AvL[counter]);
            AvCascaded = AvCascaded * AvL[counter];
            counter++;
        }
        AvL[counter] = Av[counter];
        AvCascaded = AvCascaded * AvL[counter];
        System.out.println("AvL " + counter + ": " + AvL[counter]);
        return AvCascaded;
    }
    // Effects of RL, RS and Combined Effects

    public void EffectsOfRL() {
        AvLoaded = RLoad * AvCascaded / (RLoad + ZoCascaded);
        AiLoaded = -AvLoaded * ZiCascaded / RLoad;
        outputVoltage = AvCascaded * inputVoltage;
        loadVoltage = RLoad * outputVoltage / (ZoCascaded + RLoad);
        System.out.println("Loaded Av: " + AvLoaded);
        System.out.println("Loaded Ai: " + AiLoaded);
        System.out.println("Output Voltage: " + outputVoltage);
        System.out.println("Load Voltage: " + loadVoltage);
    }

    public void EffectsOfRS() {
        inputVoltage = ZiCascaded * sourceVoltage / (ZiCascaded + Rsense);
        Avs = ZiCascaded * AvCascaded / (ZiCascaded * Rsense);
        outputVoltage = Avs / sourceVoltage;
        System.out.println("Input Voltage: " + inputVoltage);
        System.out.println("Avs: " + Avs);
        System.out.println("Vo: " + outputVoltage);

    }

    public void CombinedEffects() {
        AvLoaded = RLoad * AvCascaded / (RLoad + ZoCascaded);
        Avs = (ZiCascaded / (ZiCascaded * Rsense)) * (RLoad / (RLoad + ZoCascaded)) * AvCascaded;
        AiLoaded = -AvCascaded * ZiCascaded / RLoad;
        inputVoltage = ZiCascaded * sourceVoltage / (ZiCascaded + Rsense);
        outputVoltage = sourceVoltage * Avs;
        System.out.println("Ai Loaded: " + AiLoaded);
        System.out.println("Av Loaded: " + AvLoaded);
        System.out.println("Input Voltage: " + inputVoltage);
        System.out.println("Avs: " + Avs);
        System.out.println("Vo: " + outputVoltage);

    }

}
