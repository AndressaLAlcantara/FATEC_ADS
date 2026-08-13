#Declaração de Variáveis
v1: int = 0
v2: int = 0

#Início

v1 = int(input("Digite o primeiro valor: "))
v2 = int(input("Digite o segundo valor: "))
if v1>v2:
    if v1 % v2 == 0:
        print("O maior valor é múltiplo do menor")
    else:
        print("O maior número não é múltiplo do menor")
else:
   if v2 % v1 == 0:
    print("O maior valor é múltiplo do menor")
   else:
    print("O maior valor não é múltiplo do menor")

#Fim