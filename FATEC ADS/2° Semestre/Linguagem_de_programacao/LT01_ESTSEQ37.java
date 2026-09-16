import javax.swing.JOptionPane;
    public class LT01_ESTSEQ37 {
        public static void main (String args []) {
            int n, i;
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            if (n<=0)
            {
                System.out.print("Valor inválido, digite um valor positivo");
            }
            else
            {
                if (n==1 || n==2)
                {
                    System.out.println("O " +n+ "º termo de Fibonacci é: 1");
                }
                else
                {
                    int penultimo = 1;
                    int ultimo = 1;
                    int atual = 0;
                    for (i=3; i<=n; i++)
                    {
                        atual = ultimo + penultimo;
                        penultimo = ultimo;
                        ultimo = atual;
                    }
                    System.out.println("O " + n + "º termo de Fibonacci é: " +atual);
                }
            }    
        }
    }