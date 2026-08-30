import javax.swing.JOptionPane;
    public class LT01_ESTDEC04 {
        public static void main (String args []) {
            double n1, n2, n3, n4, media;
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
            n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
            n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));
            media = (n1+n2+n3+n4)/4;
            if (media >= 6.0)
            {
                    System.out.print("APROVADO");
            }
            else {
                if (media >= 3.0)
                {
                    System.out.print("EXAME");
                }
                else {
                    System.out.print("RETIDO");                 
                }
            }
        }
    }