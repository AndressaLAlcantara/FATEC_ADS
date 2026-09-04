import javax.swing.JOptionPane;
    public class LT01_MODPROC17 {
        static double Litros, Tempo, VelocMedia;
            public static void main (String args []) {
                Tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo do percurso: "));
                VelocMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média do percurso: "));
                ProcedureGasto();
                JOptionPane.showMessageDialog(null, "A quantidade de litros gastos na viagem é: " +Litros);
            }
            static void ProcedureGasto()
            {
                Litros = ((VelocMedia*Tempo)/12);
            }
    }