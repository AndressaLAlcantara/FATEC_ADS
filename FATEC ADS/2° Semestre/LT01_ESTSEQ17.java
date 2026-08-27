package estrutura_sequencial_01;

import javax.swing.JOptionPane;

public class LT01_ESTSEQ17 {
    public static void main(String args[]) {
        double qt, t, vm;
        t = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo do percurso:  "));
        vm = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média do percurso:  "));
        qt = (vm*t)/12;
        JOptionPane.showMessageDialog(null,"A quantidade de litros gastos na viagem é: " + qt);
            }
}
