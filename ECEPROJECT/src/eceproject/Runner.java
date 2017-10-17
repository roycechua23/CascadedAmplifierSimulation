package eceproject;

import javax.swing.JOptionPane;

public class Runner {

    public static void main(String[] args) {

        ConfigurationsCom config = new ConfigurationsCom();
        int systemsNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of systems"));
        double Rsense, RLoad, sourceVoltage;
//        System.out.println(systemsNum);
        config.number = systemsNum;
        
        config.initialize();
        if (systemsNum > 0) {
            String choice;
            String configurations = "\n[1] Fixed Bias\n[2]Voltage Divider\n[3]Emitter Bias\n[4]Common Base\n[5]Emitter Follower\n[6]Collector Feedback";

            do {
                choice = JOptionPane.showInputDialog("Enter configuration #" + (config.value + 1) + ": " + configurations);
                switch (choice) {
                    case "1":
                        System.out.println("Fixed Bias");
                        config.FixedBias();
                        break;
                    case "2":
                        System.out.println("Voltage Divider");
                        String vdchoice;
                        vdchoice = JOptionPane.showInputDialog("Condition for RE: \n[1]Bypassed\n[2]Unbypassed");
                        switch (vdchoice) {
                            case "1":
                                config.VoltageDividerBypassed();
                                break;
                            case "2":
                                config.VoltageDividerUnbypassed();
                                break;
                            default:
                                System.out.println("Invalid Input");
                                continue;
                        }
                        break;
                    case "3":
                        System.out.println("Emitter Bias");
                        String ebchoice;
                        ebchoice = JOptionPane.showInputDialog("Condition for RE: \n[1]Bypassed\n[2]Unbypassed");
                        switch (ebchoice) {
                            case "1":
                                config.EmitterBiasBypassed();
                                break;
                            case "2":
                                config.EmitterBiasUnbypassed();
                                break;
                            default:
                                System.out.println("Invalid Input");
                                continue;
                        }
                        break;
                    case "4":
                        config.CommonBase();
                        break;
                    case "5":
                        config.EmitterFollower();
                        break;
                    case "6":
                        System.out.println("Collector Feedback");
                        String cfchoice;
                        cfchoice = JOptionPane.showInputDialog("Condition: \n[1]without RE\n[2]with RE\n[3]Two RF");
                        switch (cfchoice) {
                            case "1":
                                config.CollectorFeedbackWithoutRE();
                                break;
                            case "2":
                                config.CollectorFeedbackwithRE();
                                break;
                            case "3":
                                config.CollectorFeedbackTwoRF();
                                break;
                            default:
                                System.out.println("Invalid Input");
                                continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        continue;
                }
                System.out.println(choice);
            } while (config.value < systemsNum);
        } else {
            System.out.println("Invalid input!");
        }

        config.AvLoaded();
        config.CascadedValues();
        
        
//        
//        String effects = "[1] Effects of Rs\n[2]Effects of RL\n[3]Combined Effects of Rs and RL";
//        String effectChoice = JOptionPane.showInputDialog("Choose effect on cascaded system\n" + effects);
//        boolean condition = false;
//        do {
//            switch (effectChoice) {
//                case "1":
//                    sourceVoltage = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter input voltage"));
//                    config.sourceVoltage = sourceVoltage;
//                    Rsense = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Rsense "));
//                    config.Rsense = Rsense;
//                    config.EffectsOfRS();
//                    condition = true;
//                    break;
//                case "2":
//                    sourceVoltage = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter input voltage"));
//                    config.inputVoltage = sourceVoltage;
//                    RLoad = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter RLoad "));
//                    config.RLoad = RLoad;
//                    
//                    config.EffectsOfRL();
//                    condition = true;
//                    break;
//                case "3":
//                    config.CombinedEffects();
//                    condition = true; 
//                    break;
//                default:
//                    System.out.println("Invalid input!");
//                    continue;
//            }
//        } while (condition != true);

    }

}
