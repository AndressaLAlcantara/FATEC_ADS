import java.io.IOException;
import javax.swing.JOptionPane; 
public class ClassePrincipal {
    public static void main (String args []) throws IOException {
        Candidatos [] candidatos = new Candidatos [239000];
        ClasseMetodos m = new ClasseMetodos ();
        int i;

        //Instancia os 239000 candidatos
        for (i=0; i<239000; i++)
        {
            candidatos[i] = new Candidatos();
        }
        int opc = 0;
        boolean carregado = false;
        while (opc != 9)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Verificar candidadatos \n 2 - Buscar candidatos \n 3 - Os 50 melhores classificados \n 9 - FIM"));
            switch (opc)
            {
                case 1: 
                    candidatos = m.FLerCandidatos(candidatos);
                    carregado = true;
                    break;
                case 2:
                    if (carregado) 
                    {
                        int numeroBusca = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da inscrição: "));

                        Candidatos candidatoEncontrado = m.FIntroduzCandidato(candidatos, numeroBusca);

                        if (candidatoEncontrado != null) {
                            JOptionPane.showMessageDialog(null,"Nome: " + candidatoEncontrado.nome + "\nNúmero: " + candidatoEncontrado.numero +"\nIdade: " + candidatoEncontrado.idade +"\nDependentes: " + candidatoEncontrado.dependentes +"\nRenda: " + candidatoEncontrado.renda +"\nPontos: " + candidatoEncontrado.pontos);
                        } 
                        else {
                            JOptionPane.showMessageDialog(null, "Candidato não cadastrado");
                        }
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Primeiro carregue os candidatos!");
                    }
                    break;
                case 3:
                    if (carregado)
                    {
                        m.PCandidatosClassificados(candidatos);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Primeiro carregue os candidatos!");
                    }
                    break;
                case 9: 
                    JOptionPane.showMessageDialog(null, "Consulta finalizada!");
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção incorreta");
            }
        }
    }
}
