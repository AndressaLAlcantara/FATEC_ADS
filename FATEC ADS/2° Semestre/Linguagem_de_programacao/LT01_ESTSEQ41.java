    public class LT01_ESTSEQ41 {
        public static void main (String args []) {
            int i, j, soma;
            for (i=1; i<=6;i++)
            {
                for(j=1; j<=6; j++)
                {
                    soma = i + j;
                    if (soma == 7)
                    {
                        System.out.println(i + " + " + j + " = " + soma);
                    }
                }
            }
        }
    }
    

