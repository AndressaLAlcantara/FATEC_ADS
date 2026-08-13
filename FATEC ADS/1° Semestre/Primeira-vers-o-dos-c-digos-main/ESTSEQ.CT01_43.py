#Declaração de Variáveis

ana: float = 1.10
maria: float = 1.5
anos: int = 0

#Início

while ana <= maria:
    ana += 0.03
    maria += 0.02
    anos += 1
print(f"Após {anos} anos, Ana terá {ana:.2f} m e Maria terá {maria:.2f} m.")

#Fim
