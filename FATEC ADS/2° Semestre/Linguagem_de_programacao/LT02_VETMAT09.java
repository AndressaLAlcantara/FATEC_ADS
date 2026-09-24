import javax.swing.*;
    public class LT02_VETMAT09 {
        public static void main (String args []){
            int mat[][] = new int [4][4];
            int i;
            int j;
            for (i = 0; i<4; i++)    //esse for serve para preencher as linhas
            {
                for(j=0; j<4; j++)  // esse for serve para preencher as colunas
                {
                    if (i==j)
                    {
                        mat[i][j]= Recursiva(4, i);
                    }
                }
            }
            for (int z=0; z<4; z++)     //esse for serve para MOSTRAR as linhas
            {
                for (int y=0; y<4; y++)  //esse for serve para MOSTRAR as colunas
                {
                    System.out.print( " " +mat[z][y]);
                }
                System.out.print("\n");  //pula linha
            }
        }
        public static int Recursiva(int base, int exp) {      //como é uma potência de base 4 na diagonal, faz uma recursiva
            if (exp==0)                                      //4^0 = 1
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
