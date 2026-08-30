import javax.swing.JOptionPane;
    public class LT01_ESTSEQ26 {
        public static void main (String args []) {
            int n1, n2, maior, menor;
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
            if (n1==n2)
            {
                System.out.print("Os números são iguais e, portanto, múltiplos entre si");
            }
            else {
                if (n1>n2)
                {
                    maior = n1;
                    menor = n2;
                }
                else {
                    maior = n2;
                    menor = n1;
                }
                if (menor ==0)
                {
                    System.out.print("O menor número é 0, não existe essa divisão na matemática");
                }
                else if (maior%menor ==0)
                {
                    System.out.print("O maior é múltiplo do menor");
                }
                else {
                    System.out.print("O maior não é múltiplo do menor");
                }
            }
        }
    }