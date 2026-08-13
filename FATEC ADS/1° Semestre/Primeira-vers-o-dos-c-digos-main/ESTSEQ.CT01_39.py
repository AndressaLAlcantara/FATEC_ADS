#Declaração de Variáveis

g: int = 1
c: int = 0
total: int = 0

#Início
for c in range(1, 65):
    total = total + g
    g *= 2
    print("Total de grãos contidos em um tabuleiro de xadrez é: ", total)

#Fim