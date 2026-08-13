import multiprocessing
import platform
import os


def ping_servidor(dados):

    nome = dados[0]
    servidor = dados[1]

    sistema = platform.system()

    # Linux
    if sistema == 'Linux':
        comando = f'ping -4 -c 10 {servidor}'

    # Windows
    elif sistema == 'Windows':
        comando = f'ping -4 -n 10 {servidor}'

    # Outros sistemas
    else:
        print(f'Sistema operacional não suportado.')
        return

    # Executa o ping
    resultado = os.popen(comando)

    tempos = []

    # Lê linha por linha
    for linha in resultado:

        # Linux
        if 'time=' in linha:

            parte = linha.split('time=')[1]

            tempo = parte.split()[0]

            # Remove ms
            tempo = tempo.replace('ms', '')

            try:

                tempo_float = float(tempo)

                tempos.append(tempo_float)

                print(f'{nome} -> Tempo: {tempo_float} ms')

            except:
                pass

        # Windows
        elif 'tempo=' in linha.lower():

            parte = linha.lower().split('tempo=')[1]

            tempo = parte.split('ms')[0]

            try:

                tempo_float = float(tempo)

                tempos.append(tempo_float)

                print(f'{nome} -> Tempo: {tempo_float} ms')

            except:
                pass

    # Média final
    if len(tempos) > 0:

        media = sum(tempos) / len(tempos)

        print(f'\n{nome} -> Tempo médio: {media:.2f} ms\n')

    else:
        print(f'{nome} -> Não foi possível calcular a média.')


def main():

    servidores = [
        ['UOL', 'www.uol.com.br'],
        ['Terra', 'www.terra.com.br'],
        ['Google', 'www.google.com.br']
    ]
    

    with multiprocessing.Pool(processes=3) as pool:

        pool.map(ping_servidor, servidores)


if __name__ == '__main__':
    main()