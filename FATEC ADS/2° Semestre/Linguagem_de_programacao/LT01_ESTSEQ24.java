import javax.swing.JOptionPane;
    public class LT01_ESTDEC07 {
        public static void main (String args []) {
            int x;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            if (x%2 == 0 && x%3 == 0)
            {
                System.out.print("O valor é divisível por 2 e por 3");
            }
            else {
                if (x%2 ==0 && x%3 != 0)
                {
                System.out.print("O valor é divisível por 2, mas não por 3");
                }
                else {
                    if (x%2 != 0 && x%3 == 0)
                    {
                        System.out.print("O valor não é divisível por 2, mas sim por 3");
                    }
                    else {
                        System.out.print("O valor não é divisível por 2 e por 3");
                    }
                    
                }
          
            }

        }
    }
