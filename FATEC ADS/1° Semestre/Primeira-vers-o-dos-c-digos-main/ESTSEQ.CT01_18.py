#Declaração de Variáveis

a: int = 0
b: int = 0
diferença: int = 0

#Início
a = int(input("Digite o primeiro valor"))
b = int(input("Digite o segundo valor"))
if a>b:
    diferença = a - b
    print ("A diferença entre o maior e o menor valor é:", diferença)
else:
    diferença = b - a
    print ("A diferença entre o maior e o menor valor é:", diferença)

#Fim
