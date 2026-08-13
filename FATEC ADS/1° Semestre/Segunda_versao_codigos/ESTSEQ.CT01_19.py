#Declaração de Variáveis

v1: int = 0
v2: int = 0

#Início

def ler_valores():
    global v1, v2
    v1 = int(input("Digite o primeiro valor real: "))
    v2 = int(input("Digite o segundo valor real: "))

def maior():
    global v1, v2
    if v1>v2:
        print(" O maior valor é:" , v1)
    else:
        print(" O maior valor é:" , v2)

def main ():
    ler_valores()
    maior()

if __name__ == "__main__":
    main()

#Fim
