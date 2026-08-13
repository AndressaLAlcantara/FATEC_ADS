#Declaração de Variáveis

minutos: float = 0
distancia: float = 0
duracao: float = 0
vmedia: float = 0
voltas: float = 0
extensao: float = 0

#Início
voltas = float(input("Quantas voltas foram dadas no percurso? "))
extensao = float(input("Qual a extensão do circuito em metros? "))
minutos = float(input("Em quantos minutos o percurso foi feito? "))
distancia = (voltas * extensao)/1000
duracao = minutos/60
vmedia = distancia/duracao
print("A velocidade média da corrida foi de: ", vmedia)

#Fim

