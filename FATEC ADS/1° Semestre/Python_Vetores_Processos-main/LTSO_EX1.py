def main():
    vetor: str = []      #cria uma lista vazia
    soma_media: int = 0     #guarda a soma dos números entre 10 e 200 
    soma_impares: int = 0    #guarda a soma de todos os ímpares digitados
    v_contadora: int = 0
    media: int = 0

    for i in range(50):      #for cria o laço de repetição, range (50) faz o laço se repetir 50 vezes, i é a posição da repetição
        numero = int(input(f"Digite o {i+1}º número: "))       #{i+1} o contador começa em 0, mas queremos mostrar 1º, 2º, 3º
        vetor.append(numero)          #append() adiciona o número dentro do vetor, cada número digitado vai sendo guardado na lista

    if numero >= 10 and numero <= 200:
        soma_media = soma_media + numero
        v_contadora = v_contadora + 1

    if numero % 2 != 0:
        soma_impares = soma_impares + numero

    if v_contadora > 0:       #verifica se existe pelo menos um número entre 10 e 200
        media = soma_media / v_contadora
    else:         #se por acaso nenhum número estiver entre 10 e 200, a média será 0
        media = 0

    print("\nResultados:")
    print(f"Média dos valores entre 10 e 200: {media}")
    print(f"Soma dos números ímpares: {soma_impares}")

if __name__ == '__main__':
    main()