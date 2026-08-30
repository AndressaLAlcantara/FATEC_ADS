package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ13 {
    public static void main(String args[]) {
        double qt1, qt2, dias;
        qt1 = Double.parseDouble(JOptionPane.showInputDialog("A quantidade de alimento em quilos é:  "));
        qt2 = (qt1*1000);
        dias = (qt2/50);
        JOptionPane.showMessageDialog(null,"O alimento durará em dias: " + dias);
            }
}
