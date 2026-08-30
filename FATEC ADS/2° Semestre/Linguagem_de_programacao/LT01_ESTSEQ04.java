package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ04 {
    public static void main(String args[]) {
        double c, f;
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus celsius: "));
        f = (9*c + 160)/5;
        JOptionPane.showMessageDialog(null,"A temperatura em Fahrenheit é : " + f);
    }
}
