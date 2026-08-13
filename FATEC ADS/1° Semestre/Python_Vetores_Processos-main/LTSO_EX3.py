def main():
    vetor: str = []
    media: int = 0
    numero: int = 0
    acima: int = 0
    abaixo: int = 0
    soma: int = 0
    contador: int = 0
    indice: int = 0

    for i in range(30):
        numero = int(input(f"Digite a {i+1} nota: "))
        vetor.append(numero)
        soma=soma+numero
        contador = contador + 1
        media = soma / contador

        for numero in vetor:
            if numero > media:
                acima = acima + 1

        for numero in vetor:
            if numero < media:
                indice = indice + 1
        
        print("Média: ", media)
        print("Quantidade de notas acima da média: ", acima)
        print("As posições dos valores abaixo da média do grupo são: ", indice)


if __name__ == '__main__':
    main()