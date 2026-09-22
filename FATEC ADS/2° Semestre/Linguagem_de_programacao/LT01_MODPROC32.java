import javax.swing.JOptionPane;
    public class LT01_MODPROC32 {
        public static int Fatorial(int n) {
            int fat = 1;
            for (int i=n; i>1; i--)
            {
                fat = fat * i;
            }
            return fat;
        }
        public static void main (String args []) {
            int num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número que deseja saber o fatorial"));
            JOptionPane.showMessageDialog(null,"O fatorial desse número é: " + Fatorial(num));
        }
    }
