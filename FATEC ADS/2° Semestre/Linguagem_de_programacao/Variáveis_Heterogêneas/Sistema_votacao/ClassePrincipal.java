import javax.swing.JOptionPane;
import java.io.IOException; 
public class ClassePrincipal {
    public static void main (String args []) throws IOException {
        Votacao[] votacao = new Votacao [200];
        ClasseMetodos m = new ClasseMetodos();
        int i;
        for (i=0; i<200; i++)
        {
            votacao[i] = new Votacao();
        }
        int opc = 0;
        while (opc!=9)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar Seção/Número Eleitor \n 2 - Carregar Seção/Número Eleitor \n 3 - Gravar Registros \n 4 - Mostrar Indicadores \n 9 - Finalizar"));
            switch (opc)
            {
                case 1: votacao = m.FCADASTRAVOTACAO(votacao);
                    break;
                case 2: votacao = m.FCLASSIFICASECAO(votacao);
                    break;
                case 3: votacao = m.FGRAVAVOTACAO(votacao);
                    break;
                case 4:
                    int op = 0;
                    while (op != 9)
                    {
                        op = Integer.parseInt(JOptionPane.showInputDialog("1 - Quantidade Eleitores por Seção \n 2 - Seção com Maior e Menor número de Eleitores \n 3 - Quantidade de votos por candidato \n 4 - 10 primeiros colocadas (nro cand. e qtd votos) \n 9 - Finaliza consulta"));
                        switch (op)
                        {
                            case 1: m.PQtdEleitores(votacao);
                                break;
                            case 2: m.PSecaoMaiorMenor(votacao);
                                break;
                            case 3: m. PVotosCandidato(votacao);
                                break;
                            case 4: m.PPrimeirosColocados(votacao);
                                break;
                            case 9: JOptionPane.showMessageDialog(null, "Consulta finalizada");
                                break;
                            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
                        }
                    }
                    break;
                case 9: JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }
    
}
