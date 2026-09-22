    public class LT01_ESTSEQ43 {
        public static void main (String args []) {
            double a, m, anos;
            a = 1.1;
            m = 1.5;
            anos = 0;
            while (a <= m)
            {
                a = a + 0.03;
                m = m + 0.02;
                anos = anos + 1;
            }
            System.out.println("Serão " +anos+ "anos para que Ana seja maior que Maria");
            
        }
    
}
