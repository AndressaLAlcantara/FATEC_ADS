import javax.swing.JOptionPane;
    public class LT01_ESTSEQ35 {
        public static void main (String args []) {
            int x, y, maior, menor, i, soma;
                x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
                if (x>y) 
                {
                    maior = x;
                    menor = y;
                }
                else
                {
                    maior = y;
                    menor = x;
                }
                soma = 0;
                for (i = menor; i<= maior; i++)
                {
                    if (i%2 != 0)
                    {
                    soma = soma +i;
                    }
                }
                System.out.print("A soma dos números ímpares entre o menor e o maior é: " +soma);
                
                
            }
        }
