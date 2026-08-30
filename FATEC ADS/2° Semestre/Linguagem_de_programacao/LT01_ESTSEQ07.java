package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ07 {
    public static void main(String args[]) {
        double v, c, l, h;
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo: "));
        l = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura do paralelepípedo: "));
        h = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do paralelepípedo: "));
        v = (c * l * h);
        JOptionPane.showMessageDialog(null,"O volume do paralelepípedo é: " + v);
            }
}
