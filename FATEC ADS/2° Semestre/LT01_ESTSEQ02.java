package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ02 {
    public static void main(String args[]) {
        double s1, s2;

        s1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o salário do funcionário: ")
        );

        s2 = s1 * 1.15;

        JOptionPane.showMessageDialog(
            null,
            "O novo salário é : " + s2
        );
    }
}