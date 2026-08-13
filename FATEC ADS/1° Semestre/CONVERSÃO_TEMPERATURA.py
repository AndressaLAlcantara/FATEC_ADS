#Declaração de Variáveis

TCelsius: float = 0
TFahrenheit: float = 0

#Início

TCelsius = float(input("Digite a temperatura em graus Celsius: "))
TFahrenheit = (9*TCelsius+160)/5
print("Temperatura convertida em Fahrenheit=", TFahrenheit)

#Fim