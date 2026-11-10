import javax.swing.JOptionPane;
import java.util.Random;
import java.io.*; //importa todas as classes do pacote java.io. Se colocar "import java.io.IOException", dá erro no BufferedWriter, ele não reconhece
public class ClasseMetodos {
    public Votacao[] FCADASTRAVOTACAO(Votacao[] votacao) 
    {
        Random random = new Random();
        for (int i= 0; i<200; i++) // Sorteia os valores e já atribui diretamente aos atributos do objeto daquela posição
        {
        votacao[i].secao = random.nextInt (11); //0 a 10
        votacao[i].candidato = random.nextInt (301); // 0 a 300
        }
        JOptionPane.showMessageDialog(null, "200 registros de votos carregados com sucesso!");
        return votacao;
    }
    public Votacao [] FCLASSIFICASECAO (Votacao [] votacao) {
        Votacao aux; //Se usássemos int aux, conseguiríamos guardar apenas um número inteiro, e não o objeto completo. Votacao[i] guarda secao e candidato
        for (int i = 0; i< 199; i++) //Fiz esse laço do bubble igual o prof. ensinou em Algoritmos em 09/11/26 
        {
            for (int j= i+1; j<200; j++)
            {
                if (votacao[i].secao > votacao[j].secao) //Se a secão atual for maior que a próxima, troca de posição (é o bubble sort mesmo)
                {
                    aux = votacao[i];
                    votacao[i] = votacao[j];
                    votacao[j] = aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Dados classificados");
        return votacao;
    }
    public Votacao [] FGRAVAVOTACAO (Votacao [] votacao) throws IOException {
        int i;
        String fileName = "Votação2021.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
        for (i=0; i<200; i++)
        {
            gravar.write(Integer.toString(votacao[i].secao));
            gravar.newLine();
            gravar.write(Integer.toString(votacao[i].candidato));
            gravar.newLine();
        }
        gravar.close();
        JOptionPane.showMessageDialog(null, "Arquivo gerado");
        return votacao;
    }
    public void PQtdEleitores (Votacao [] votacao) {  //o procedimento tem que percorrer os 200 registros e contar quantos eleitores existem em cada seção
        int [] quantidade = new int [11]; //usar um vetor para auxiliar a armazenar as quantidades
        for (int i = 0; i<200; i++)
        {
            quantidade[votacao[i].secao]++;
        }
        for (int i = 0; i< 11; i++)
        {
            JOptionPane.showMessageDialog(null,"Seção: " + i + "\nQuantidade de eleitores: " + quantidade[i]);
        }
    }
    public void PSecaoMaiorMenor (Votacao [] votacao) { //Diferente do outro exercício, ele não quer a quantidade, ele quer o número da seção maior e menor
        int [] quantidade = new int [11];  //vetor que vai receber a quantidade de eleitores em cada uma das seção (0 a 10)
        int maior = 0;
        int menor = 0;
        int i;
        for (i = 0; i < 200; i++) {  //vetor recebendo os valores (são 200 registros)
            quantidade[votacao[i].secao]++;
        }
        for (i=0; i<11; i++)
        {
            if (quantidade[i]> quantidade[maior]) 
            {                                      
                maior = i;  //maior: guarda o número da seção com mais eleitores
            }
            if (quantidade[i]<quantidade[menor])
            {
                menor = i;    //menor: guarda o número da seção com menos eleitores
            }
        }
        JOptionPane.showMessageDialog(null, "Seção com maior número de eleitores: " +maior);
        JOptionPane.showMessageDialog(null, "Seção com menor número de eleitores:  " +menor);
    }
    public void PVotosCandidato (Votacao [] votacao) {
        int [] quantidade = new int [301];
        int i;
        for (i=0; i<200; i++)
        {
            quantidade[votacao[i].candidato]++;
        }  //não tem return votacao porque é void, um procedimento. Portanto, não precisa retornar valor
        for (i=0; i<301; i++)
        {
            if (quantidade[i] > 0) //para mostrar somente os candidatos que receberam votos. Assim, evita abrir 301 janelas, inclusive para candidatos sem nenhum voto
            {
                JOptionPane.showMessageDialog(null, "Candidato: " +i+ "\n Quantidade de votos: " +quantidade[i]);
            }
        }
    }
        
    public void PPrimeirosColocados (Votacao [] votacao) {
        int [] quantidade = new int [301]; //cada posição representa um candidato e guarda sua quantidade de votos
        int [] candidato = new int [301];  //vetor para guardar os números dos candidatos
        int i;
        int j;
        int aux;
            for (i = 0; i< 200; i++) //vetor recebendo a quantidade de votos
            {
                quantidade[votacao[i].candidato]++;
            }
            for (i = 0; i< 301; i++) //vetor recebendo o número dos candidatos
            {
                candidato[i]=i;
            }
            for (i = 0; i < 300; i++) {
                for (j = i + 1; j < 301; j++) {
                    if (quantidade[i] < quantidade[j]) { //bubble sort só que invertido, colocar em ordem decrescente - queremos saber os 10 mais votados
                        aux = quantidade[i];
                        quantidade[i] = quantidade[j];
                        quantidade[j] = aux;

                        aux = candidato[i];
                        candidato[i] = candidato[j];
                        candidato[j] = aux;
                    }
                }
            }
            for (i=0; i<10; i++) //para apresentar as 10 primeiras posições
            {
                JOptionPane.showMessageDialog(null, "Classificação: " +(i+1)+ "\nCandidato: " +candidato[i] + "\nQuantidade de votos: " +quantidade[i]); //como começa na posição 0, precisa do i + 1 para ficar certinho
            }
    }
}
