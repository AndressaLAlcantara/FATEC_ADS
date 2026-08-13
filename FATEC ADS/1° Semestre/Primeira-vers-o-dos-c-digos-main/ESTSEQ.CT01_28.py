#Declaração de Variáveis

preco_atual: float = 0
preco_novo: float = 0
venda_mensal: float = 0

#Início

preco_atual = float(input("Digite o preço atual de um produto: "))
venda_mensal = float(input("Digite o preço da venda mensal de um produto: "))
if venda_mensal < 500 and preco_atual <30:
    preco_novo = preco_atual * 1.10
elif 500 <= venda_mensal < 1000 and 30 <= preco_atual < 80:
    preco_novo = preco_atual * 1.15
elif venda_mensal >= 1000 and preco_atual >=80:
    preco_novo = preco_atual * 0.95
else:
    preco_novo = preco_atual
print(f"Novo preço: R$ {preco_novo:.2f}")

#Fim