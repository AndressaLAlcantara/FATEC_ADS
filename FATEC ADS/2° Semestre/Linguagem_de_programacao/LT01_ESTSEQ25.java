import javax.swing.JOptionPane;
    public class LT01_ESTSEQ25 {
        public static void main (String args []) {
            int hi, mi, hf, mf, t1, t2, duracao, h, m;
            hi = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de início"));
            mi = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos da hora de início"));
            hf = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora do fim"));
            mf = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos da hora do fim"));
            t1 = ((hi*60)+mi);
            t2 = ((hf*60)+mf);
            duracao = t2 - t1;
            if (duracao <0)
            {
                duracao = duracao + (24*60);
            }
            h = duracao / 60;
            m = duracao %60;
                System.out.print("O tempo de jogo foi de: " + h + " hora(s) e " + m + " minuto(s).");
            
            }
        }