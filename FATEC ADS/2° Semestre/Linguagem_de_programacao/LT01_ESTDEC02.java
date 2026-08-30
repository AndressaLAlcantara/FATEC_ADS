import javax.swing.JOptionPane;
    public class LT01_ESTDEC02 {
        public static void main (String args []) {
            double x, y, maior;
            x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
            y = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número real"));
                if (x>y)
                {
                    System.out.print(x + "é o maior");
                }
                else {
                    System.out.print(y + "é o maior");
                }
        }
    }