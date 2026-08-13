import os
import math

#Declaração de Variáveis Globais

n: int = 0
dir01: str = '/tmp/exercicios'
arq01: str = 'ex36.txt'

#Criando pasta
def criar_pasta():
    os.makedirs(dir01, exist_ok=True)
    os.chmod(dir01, 0o744)

def fatorial(n):
    fat = 1
    for i in range(1, n + 1):
        fat *= i
    return fat

def divisao(n):
    return 1 / fatorial(n)

#Gravando arquivo
def gravar_arquivo(n):
    caminho = os.path.join(dir01, arq01)

    soma = 0

    with open(caminho, "w", encoding="utf-8") as file:
        for i in range(1, n + 1):
            termo = divisao(i)
            soma += termo

            file.write(f"1/{i}! = {termo}\n")

        file.write("\n")
        file.write(f"Soma final = {soma}\n")

    print("Resultado da série é:", soma)

def main():
    criar_pasta()
    n = int(input("Digite um número: "))
    gravar_arquivo(n)


if __name__ == "__main__":
    main()