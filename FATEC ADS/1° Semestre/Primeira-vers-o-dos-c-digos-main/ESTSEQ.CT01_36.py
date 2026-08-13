#Declaração de Variáveis

n: int = 0
i: int = 0
s = float = 0
fat: int = 0

#Início

import math

n = int(input("Digite um número: "))
for i in range(1, n + 1):
    s = s + (1/(math.factorial(i)))
    print("Resultado da série é: ", s)

#Fim