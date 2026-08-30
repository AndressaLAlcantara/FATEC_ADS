package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ03 {
    public static void main(String args[]) {
        double base, altura, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da base do triângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da altura do triângulo: "));
        area = base * altura / 2;
        JOptionPane.showMessageDialog(null,"A área do triângulo é : " + area);
    }
}
