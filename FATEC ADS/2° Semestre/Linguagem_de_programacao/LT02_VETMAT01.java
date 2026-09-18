import javax.swing.JOptionPane;
public class LT02_VETMAT01 {
    public static void main (String arg []) {
        int vt [] = new int [50];
        int soma = 0;
        int soma_impares = 0;
        double media;
        int quantidade = 0;
       
        for (int i=0; i<50; i++)
        {

            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            if (vt[i]>10 && vt[i]<200)
            {
                soma=soma+vt[i];
                quantidade+=1;
            } 
            if (vt[i]%2!=0) {
                soma_impares=soma_impares+vt[i];
            }
        }
        media = soma/quantidade;
        System.out.println("A média dos valores é: " +media);
        System.out.println("A soma dos ímpares é: " +soma_impares);
        }
    }


        