import javax.swing.JOptionPane;
    public class LT01_MODPROC23 {
    static double v1, v2, v3, v4;
    public static void main (String args []) {
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um segundo valor maior que o primeiro"));
        v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um terceiro valor maior que o segundo"));
        v4 = Double.parseDouble(JOptionPane.showInputDialog("Digite um quarto valor"));
        ProcedureOrdem();
        }
    static void ProcedureOrdem() {
        if (v4>v3)
            {
                JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são: " +v1+" , " +v2+ " , " +v3+ " , " +v4);
            }
            else 
            {
                if (v4>v2)
                {
                    JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são: " +v1+ " , " +v2+ " , " +v4+ " , " +v3);
                }
                else 
                {
                    if (v4>v1)
                    {
                        JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são: " +v1+ " , " +v4+ " , " +v2+ " , " +v3);
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são: " +v4+ " , " +v1+ " , " +v2+ " , " +v3);
                    }
                }
            }
        }
    }


