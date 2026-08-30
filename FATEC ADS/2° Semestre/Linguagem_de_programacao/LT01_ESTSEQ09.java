package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ09 {
    public static void main(String args[]) {
        double x, y, s;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
        s = ((Math.pow(x,2)))+((Math.pow(y,2)));
        JOptionPane.showMessageDialog(null,"A soma do quadrado desses valores é: " + s);
            }
}
