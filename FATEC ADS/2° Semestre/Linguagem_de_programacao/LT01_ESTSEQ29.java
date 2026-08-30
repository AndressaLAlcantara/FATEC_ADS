import javax.swing.JOptionPane;
    public class LT01_ESTSEQ29 {
        public static void main (String args []) {
            int invest;
            double v1, v2;
            invest = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para poupança, 2 para renda fixa"));
            v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido"));
            if (invest == 1)
            {
                v2 = v1 * 1.03;
                System.out.print("O valor corrigido após 30 dias é: " +v2);
            }
            else if (invest == 2) {
                v2 = v1 * 1.05;
                System.out.print("O valor corrigido após 30 dias é: " +v2);
            }
            else {
                System.out.print("Investimento não considerado");
            }
        }
    }