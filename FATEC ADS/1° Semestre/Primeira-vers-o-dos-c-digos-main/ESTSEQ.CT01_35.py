#Declaração de Variáveis

x1: int = 0
x2: int = 0
i: int = 0
soma: int = 0

#Início
x1 = int(input("Digite o primeiro valor: "))
x2 = int(input("Digite o segundo valor: "))
if x1>x2:
    maior = x1
    menor = x2
else:
    maior = x2
    menor = x1

for i in range (menor +1, maior):
     if i % 2 != 0:
        soma = soma + i
        print("O maior valor é: ", maior)
        print("O menor valor é: ", menor)
        print("A soma dos números ímpares entre ", menor, "e", maior, "é:", soma)

#Fim