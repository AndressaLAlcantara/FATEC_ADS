import javax.swing.JOptionPane;
    public class LT01_ESTSEQ44 {
        public static void main (String args []){
            double b, e, p;
            b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base"));
            e = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do expoente"));
            p = Math.pow(b,e);
            JOptionPane.showMessageDialog(null,"O valor da potência é : " + p);
        }  
    }
