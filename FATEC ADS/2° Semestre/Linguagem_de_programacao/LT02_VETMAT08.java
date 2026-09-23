import javax.swing.*;
    public class LT02_VETMAT08 {
        public static void main (String args []) {
            int mat [][] = new int [4][3];
            carregaMat(mat);
            qtdProduto(mat);
            qtdSemana(mat);
            totalMes(mat);
    }
        static void carregaMat(int mat [][]){
            for(int i=0; i<4; i++)
            {
                for(int j=0; j<3; j++)
                {
                    mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida - Semana " + (i + 1)
                        + " Produto " + (j + 1)));
                }
            }
        }
        static void qtdProduto(int mat [][]){
            for (int j =0; j<3;j++)
            {
                int soma = 0;
                for (int i=0; i<4; i++)
                {
                    JOptionPane.showMessageDialog(null, "Produto "+ (j+1) + ": " + soma);
                }
            }
        }
        static void qtdSemana(int mat [][]){
            for (int i=0; i<4; i++)
            {
                int soma = 0;
                for (int j=0; j<3; j++)
                {
                    soma = soma + mat [i][j];
                }
            JOptionPane.showMessageDialog(null, "Semana " + (i+1) + ": " +soma);
            }
        }
        
        static void totalMes(int mat [][]){
            int total = 0;
            for (int i=0; i<4; i++)
            {
                for (int j=0; j<3; j++)
                {
                    total = total + mat [i][j];
                }
            }
        JOptionPane.showMessageDialog(null, "Total de produtos vendidos no mês: " +total);    
        }  
}
