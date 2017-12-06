import javax.swing.*;

public class CalcDriver {
    public static void main(String[] args){
        double [] num = new double[10];
        num[0] = 11.2;
        num[1] = 4.0;
        num[2] = 20.3;
        num[3] = 18.9;
        num[4] = 7.4;
        num[5] = 12.6;
        num[6] = 20.4;
        num[7] = 16.8;
        num[8] = 9.3;
        num[9] = 14.7;
        System.out.println(Calc.sort(num));
        JOptionPane input = new JOptionPane(Calc.sort(num));
    }
}