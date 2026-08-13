#Declaração de Variáveis
valor: int = 0

#Início
def num():
    global valor
    valor = int(input("Digite o número: "))

def divisao():
    global valor
    if valor % 2 ==0 and valor % 3 ==0:
        print("O número é divisível por 2 e por 3")
    else:
        print("O número não é divisível por 2 e por 3")

def main():
    num()
    divisao()

if __name__ == "__main__":
    main()

#Fim