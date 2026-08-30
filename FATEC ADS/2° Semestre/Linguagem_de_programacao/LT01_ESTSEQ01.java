package estrutura_sequencial_01;

import javax.swing.JOptionPane;
public class LT01_ESTSEQ01 {
    public static void main (String args [ ] ) {
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do lado: "));
        area = lado * lado;
        JOptionPane.showMessageDialog(null,"A área do quadrado é : " + area);
    }
}
