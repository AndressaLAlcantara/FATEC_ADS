import os

#Declaração de Variáveis Globais
nome: str = ''
nota1: float = 0.0
nota2: float = 0.0
nota3: float = 0.0
nota4: float = 0.0
valor_media: float = 0.0
dir: str = '/tmp/exercicios'
arq: str = 'ex21.txt'

#Função med (e)
def med(n1, n2, n3, n4):
    global nota1, nota2, nota3, nota4
    media: float = (n1 + n2 + n3 + n4) / 4
    return media

#Função escreveArq (g)
def escreveArq(caminho, arquivo, linha_arq):
    file: str = ''
    tipo: str = ''
    enc: str = 'utf-8'
    
    if os.path.exists(caminho) and os.path.isdir(caminho):
        file = os.path.join(caminho, arquivo)
        if os.path.exists(file):
            tipo = 'a'
        else:
            tipo = 'w'

        with open(file, tipo, encoding=enc) as f:
            f.write(linha_arq)

#Procedimento cadastro (f)
def cadastro(nm, nt1, nt2, nt3, nt4, vlr_med):
    global arq, dir
    linha = nm + ";" + str(nt1) + ";" + str(nt2) + ";" + str(nt3) + ";" + str(nt4) + ";" + str(vlr_med) + "\n"
    print("Cadastro realizado!")
    print(nm, nt1, nt2, nt3, nt4, vlr_med)
    escreveArq(dir, arq, linha)

#Procedimento entrada (d)
def entrada():
    global nome, nota1, nota2, nota3, nota4, valor_media
    nome = str(input('Digite o nome do aluno: '))
    nota1 = float(input("Digite a nota da primeira prova: "))
    nota2 = float(input("Digite a nota da segunda prova: "))
    nota3 = float(input("Digite a nota da terceira prova: "))
    nota4 = float(input("Digite a nota da quarta prova: "))
    valor_media = med(nota1, nota2, nota3, nota4)
    print("Média: ", valor_media)
    cadastro(nome, nota1, nota2, nota3, nota4, valor_media)

#Procedimento main() (c)
def main():
    global dir
    os.makedirs(dir, exist_ok=True)
    os.chmod(dir, 0o744)
    contador = 0
    while contador < 5:
        entrada()
    contador += 1

if __name__ == '__main__':
    main()
