#Declaração de Variáveis

nasc: int = 0
atual: int = 0
idade: int = 0
novaidade: int = 0

#Início

nasc = int(input("Digite o ano do seu nascimento="))
atual = int(input("Digite o ano em que estamos="))
idade = atual-nasc
print("A sua idade=", idade)
novaidade = idade+17
print("Sua idade daqui 17 anos=", novaidade)

#Fim
