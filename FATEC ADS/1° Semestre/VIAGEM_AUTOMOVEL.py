#Declaração de Variáveis

qt: float = 0
vm: float = 0
tempo: float = 0
distancia: float = 0

#Início

tempo = float(input("Qual o tempo gasto na viagem?="))
vm = float(input("Qual foi a velocidade média na viagem?="))
distancia = vm*tempo
qt = distancia/12
print("Quantidade de litros de gasolina gastos na viagem=", qt)

#Fim