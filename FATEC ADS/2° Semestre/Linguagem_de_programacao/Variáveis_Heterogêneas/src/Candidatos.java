public class Candidatos {
    int numero;
    String nome;
    int idade;
    int dependentes;
    double renda;
    double pontos;
    
    Candidatos () {
        this (0, "", 0, 0, 0.0, 0.0);
    }
    
    Candidatos(int num, String nm, int ida, int dep, double ren, double pon) {
        numero = num;
        nome = nm;
        idade = ida;
        dependentes = dep;
        renda = ren;
        pontos = pon;
    }
}
