package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ14 {
    public static void main(String args[]) {
        double a1, a2, a3;
        a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro ângulo do triângulo:  "));
        a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo ângulo do triângulo:  "));
        a3 = (180-a1-a2);
        JOptionPane.showMessageDialog(null,"O terceiro ângulo é: " + a3);
            }
}
