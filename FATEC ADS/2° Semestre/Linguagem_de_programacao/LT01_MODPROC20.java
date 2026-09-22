import javax.swing.JOptionPane;
    public class LT01_MODPROC20 {
        static double delta, a, b, c, x, x1, x2;
        public static void main (String args []) {
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a na equação de segundo grau: "));
            b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b na equação de segundo grau: "));
            c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c na equação de segundo grau "));
            ProcedureCalc();
            }
            static void ProcedureCalc() {
                delta = (Math.pow(b,2))-(4*a*c);
                if (delta<0)
                {
                    JOptionPane.showMessageDialog(null, "Não existem raízes reais");
                }
                else if (delta == 0)
                {
                    x = ((-b)/(2*a));
                    JOptionPane.showMessageDialog(null, "Só existe uma raíz real: " +x);
                }
                else if (delta > 0)
                {
                    x1 = ((-b)+ (Math.sqrt(delta))/(2*a));
                    x2 = ((-b)- (Math.sqrt(delta))/(2*a));
                    JOptionPane.showMessageDialog(null,"Existem duas raízes reais: " +x1+ "e" +x2);
                }
            }   
        }