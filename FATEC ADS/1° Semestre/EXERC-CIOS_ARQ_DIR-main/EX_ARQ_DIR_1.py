import os

#Declaração de Variáveis Globais (b)
valor: int = 0
dir: str = '/tmp/exercicios'
arq: str = 'ex34.txt'

#Procedimento grava() (e)
def grava(c, rslt):
    global dir, arq

    file: str = ''
    tipo: str = ''
    enc: str = 'utf-8'
    linha: str = str(rslt) + '\n'
    if os.path.exists(dir) and os.path.isdir(dir):
        file = os.path.join(dir, arq)
        if os.path.exists(file) and c > 0:
            tipo = 'a'
        else:
            tipo = 'w'

        with open(file, tipo, encoding=enc) as f:
            f.write(linha)

#Função mult (d)
def mult(vlr, tab):
    res = vlr * tab
    return res

#Procedimento main() (c)
def main():
    global valor, dir
    contador = 1
    valor = int(input("Digite um número que deseja saber a tabuada - entre 1 e 10: "))
    while valor < 1 or valor > 10:
        valor = int(input("Valor inválido. Digite entre 1 e 10: "))
    while contador <= 10:
        result = mult(valor, contador)
        grava(contador, result)
        contador += 1

    pasta: str = ''
    pastas: str = ''
    arquivo: str = ''
    tamanho: float = 0.0

    pastas = '/tmp/exercicios/'
    os.makedirs(pastas, exist_ok=True)
    os.chmod(pastas, 0o744)

if __name__ == '__main__':
    main()