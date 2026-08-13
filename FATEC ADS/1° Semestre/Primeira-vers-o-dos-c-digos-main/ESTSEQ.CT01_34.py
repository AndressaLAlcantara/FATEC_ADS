#Declaração de Variáveis

n: int = 0
i: int = 0


#Início

n = int(input("Digite um número que deseja saber a tabuada: "))
for i in range(1, 11):
    tabuada = n * i
    print(f"{n} x {i} = {tabuada}")

#Fim