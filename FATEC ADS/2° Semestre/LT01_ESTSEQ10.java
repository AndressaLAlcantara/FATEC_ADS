package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ10 {
    public static void main(String args[]) {
        double x, y, sub;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número real: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número real: "));
        sub = (x-y);
        JOptionPane.showMessageDialog(null,"A subtração desses valores é: " + sub);
            }
}
