def main():
    vetor: str = []
    media: int = 0
    numero: int = 0
    maior: int = 0
    menor: int = 0
    soma: int = 0
    contador: int = 0

    for i in range(100):
        numero = int(input("Digite um número: "))

        if numero > maior:
            maior = numero
        else:
            menor = numero

        vetor.append(numero)
        soma=soma+numero
        contador = contador + 1
        media = soma / contador
        
    print("Média: ", media)
    print("Maior valor: ", maior)
    print("Menor valor: ", menor)


if __name__ == '__main__':
    main()