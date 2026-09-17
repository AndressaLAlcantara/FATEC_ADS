public class FUNREC01 {
    static int soma(int n) {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return n + soma(n-1);
        }
    }
    public static void main (String args []) {
        int resultado;
        resultado = soma(100);
        System.out.print("Serie1= " +resultado);
    }
}