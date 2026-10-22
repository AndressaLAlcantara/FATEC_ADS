import javax.swing.JOptionPane;
public class ClasseMetodos {
    public Estatistica [] FCadastraEstatistica(Estatistica[] estatistica){ //Função que recebe código, nome e quantidade de acidentes, retornando tipo estatistica []
        int i;
        for (i=0; i<10; i++)
        {
            estatistica[i].codigo=Integer.parseInt(JOptionPane.showInputDialog("Entre com o código da cidade: "));
            estatistica[i].nome=JOptionPane.showInputDialog("Entre com o nome da cidade: ");
            estatistica[i].acidentes=Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de acidentes: "));
        }
        return estatistica;
    }
    public void PQtdAcidentes(Estatistica[] estatistica){
        int i;
        for(i=0; i<10; i++)
        {
            if (estatistica[i].acidentes >100 && estatistica[i].acidentes <500)
            {
                System.out.println("Código: " +estatistica[i].codigo + "Cidade" +estatistica[i].nome +"Quantidade de acidentes" +estatistica[i].acidentes);
            }
        }
        
    }  
    public void PMaiorMenor(Estatistica[] estatistica) {
        int maior = estatistica[0].acidentes;   
        int menor = estatistica[0].acidentes;    //inicializar com 0 pode dar erro, se todas as cidades tiverem mais de zero acidentes, menor continuará sendo 0
        int i;
        for (i=0; i<10; i++)
        {
            if (estatistica[i].acidentes >maior)
            {
                maior=estatistica[i].acidentes;
            }
            if(estatistica[i].acidentes<menor)
            {
                menor=estatistica[i].acidentes;
            }
        }
        System.out.print("O maior número de acidente é: " +maior +"O menor número de acidentes é: " +menor);
    }
    public void PAcima(Estatistica[] estatistica) {
        int i;
        int soma = 0;
        double media;
        for (i=0; i<10; i++)
        {
            soma = soma + estatistica[i].acidentes;
        }
        media=soma/10.0;
        for(i=0; i<10; i++)
        {
            if(estatistica[i].acidentes>media)
            {
                System.out.print("Cidade com quantidade de acidentes acima da média: " +estatistica[i].nome);
            }
        }
    }  
}
