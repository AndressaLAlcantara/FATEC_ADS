import javax.swing.JOptionPane;
    public class LT01_ESTSEQ22 {
        public static void main (String args []) {
            int x1, x2;
            x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            x2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor inteiro"));
            if (x1>x2)
            {
                System.out.print("Os valores em ordem crescente são: " + x2 + x1);
            }
            else {
                System.out.print("Os valores em ordem crescente são: " + x1 + x2);
            }
        }
    }
    
