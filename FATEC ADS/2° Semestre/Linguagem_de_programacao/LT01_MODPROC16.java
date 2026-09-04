import javax.swing.JOptionPane;
    public class LT01_MODPROC16 {
        static double SalarioBruto, SalarioLiquido, ht, vh, pd, desc;
            public static void main (String args []) {
                ht = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas:  "));
                vh = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora:  "));
                pd = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:  "));
                desc = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de descendentes:  "));
                ProcedureSalario();
                JOptionPane.showMessageDialog(null, "\n Salario Liquido = " + SalarioLiquido);
            }
            static void ProcedureSalario()
            {
                SalarioBruto = (ht * vh);
                SalarioLiquido = (SalarioBruto - (SalarioBruto * (pd/100))+(100*desc));
            }
           
    }