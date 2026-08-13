#Declaração de Variáveis

h_inicio: int = 0
m_inicio: int = 0
h_fim: int = 0
m_fim: int = 0
inicio_total: int = 0
fim_total: int = 0
duracao_minutos: int = 0
duracao_horas: int = 0
duracao_restante_minutos: int = 0

#Início
def horarios():
    global h_inicio, m_inicio, h_fim, m_fim
    h_inicio = int(input("Digite a hora de início (0-23): "))
    m_inicio = int(input("Digite os minutos de início (0-59): "))
    h_fim = int(input("Digite a hora de término (0-23): "))
    m_fim = int(input("Digite os minutos de término (0-59): "))

def inicio_fim():
    global inicio_total, fim_total, duracao_minutos
    inicio_total = h_inicio * 60 + m_inicio
    fim_total += 24 * 60
    duracao_minutos = fim_total - inicio_total

def duracao():
    global duracao_minutos, duracao_horas, duracao_restante_minutos
    if duracao_minutos <= 0:
        duracao_minutos += 24 * 60
        duracao_horas = duracao_minutos // 60
        duracao_restante_minutos = duracao_minutos % 60
        print(f"O tempo de duração do jogo foi: {duracao_horas} hora(s) e {duracao_restante_minutos} minuto(s).")

def main():
    horarios()
    inicio_fim()
    duracao()

if __name__ == "__main__":
    main()

#Fim