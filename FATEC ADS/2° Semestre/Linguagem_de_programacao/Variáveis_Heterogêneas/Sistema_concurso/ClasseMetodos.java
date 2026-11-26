import java.io.*;
import javax.swing.JOptionPane;
public class ClasseMetodos {
    public Candidatos [] FLerCandidatos (Candidatos [] candidatos) throws IOException
    {

        int i;
        String fileName = "Candidatos.txt";

        BufferedReader ler = new BufferedReader (new FileReader("Candidatos.txt"));
        for (i=0; i<239000; i++)
        {
            candidatos[i].numero = Integer.parseInt(ler.readLine());
            candidatos[i].nome = ler.readLine();
            candidatos[i].idade = Integer.parseInt(ler.readLine());
            candidatos[i].dependentes = Integer.parseInt(ler.readLine());
            candidatos[i].renda = Double.parseDouble(ler.readLine());
            candidatos[i].pontos = Double.parseDouble(ler.readLine());
        }
        ler.close();
        JOptionPane.showMessageDialog(null,"Candidatos carregados!");
        return candidatos;
    }
    
    public Candidatos FIntroduzCandidato (Candidatos [] candidatos, int numero) //int numero é o numero da inscrição que queremos procurar
    {
        return FBuscaCandidato (candidatos, numero, 0);     
    }
    
    //Busca recursiva do candidato: se não encontrar o número procurado, retorna null.
    //Se encontrar, retorna o objeto completo do candidato, com todos os dados.
    public Candidatos FBuscaCandidato (Candidatos [] candidatos, int numero, int indice) { //separou em dois métodos, mas com os mesmo nome - só não declarou junto o numero, com ele, dá erro (fica duplicado) 
        if (indice >= candidatos.length)
        {
            return null;   //Não encontrou o candidato
        }
        if (candidatos[indice] != null && candidatos[indice].numero == numero) // se encontrou o número procurado, ele vai voltar a posição indice - ex procurando 1050: candidatos[3] == 1050, retorna o número 3
        {    
            return candidatos[indice]; //Vai retornar o objeto inteiro
        }
        return FBuscaCandidato (candidatos, numero, indice +1);
    }
    
    //Classificação e gravação dos 50 melhores candidatos em um arquivo
    public void PCandidatosClassificados (Candidatos [] candidatos) throws IOException
    {
        Candidatos aux;
        
        for (int i=0; i<50; i++) //determina as 50 posições que queremos preencher com os melhores candidatos
        {
            for (int j= i+1; j<239000; j++) //é para que possa percorrer o vetor inteiro
            {
                if (candidatos[i].pontos < candidatos[j].pontos || 
                        (candidatos[i].pontos == candidatos[j].pontos && candidatos[i].idade < candidatos[j].idade || 
                        (candidatos[i].pontos == candidatos[j].pontos && candidatos[i].idade == candidatos[j].idade && candidatos[i].renda < candidatos[j].renda || 
                        (candidatos[i].pontos == candidatos[j].pontos && candidatos[i].idade == candidatos[j].idade && candidatos[i].renda == candidatos[j].renda && candidatos[i].dependentes < candidatos[j].dependentes))))
                {
                    aux = candidatos[i];
                    candidatos[i] = candidatos[j];
                    candidatos[j] = aux;
                }
            }
        }

        //Grava os 50 primeiros candidatos
        BufferedWriter grava = new BufferedWriter(new FileWriter("Classificados.txt"));
        for (int i = 0; i<50; i++) //percorre só os 50 primeiros que já estão classificados
        {
            grava.write(Integer.toString(candidatos[i].numero));
            grava.newLine();
            grava.write(candidatos[i].nome);
            grava.newLine();
            grava.write(Integer.toString(candidatos[i].idade));
            grava.newLine();
            grava.write(Integer.toString(candidatos[i].dependentes));
            grava.newLine();
            grava.write(Double.toString(candidatos[i].renda));
            grava.newLine();
            grava.write(Double.toString(candidatos[i].pontos));
            grava.newLine();
        }
        grava.close();
        JOptionPane.showMessageDialog(null, "Arquivo gerado!");
    }
}

