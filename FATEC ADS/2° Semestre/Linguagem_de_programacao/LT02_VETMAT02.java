import javax.swing.JOptionPane;
    public class LT02_VETMAT02 {
        public static void main (String args []) {
            int vt [] = new int [100];
            
            preencherVetor(vt);
            
            int soma = calcularSoma(vt);
            double media = calcularMedia (soma, 100);
            int maior = encontrarMaior (vt);
            int menor = encontrarMenor (vt);
            
            mostrarResultados(maior, menor, media);
        }
        public static void preencherVetor(int vt []) {
            for (int i=0; i<100; i++)
            {
                vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            }
        }    
                        
        public static int encontrarMaior(int vt []){     
            int maior = vt [0];
            for (int i=0; i<100; i++) {
                if (vt [i]>maior)
                {
                    maior = vt[i];
                }
            }
            return maior;
        }
        public static int encontrarMenor(int vt[]){
            int menor = vt [0];
            for (int i=0; i<100; i++) {
                if (vt[i]<menor)
                {
                    menor = vt[i];
                }
            }
            return menor;
        }
        public static int calcularSoma(int vt[]) {
            int soma = 0;
            for (int i =0; i<100; i++)
            {
                soma = soma + vt[i];
            }
                return soma;
       }
        public static double calcularMedia(int soma, int quantidade){
            return (double) soma/quantidade;
        }
        
        public static void mostrarResultados(int maior, int menor, double media){
            JOptionPane.showMessageDialog(null, "O maior valor é: " +maior);
            JOptionPane.showMessageDialog(null, "O menor valor é: " +menor);
            JOptionPane.showMessageDialog(null, "A média dos valores é: " +media);
        }  
    }
