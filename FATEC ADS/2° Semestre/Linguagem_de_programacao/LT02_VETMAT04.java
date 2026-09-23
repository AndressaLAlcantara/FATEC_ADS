import javax.swing.JOptionPane;
    public class LT02_VETMAT04 {
        public static void main (String args []){
            double vt [] = new double [3];
            
            preencherVetor(vt);
            
            double media = calcularMedia(vt);
            int acima = calcularAbaixoeAcima(vt, media);
            
            mostrarResultados(media, acima);
        }
    public static void preencherVetor(double vt []) {
        for (int i=0; i<3; i++)
        {
            vt[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite nota: "));
        } 
    }
    
    public static double calcularMedia(double vt []){
        double soma = 0;

        for (int i=0; i<3; i++)
        {
            soma = soma + vt[i];
        }
        double media = soma/3;
        return media;
    }
        
    public static int calcularAbaixoeAcima (double vt[], double media) {
        int acima = 0;
        for (int i = 0; i<3; i++)
        {
            if (vt[i]>media)
            {
                acima += 1;
            }
            if (vt[i]<media)
            {
                JOptionPane.showMessageDialog(null, "A nota " + vt[i]+ "esta na posição " +i);
            }
        }
        return acima;
    }
    
    public static void mostrarResultados(double media, int acima){
            JOptionPane.showMessageDialog(null, "A média do grupo é: " +media);
            JOptionPane.showMessageDialog(null, "A quantidade de notas acima do grupo é: " +acima);
    }        
 }

