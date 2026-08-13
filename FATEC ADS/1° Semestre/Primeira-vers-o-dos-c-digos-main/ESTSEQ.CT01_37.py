#Declaração de Variáveis

valor1: int = 0
fibstart: int = 0
fibnext: int = 1
fibnext2: int = 0
fibindx: int = 1

#Início
valor1 = int(input("Digite um número para iniciar a Sequência de Fibonacci: "))
if (valor1 <= 0):
    print('Valor inválido, digitar um número inteiro positivo')
else:
    while (fibindx <= valor1):
        print('0', fibindx, '° número da Sequência de Fibonacci é: ', fibstart)
        fibnext2 = fibstart + fibnext
        fibstart = fibnext
        fibindx +=1

#Fim