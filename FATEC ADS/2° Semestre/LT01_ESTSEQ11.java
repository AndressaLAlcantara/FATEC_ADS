package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ11 {
    public static void main(String args[]) {
        double c, r;
        r = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio da circunferência: "));
        c = (2*3.14*r);
        JOptionPane.showMessageDialog(null,"O comprimento da circunferência é: " + c);
            }
}

