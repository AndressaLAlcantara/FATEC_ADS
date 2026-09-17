import javax.swing.JOptionPane;
public class FUNREC04 {
    public static void main (String args[]) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        double resultado = calcular(num, 1);
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
    public static double calcular (int n, int denominador) {
        if (n ==1)
        {
            return 1.0/denominador;
        }
        return (double) n / denominador + calcular (n - 1, denominador + 1);
    //n diminui 1, denominador aumenta 1. 
    //Se fosse n ==5, a sequencia seria: 5/1 + 4/2 + 3/3 + 2/4 + 1/5. 
    //Percebe que diminui numerador e aumenta denominador?
    }
    
}
