#Declaração de Variáveis

A: float = 0
B: float = 0
C: float = 0
delta: float = 0
Raiz1: float = 0
Raiz2: float = 0

#Início

A = float(input("Digite o valor de A= "))
B = float (input("Digite o valor de B="))
C = float (input("Digite o valor de C="))
delta = B*B-4*A*C
import math
Raiz1 = -B+math.sqrt(delta)/2*A
Raiz2 = -B-math.sqrt(delta)/2*A
print("Primeira raiz= ", Raiz1)
print("Segunda raiz=", Raiz2)

#Fim
