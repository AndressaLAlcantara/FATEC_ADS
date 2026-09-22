import javax.swing.JOptionPane;
    public class LT01_MODPROC22 {
        static int x1, x2;
        public static void main (String args []) {
            x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            x2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
            ProcedureDif();
        }
        static void ProcedureDif() {
            if (x1 >x2)
            {
                JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são: " +x2+ " e " +x1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " +x1+ " e " +x2);
            }
        } 
    }
