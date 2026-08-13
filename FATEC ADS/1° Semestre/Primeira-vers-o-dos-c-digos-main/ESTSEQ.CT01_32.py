#Declaração de Variáveis
numero: int=0

#Início
numero = int(input("Escreva o número: "))
fatorial = 1
for i in range(1, numero+1):
    fatorial=fatorial*i

print("Fatorial de ", numero, "é", fatorial)

#Fim