    public class LT02_VETMAT11 {
        public static void main (String args []){
            int mat[][] = new int [8][8];
            int x;
            int y;
            int z;
            for (z=1;z<=4;z++)
            {
                for(x=(z-1); x<=(8-z); x++)
                {
                    for(y=(z-1); y<=(8-z); y++)
                    {
                        mat[x][y]=z;
                    }
                }
            }
            for (int a=0; a<8; a++)     //esse for serve para MOSTRAR as linhas
            {
                for (int b=0; b<8; b++)  //esse for serve para MOSTRAR as colunas
                {
                    System.out.print( " " +mat[a][b]);
                }
                System.out.print("\n");  //pula linha
            }
        }
    }
    

