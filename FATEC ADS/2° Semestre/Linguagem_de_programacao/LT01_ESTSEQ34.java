import javax.swing.JOptionPane;
    public class LT01_ESTSEQ34 {
        public static void main (String args []) {
            int i, t;
            t = Integer.parseInt(JOptionPane.showInputDialog("Digite um número que deseja saber a tabuada: "));
            for (i=1; i<=10; i++) {
                System.out.println (t + " x " + i + " = " + (t * i));
            }
        }
}
