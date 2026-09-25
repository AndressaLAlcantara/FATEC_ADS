import javax.swing.*;
    public class LT02_VETMAT10 {
        public static void main (String args []){
            double mat[][] = new double [4][4];
            double soma = 0;
            int casa = 0;
            for (int i=0; i<4; i++){
                for (int j=0; j<4; j++)
                {
                    mat[i][j]= Recursiva(2, casa);
                    soma = soma + mat [i][j];
                    casa++;
                }
            }
            System.out.print("A soma das casas é: " +soma);
        }
        
        public static int Recursiva (int base, int exp){
            if (exp==0)
            {
                return 1;
            }
            else
            {
                int pot = base*Recursiva(base, exp -1);
                return pot;
            }
        }
    
}
