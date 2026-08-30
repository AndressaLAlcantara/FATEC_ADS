import javax.swing.JOptionPane;
    public class LT01_ESTSEQ27 {
        public static void main (String args []){
            double voltas, metros, minutos, vm, km, h;
            voltas = Double.parseDouble(JOptionPane.showInputDialog("Quantas voltas foram dadas?"));
            metros = Double.parseDouble(JOptionPane.showInputDialog("Quantos metros cada volta tem?"));
            minutos = Double.parseDouble(JOptionPane.showInputDialog("Quantos minutos foram gastos para dar essas voltas?"));
            km = (metros * voltas / 1000);
            h = (minutos/60);
            vm = (km/h);
            System.out.print("A velocidade média do percurso foi de : " +vm);
        }    
    }