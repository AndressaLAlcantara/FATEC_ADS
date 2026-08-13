import multiprocessing
import random
import time

def calculo(params):
    id = params[0]
    valores = params[1]

    soma = 0

    for valor in valores:
        soma += valor
        time.sleep(0.2)

    print(f'Linha {id} -> Soma = {soma}')


def main():

    params = []

    for i in range(3):
        v1 = random.randint(1, 100)
        v2 = random.randint(1, 100)
        v3 = random.randint(1, 100)
        v4 = random.randint(1, 100)
        v5 = random.randint(1, 100)

        valores = [v1, v2, v3, v4, v5]

        parametros = [i + 1, valores]

        params.append(parametros)

    with multiprocessing.Pool(processes=3) as pool:
        pool.map(calculo, params)


if __name__ == '__main__':
    main()