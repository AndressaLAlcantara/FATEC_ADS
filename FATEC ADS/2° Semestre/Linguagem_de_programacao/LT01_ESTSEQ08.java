package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ08 {
    public static void main(String args[]) {
        double v1, v2;
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do depósito na poupança: "));
        v2 = (v1 * 1.013);
        JOptionPane.showMessageDialog(null,"O valor após um mês de aplicação é: " + v2);
            }
}

