import os  #cria pastas, monta caminhos de arquivos corretamente

#Declaração de Variáveis Globais
num: int = 0
dir01: str = '/tmp/exercicios'
arq01: str = 'ex38.txt'

#Função criando a pasta
def criar_pasta():
    os.makedirs(dir01, exist_ok=True)
    os.chmod(dir01, 0o744)

#Gravando o arquivo
def gravar_arquivo(caminho, numeros, maior, menor):
    with open(caminho, "w") as file:
        for i, num in enumerate(numeros):
            file.write(f"{i+1}º número: {num}\n")

        file.write("\n")
        file.write(f"Maior valor: {maior}\n")
        file.write(f"Menor valor: {menor}\n")

def main():
    criar_pasta()
    caminho = os.path.join(dir01, arq01)

    numeros = []

    while True:
        num = float(input("Digite o 1º número (positivo): "))
        if num < 0:
            print("Valor inválido! Digite apenas números positivos.")
        else:
            break

    maior = num
    menor = num
    numeros.append(num)

    for i in range(99):
        while True:
            num = float(input(f"Digite o {i+2}º número (positivo): "))
            if num < 0:
                print("Valor inválido! Digite apenas números positivos.")
            else:
                break

        numeros.append(num)

        if num > maior:
            maior = num

        if num < menor:
            menor = num

    gravar_arquivo(caminho, numeros, maior, menor)

    print("Dados gravados com sucesso!")

if __name__ == "__main__":
    main()