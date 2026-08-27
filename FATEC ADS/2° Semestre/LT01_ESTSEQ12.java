package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ12 {
    public static void main(String args[]) {
        int a1, a2, idade1, idade2;
        a1 = Integer.parseInt(JOptionPane.showInputDialog("Qual seu ano de nascimento? "));
        a2 = Integer.parseInt(JOptionPane.showInputDialog("Qual ano estamos? "));
        idade1 = (a2 - a1);
        idade2 = (idade1 + 17);
        JOptionPane.showMessageDialog(null,"A sua idade é: " + idade1);
        JOptionPane.showMessageDialog(null,"A sua idade daqui 17 anos é: " + idade2);
            }
}