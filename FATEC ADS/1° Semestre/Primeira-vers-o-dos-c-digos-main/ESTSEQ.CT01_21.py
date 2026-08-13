#Declaração de Variáveis
nota1: float = 0
nota2: float = 0
nota3: float = 0
nota4: float = 0
media: float = 0

#Início
nota1 = float(input("Digite a nota da primeira prova: "))
nota2 = float(input("Digite a nota da segunda prova: "))
nota3 = float(input("Digite a nota da terceira prova: "))
nota4 = float(input("Digite a nota da quarta prova: "))
media = (nota1+nota2+nota3+nota4)/4
if media>=6:
    print("APROVADO")
else:
    if media<3:
        print("RETIDO")
    else:
        print("EXAME")

#FIM