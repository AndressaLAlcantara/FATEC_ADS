import javax.swing.JOptionPane;
    public class LT01_MODPROC19 {
        static double x, y, maior;
        public static void main (String args []) {
            x = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor real: "));
            y = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor real: "));
            ProcedureCalc();
            JOptionPane.showMessageDialog(null, "O maior deles é: " +maior);
            }
        static void ProcedureCalc()
        {
            if (x>y)
            {
                maior = x;
            }
            else
            {
                maior = y;
            }
        }
    }