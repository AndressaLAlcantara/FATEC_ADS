import javax.swing.JOptionPane;
    public class LT01_ESTSEQ18 {
        public static void main (String args []) {
            int x, y, dif;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor inteiro"));
            if (x>y)
            {
                dif = x - y;
                System.out.print(dif + "O valor da diferença é");
            }
            else {
                dif = y - x;
                System.out.print(dif + "O valor da diferença é");
            }
        }
    }
