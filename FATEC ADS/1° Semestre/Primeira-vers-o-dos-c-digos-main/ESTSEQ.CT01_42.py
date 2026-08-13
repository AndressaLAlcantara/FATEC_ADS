#Declaração de Variáveis

n: int = 0
d: int = 0
s: int = 0


#Início

for n in range(1, 51): 
    d = 2 * n - 1
    s += n / d
    print(f"O valor da série 1 + 2/3 + 3/5 + ... + 50/99 é: {s}")

#Fim