import javax.swing.JOptionPane;
    public class LT01_MODPROC21 {
        static double n1, n2, n3, n4, media;
        public static void main (String args []) {
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
            n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
            n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));
            ProcedureCalc();
            }
        static void ProcedureCalc() {
            media = (n1+n2+n3+n4)/4;
            if (media >= 6.0)
            {
                JOptionPane.showMessageDialog(null,"APROVADO");
            }
            else {
                if (media >= 3.0)
                {
                    JOptionPane.showMessageDialog(null, "EXAME");
                }
                else {
                    JOptionPane.showMessageDialog(null, "RETIDO");
                }
            }
        }   
    }
