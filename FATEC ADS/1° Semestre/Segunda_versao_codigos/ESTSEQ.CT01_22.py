#Declaração de Variáveis
v1: int = 0
v2: int = 0

#Início
def valores():
    global v1, v2
    v1 = int(input("Digite o primeiro valor: "))
    v2 = int(input("Digite o segundo valor: "))

def ordem_crescente():
    global v1, v2
    if v1>v2:
        print("Os valores em ordem crecente: ", v2, v1)
    else:
        print("Os valores em ordem crescente: ", v1, v2)

def main():
    valores()
    ordem_crescente()

if __name__ == "__main__":
    main()


#Fim