package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ06 {
    public static void main(String args[]) {
        double x, y, aux;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite y: "));
        aux = x;
        x = y;
        y = aux;
        JOptionPane.showMessageDialog(null,"O valor de x: " + x);
        JOptionPane.showMessageDialog(null,"O valor de y: " + y);
    }
}
