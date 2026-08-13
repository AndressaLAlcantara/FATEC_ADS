#Declaração de Variáveis

x: float = 0
y: float = 0
aux: float = 0

#Início

x = float(input("Digite o valor de x="))
y = float(input("Digite o valor de y="))
aux = x
x = y
y = aux
print("Novo valor de x=", x)
print("Novo valor de y=", y)

#Fim