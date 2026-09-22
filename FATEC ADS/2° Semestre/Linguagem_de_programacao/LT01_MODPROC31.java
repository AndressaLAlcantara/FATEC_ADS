import javax.swing.JOptionPane;
    public class LT01_MODPROC31 {
        public static int Quadrado(int i){
            return i * i;  
        }
        public static void main (String args []) {
            String resultado = "";
            for (int i = 10; i <= 150; i++) {
            resultado = resultado + i + "² = " + Quadrado(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}

