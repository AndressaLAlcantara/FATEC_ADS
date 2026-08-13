#Declaração de Variáveis

ang1: float = 0
ang2: float = 0
ang3: float = 0

#Início
ang1 = float(input("Digite o valor do primeiro ângulo="))
ang2 = float(input("Digite o valor do segundo ângulo="))
ang3 = 180 - (ang1+ang2)
print("Valor do ângulo 3=", ang3)

#Fim