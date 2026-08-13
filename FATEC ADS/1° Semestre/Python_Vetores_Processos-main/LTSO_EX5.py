import platform
import os

# Função que identifica o SO
def sistema_operacional():
    return platform.system()

# Procedimento que executa os processos
def processo_filho(opcao, parametro=""):

    so = sistema_operacional()

    #WINDOWS
    if so == "Windows":

        # Listar processos
        if opcao == 1:
            comando = "TASKLIST /FO TABLE"

        # Matar por PID
        elif opcao == 2:
            comando = f"TASKKILL /PID {parametro}"

        # Matar por nome
        elif opcao == 3:
            comando = f"TASKKILL /IM {parametro}"

    # LINUX 
    elif so == "Linux":

        # Listar processos
        if opcao == 1:
            comando = "ps -ef"

        # Matar por PID
        elif opcao == 2:
            comando = f"kill -9 {parametro}"

        # Matar por nome
        elif opcao == 3:
            comando = f"pkill -f {parametro}"

    # Executa o comando
    retorno = os.popen(comando)

    # Exibe saída
    for linha in retorno:
        print(linha.strip())

# MAIN

opcao = 0

while opcao != 9:

    print("\n1 - Listar Processos")
    print("2 - Matar Processo por PID")
    print("3 - Matar Processo por Nome")
    print("9 - Encerrar")

    opcao = int(input("Digite uma opção: "))

    # Listar processos
    if opcao == 1:
        processo_filho(1)

    # Matar por PID
    elif opcao == 2:

        pid = input("Digite o PID: ")

        processo_filho(2, pid)

    # Matar por Nome
    elif opcao == 3:

        nome = input("Digite o nome do processo: ")

        processo_filho(3, nome)

    # Encerrar
    elif opcao == 9:
        print("Aplicação encerrada.")

    else:
        print("Opção inválida.")
