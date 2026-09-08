import javax.swing.JOptionPane;
    public class LT01_ESTSEQ36 {
        public static void main (String args []) {
            double n, soma, fat, i;
            n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
            soma = 1;
            fat = 1;
            for (i=1; i<=n; i++)
            {
                fat = fat * i;
                soma = soma + 1/fat;
            }
            System.out.print("A soma da série é: " +soma);
        }
    }
