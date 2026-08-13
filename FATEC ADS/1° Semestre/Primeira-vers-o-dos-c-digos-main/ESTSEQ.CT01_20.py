#Declaração de Variáveis

delta: int = 0
x1: int = 0
x2: int = 0
a: int = 0
b: int = 0
c: int = 0

#Início

import math
a = int(input("Digite o valor de a: "))
b = int(input("Digite o valor de b: "))
c = int(input("Digite o valor de c: " ))
delta = b*b - 4*a*c
if delta < 0:
    print("Sem raízes")
else: 
    if delta==0:
        x1 = -b/2*a
        print("A raíz real é: ", x1)
    else:
        x1 = (-b + math.sqrt(delta))/(2*a)
        x2 = (-b - math.sqrt(delta))/(2*a)
        print("As raízes reais são: ", x1, x2)

#Fim