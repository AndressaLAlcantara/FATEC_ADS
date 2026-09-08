import javax.swing.JOptionPane;
    public class LT01_ESTSEQ32 {
        public static void main (String args [] ) {
            int n, fat, i;
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja saber o fatorial: "));
            fat = 1; 
            for (i=1; i <=n; i++){
                fat = fat * i;
            }
            System.out.print("O fatorial desse número inteiro é: " +fat);
            }
            
        }
    