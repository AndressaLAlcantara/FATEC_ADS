public class Estatistica {
    public static void main (String args []){
        int[] vt = {7,5,9,1,4};
        for(int i = 0; i < vt.length; i ++){
            for(int j  = 0; j < vt.length - 1 - i; j ++){
            if (vt[j] > vt[j+1]){
                int aux = vt[j];
                
                vt[j] = vt[j+1];
                
                vt[j+1] = aux;
            }
           
        }
        }
        for (int i = 0; i < vt.length; i++) {
            System.out.print(vt[i] + " ");
        }
        
        
    }
}
