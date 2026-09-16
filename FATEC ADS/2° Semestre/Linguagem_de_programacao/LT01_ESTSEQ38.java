import javax.swing.JOptionPane;
    public class LT01_ESTSEQ38 {
        public static void main (String args []) {
            int i, n;
            int maior = 0;
            int menor = 0;
            for (i=1; i<=100; i++)
            {
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º número positivo:"));
                if (n<=0)
                {
                    System.out.println("Digite o um valor positivo");
                    i--;
                }
                else
                {
                    if (n==1)
                    {
                        maior = n;
                        menor = n;
                    }
                    else
                    {
                        if (n>maior)
                        {
                        maior = n;
                        }
                        if (n<menor)
                        {
                        menor = n;
                        }
                    }
                }
            }
        System.out.println("O maior número digitado é " +maior);
        System.out.println("O menor número digitado é " +menor);
        }
    }