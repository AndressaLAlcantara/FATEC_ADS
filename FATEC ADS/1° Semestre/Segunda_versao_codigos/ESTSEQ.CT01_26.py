#Início

def verificar_multiplo(v1, v2):
    if v1 > v2:
        maior, menor = v1, v2
    else:
        maior, menor = v2, v1

    if maior % menor == 0:
        print(f"O número {maior} é múltiplo de {menor}.")
    else:
        print(f"O número {maior} não é múltiplo de {menor}.")

def main(): 
    v1 = int(input("Digite o primeiro valor: "))
    v2 = int(input("Digite o segundo valor: "))
    verificar_multiplo(v1, v2)

if __name__ == "__main__":
    main()

#Fim