#Declaração de Variáveis

cat1: float = 0
cat2: float = 0
hipo: float = 0

#Início
cat1 = float(input("Digite o valor de um dos catetos="))
cat2 = float(input("Digite o valor do outro cateto"))
hipo = (((cat1**2)+(cat2**2))**0.5)
print("O valor da hipotenusa desse triângulo é=", hipo)

#Fim