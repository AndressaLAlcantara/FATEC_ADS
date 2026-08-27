package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ05 {
    public static void main(String args[]) {
        double delta, a, b, c, x1, x2;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite C: "));
        delta = (Math.pow(b,2) - (4*a*c));
        x1 = ((-b)+(Math.sqrt(delta)))/(2*a);
        x2 = ((-b)-(Math.sqrt(delta)))/(2*a);     
        JOptionPane.showMessageDialog(null,"As raízes são : " + x1 + x2);
    }
}
