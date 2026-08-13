#Declaração de Variáveis

d1: int = 1
d2: int = 1
i: int = 0

#Início

for d1 in range(1, 7):
    for d2 in range(1, 7):
        if d1 + d2 == 7:
            print(f"({d1}, {d2})")

#Fim