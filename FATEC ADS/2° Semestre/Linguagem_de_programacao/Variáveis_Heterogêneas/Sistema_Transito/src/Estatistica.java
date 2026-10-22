public class Estatistica {
    int codigo;
    String nome;
    int acidentes;
    
    Estatistica(){
        this(0,"",0);
    }
    
    Estatistica(int CodigoCidade, String NomeCidade, int QtdAcidentes){
        codigo = CodigoCidade;
        nome = NomeCidade;
        acidentes = QtdAcidentes;
    }
}
