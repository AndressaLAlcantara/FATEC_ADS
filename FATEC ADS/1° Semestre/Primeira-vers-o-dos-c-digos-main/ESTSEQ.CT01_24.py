#Declaração de Variáveis
valor: int = 0

#Início

valor = int(input("Digite o número: "))
if valor % 2 ==0 and valor % 3 ==0:
    print("O número é divisível por 2 e por 3")
else:
    print("O número não é divisível por 2 e por 3")

#Fim