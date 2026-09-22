import javax.swing.JOptionPane;
    public class LT01_MODPROC24 {
        static int x;
        public static void main (String args []) {
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            ProcedureDiv();
        }
    static void ProcedureDiv() {
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
