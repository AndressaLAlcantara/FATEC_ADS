    public class LT01_ESTSEQ42 {
        public static void main (String args []) {
            double i, soma;
            soma = 1;
            for (i = 1; i <=50; i++) {
                soma = (soma + i/((2*i)-1));
            }
            System.out.println("O resultado da série é: " +soma);
        }
}
