#Declaração de Variáveis

soma: float = 1
n: int = 1
termo: float = 1

#Início
for n in range(1, 16): 
    termo = n / (n ** 2) 
    if n % 2 == 0:       
        termo = -termo
    soma += termo
print(f"O valor da série 1 - 2/4 + 3/9 - ... + 15/225 é: {soma}")

#Fim
