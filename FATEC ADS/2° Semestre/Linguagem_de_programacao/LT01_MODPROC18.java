import javax.swing.JOptionPane;
    public class LT01_MODPROC18 {
        static int x, y , dif;
        public static void main (String args []) {
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
            ProcedureCalc();
            JOptionPane.showMessageDialog(null, "A diferença do maior pelo menor é de: " +dif);
        }
        static void ProcedureCalc()
        {
            if (x>y)
            {
                dif = x-y;
            }
            else
            {
                dif = y-x;
            }
        }
    }