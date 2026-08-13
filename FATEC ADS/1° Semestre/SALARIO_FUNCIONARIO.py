#Declaração de Variáveis

qthoras: float = 0
vrhora: float = 0
percdesc: float = 0
numdep: float = 0
salbruto: float = 0
salliquido: float = 0
salfinal: float = 0

#Início
qthoras = float(input("Qual a quantidade de horas trabalhadas?"))
vrhora = float(input("Qual é o valor da hora trabalhada?"))
percdesc = float(input("Qual o percentual de desconto?"))
numdep = float(input("Qual o número de dependentes?"))
salbruto = qthoras*vrhora
salliquido = salbruto - percdesc
salfinal = salliquido + (numdep*100)
print("Salário bruto=", salbruto)
print("Salário líquido=", salliquido)
print("Salário final (considerando o acréscimo com dependentes)", salfinal)

#Fim