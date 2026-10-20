import javax.swing.JOptionPane;
public class CLASSE_PRINCIPAL {
    public static void main (String arg []){
        Aluno[] aluno = new Aluno [3]; // INSTÂNCIA DA CLASSE ABSTRATA COM 3 REGISTROS TIPO VETOR 
        CLASSE_METODOS m = new CLASSE_METODOS ();
        int i;
        for (i=0; i<3; i++){
            aluno[i] = new Aluno (); }
        int opc = 0;
        while (opc != 9)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastra Alunos \n 2 - Consulta Registros \n 9 - Finaliza"));
            switch (opc)
            {
                case 1: aluno = m.FCadastra(aluno); // CHAMADA FUNÇÃO
                    break;
                case 2: m.FConsulta(aluno); // CHAMADA PROCEDIMENTO
                    break;
                case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }
}

