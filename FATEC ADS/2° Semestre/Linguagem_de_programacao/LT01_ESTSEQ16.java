package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ16 {
    public static void main(String args[]) {
        double ht, vh, pd, desc, s1, s2;
        ht = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas:  "));
        vh = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora:  "));
        pd = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:  "));
        desc = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de descendentes:  "));
        s1 = (ht*vh);
        s2 = (s1-(s1*(pd/100))+(100*desc));
        JOptionPane.showMessageDialog(null,"O salário a receber é: " + s2);
            }
}
