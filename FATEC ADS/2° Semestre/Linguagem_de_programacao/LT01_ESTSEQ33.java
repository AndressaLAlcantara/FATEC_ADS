import javax.swing.JOptionPane;
    public class LT01_ESTSEQ33 {
        public static void main (String args []) {
            double i, n, s;
            n = Double.parseDouble(JOptionPane.showInputDialog("Digite o número que deseja que a série pare: "));
            s =1;
            for (i=1; i<=n; i++) {
                s = s + 1/i;
            }
            System.out.print("O resultado da série é: " +s);
           
        }
    }
