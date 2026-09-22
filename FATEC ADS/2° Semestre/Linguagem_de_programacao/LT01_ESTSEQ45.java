
import javax.swing.JOptionPane;

    public class LT01_ESTSEQ45 {
        public static void main (String args []) {
            double i, t, s;
            s = 0;
            for (i=1; i<=15;i++)
            {
                s = 0.0;
                t = i/Math.pow(i, 2);
                if (t%2==0)
                {
                    s = s - t;
                }
                else
                {
                    s = s + t;
                }
            }
            JOptionPane.showMessageDialog(null, "O resultado da série é: " +s);
        }
    
}
