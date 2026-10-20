import javax.swing.JOptionPane;
public class CLASSE_METODOS {    // FUNÇÃO RECEBENDO REGISTRO aluno E RETORNANDO TIPO ALUNO[]    
    public Aluno [] FCadastra(Aluno[] aluno){
        int i;
        for (i=0; i<3; i++){
            aluno[i].pnome=JOptionPane.showInputDialog("Entre o nome do aluno: ");
            aluno[i].unome=JOptionPane.showInputDialog("Entre o sobrenome do aluno: ");
            aluno[i].pontos=Integer.parseInt(JOptionPane.showInputDialog("Entre os pontos do aluno: "));
        }
        return aluno; 
    }
    public void FConsulta(Aluno[] aluno){  // PROCEDIMENTO RECEBENDO REGISTRO aluno TIPO ALUNO[]    
        int i;
        for (i=0; i<3; i++){
            System.out.println(aluno[i].pnome + "" + aluno[i].unome + "pontos: " + aluno[i].pontos);
        }
    }
}


