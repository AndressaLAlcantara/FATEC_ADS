import javax.swing.JOptionPane;
    public class LT01_ESTSEQ28 {
        public static void main (String args []) {
            double p1, m, p2;
            p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto"));
            m = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal desse produto"));
            if (m <500 && p1 <30)
            {
                p2 = (p1 * 1.10);
            }
            else if (m >=500 && m<1000 && p1 >=30 && p1 <80) {
                p2 = (p1 *1.15);
            }
            else if (m >= 1000 && p1 >=80) {
                p2 = (p1 * 0.95);
            }
            else {
                p2 = p1;
            }
            System.out.print("O preço do produto agora é: " +p2);
        
        }
    }