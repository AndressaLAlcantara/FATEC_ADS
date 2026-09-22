import javax.swing.JOptionPane;
    public class LT01_ESTSEQ40 {
        public static void main (String args []) {
            int x, y, menor, maior, i, divisores, j;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
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
            for (i=menor;i<=maior;i++)  //esse for percorre todos os números entre os que foram dados
            {
                divisores = 0;
                for (j=1; j <=i; j++) //esse for é para identificar os divisores de cada i. Número primo é aquele é só divide por 1 e ele mesmo.
                {
                    if (i%j==0)
                    {
                        divisores = divisores + 1;
                    }
                }
                if (divisores ==2) //se além de ele mesmo e 1, divide por outro valor, não é primo. Se sim, é primo (dois divisores)
                {
                    System.out.print(i + " ");
                }
            }
        }
    }
    
    

