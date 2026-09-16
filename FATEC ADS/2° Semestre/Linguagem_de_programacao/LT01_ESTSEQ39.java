import javax.swing.JOptionPane;
    public class LT01_ESTSEQ39 {
        public static void main (String args []) {
            int n, i, casas;
            casas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de casas no tabuleiro"));
            n = 0;
            for (i = 1; i <= casas; i++) 
            {
                n += Math.pow(2, i - 1);
            }  
        System.out.println("O total de grãos no tabuleiro é: " + n);
    }
}
