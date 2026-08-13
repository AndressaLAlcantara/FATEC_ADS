#Declaração de Variáveis
v1: float = 0
v2: float = 0
v3: float = 0
v4: float = 0

#Início
v1 = int(input("Digite o primeiro valor dado: "))
v2 = int(input("Digite o segundo valor dado: "))
v3 = int(input("Digite o terceiro valor dado: "))
v4 = int(input("Digite o quarto valor dado: "))
if v4>v3:
    print(v1, v2, v3, v4)
elif v4>v2:
    print(v1, v2, v4, v3)
elif v4>v1:
    print(v1, v4, v2, v3)
else:
    print(v4, v1, v2, v3)

#Fim
