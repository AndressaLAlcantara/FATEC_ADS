import javax.swing.JOptionPane;
    public class LT01_ESTDEC03 {
        public static void main (String args []) {
            double delta, a, b, c, x1, x2;
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente A"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente B"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente C"));
            delta = (Math.pow(b,2))-(4*a*c);
                if (delta<0)
                {
                    System.out.print("Não existem raízes reais");
                }
                else {
                    x1 = (-b + (Math.sqrt(delta)))/(2*a);
                    x2 = (-b - (Math.sqrt(delta)))/(2*a);
                    System.out.print("As raízes são" +x1 +x2);
                }
        }
    }
