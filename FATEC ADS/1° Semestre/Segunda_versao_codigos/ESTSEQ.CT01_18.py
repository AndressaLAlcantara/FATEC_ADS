#Declaração de Variáveis

a: int = 0
b: int = 0
diferença: int = 0

#Início
def ler_valores():
    global a, b
    a = int(input("Digite o primeiro valor"))
    b = int(input("Digite o segundo valor"))

def calcular_diferenca():
    global a, b, diferença
    if a>b:
        diferença = a - b
    else:
        diferença = b - a

def exibir_diferenca():
    global diferença
    print("A diferença entre o maior e o menor valor é:", diferença)

def main():
    ler_valores()
    calcular_diferenca()
    exibir_diferenca()

if __name__ == "__main__":
    main()

#Fim
