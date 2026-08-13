#Início

def rendimentos(valor, tipo):
    if tipo==1:
        rendimento = valor * 0.03
        total = valor + rendimento
        print("Valor corrigido após 30 dias: ", total)
    elif tipo ==2:
        rendimento = valor * 0.05
        total = valor + rendimento
        print("Valor corrigido após 30 dias: ", total)
    else:
        print("Valor inválido")

def main():
    valor = float(input("Digite o valor investido: "))
    tipo = float(input("Digite o tipo de investimento (1 - poupança, 2 - renda fixa): "))
    rendimentos(valor, tipo)

if __name__ == "__main__":
    main()

#Fim
