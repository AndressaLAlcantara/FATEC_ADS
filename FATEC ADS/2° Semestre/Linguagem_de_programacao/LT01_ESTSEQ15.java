package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ15 {
    public static void main(String args[]) {
        double h, c1, c2;
        c1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro cateto do triângulo:  "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo cateto do triângulo:  "));
        h = (Math.sqrt((c1*c1)+(c2*c2)));
        JOptionPane.showMessageDialog(null,"A hipotenusa é: " + h);
            }
}
