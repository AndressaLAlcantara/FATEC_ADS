#Declaração de Variáveis
comprimento: float = 0
largura: float = 0
altura: float = 0
volume: float = 0
#Início
comprimento = float(input("Digite o comprimento="))
largura = float(input("Digite a largura="))
altura = float(input("Digite a altura="))
volume = comprimento*largura*altura
print("Volume do paralelepípedo=", volume)
#Fim