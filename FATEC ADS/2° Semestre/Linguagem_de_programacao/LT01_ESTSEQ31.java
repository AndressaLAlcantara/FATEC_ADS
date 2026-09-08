import javax.swing.JOptionPane;
    public class LT01_ESTSEQ31 {
        public static void main (String args []) {
            int n, i;
            i = 10;
            while (i >= 10 && i <= 150){
                n = i * i;
                System.out.print("O quadrado de " + i + "é: " + n);
                i = i + 1;
            }
        }
    }