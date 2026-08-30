import javax.swing.JOptionPane;
    public class LT01_ESTSEQ23 {
        public static void main (String args []) {
            double v1, v2, v3, v4;
            v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
            v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um segundo valor maior que o primeiro"));
            v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um terceiro valor maior que o segundo"));
            v4 = Double.parseDouble(JOptionPane.showInputDialog("Digite um quarto valor"));
            if (v4>v3)
            {
                System.out.print("Os valores em ordem crescente são: " +v1 +v2 +v3 +v4);
            }
            else {
                if (v4>v2)
                {
                    System.out.print("Os valores em ordem crescente são: " +v1 +v2 +v4 +v3);
                }
                else {
                    if (v4>v1)
                    {
                        System.out.print("Os valores em ordem crescente são: " +v1 +v4 +v2 +v3);
                    }
                    else {
                        System.out.print("Os valores em ordem crescente são: " +v4 +v1 +v2 +v3);
                    }
                }
            }
        }
    }   
    
