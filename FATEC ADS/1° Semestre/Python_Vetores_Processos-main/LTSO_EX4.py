import platform
import os

def sistema_operacional():
    return platform.system()

def ping():
    so = sistema_operacional()

    if so == "Windows":
        comando = "ping -4 -n 10 www.google.com.br"
        resposta = os.popen(comando)

        for linha in resposta:
            if "Média" in linha:
                partes = linha.split("=")
                media = partes[3].strip()
                print("Média do ping: ", media)
    elif so == "Linux":
        comando = "ping -4 -c 10 www.google.com.br"
        resposta = os.popen(comando)
        for linha in resposta:
            if "min/avg/max" in linha:
                partes = linha.split("/")
                media = partes[4]
                print("Média do ping: ", media, "ms")
    ping()

    if __name__ == '__main__':
        ping()