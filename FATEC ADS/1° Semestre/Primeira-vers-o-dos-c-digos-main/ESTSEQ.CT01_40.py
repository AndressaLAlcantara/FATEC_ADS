#Declaração de Variáveis

v1: int = 0
v2: int = 0
i: int = 0

#Início

v1 = int(input("Digite o primeiro valor: "))
v2 = int(input("Digite o segundo valor: "))
menor = min(v1, v2)
maior = max(v1, v2)
for v in range (v1 +1, v2):
     if v > 1:
          primo = True
          for i in range(2, v):
               if v % i ==0:
                    primo = False
                    break
          if primo:
               print(v) 
#Fim       