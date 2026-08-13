import multiprocessing
import time
import random

sem_tocha = None
sem_pedra = None
sem_porta = None

tocha = None
pedra = None
portas = None
porta_saida = None


def init(s_tocha, s_pedra, s_porta, t, p, pts, saida):

    global sem_tocha,sem_pedra,sem_porta, tocha, portas, porta_saida, pedra

    sem_tocha = s_tocha
    sem_pedra = s_pedra
    sem_porta = s_porta

    tocha = t
    pedra = p
    portas = pts
    porta_saida = saida


def cavaleiro(id):

    distancia = 0
    velocidade = random.randint(2, 4)

    while distancia < 2000:
        distancia += velocidade
#TOCHA
        if distancia >= 500 and tocha.value == 0:
            with sem_tocha:
                if tocha.value == 0:
                    tocha.value = id
                    velocidade += 2
        print(f'Cavaleiro {id} pegou a TOCHA ' f'(vel={velocidade})')

 # PEDRA
    if (distancia >= 1500 and pedra.value == 0 and id != tocha.value):
         with sem_pedra:
            if (pedra.value == 0 and id != tocha.value):
                pedra.value = id
                velocidade += 2
                print(f'Cavaleiro {id} pegou a PEDRA 'f'(vel={velocidade})')
    time.sleep(0.05)
    print(f'Cavaleiro {id} chegou ao final.')
    escolher_porta(id)

def escolher_porta(id):
    with sem_porta:
        porta = random.choice(list(portas))
        portas.remove(porta)
        if porta == porta_saida.value:
            print(f'Cavaleiro {id} escolheu 'f'a porta {porta} e ESCAPOU!')
        else:
            print(f'Cavaleiro {id} escolheu 'f'a porta {porta} e foi DEVORADO!')

def main():

    manager = multiprocessing.Manager()

    sem_tocha = multiprocessing.Semaphore(1)
    sem_pedra = multiprocessing.Semaphore(1)
    sem_porta = multiprocessing.Semaphore(1)

    tocha = multiprocessing.Value('i', 0)
    pedra = multiprocessing.Value('i', 0)

    portas = manager.list([1, 2, 3, 4])

    porta_saida = multiprocessing.Value('i',random.randint(1, 4))

    cavaleiros = [1, 2, 3, 4]

    with multiprocessing.Pool(processes=4,initializer=init,initargs=(sem_tocha,sem_pedra,sem_porta,tocha, pedra, portas, porta_saida)) as pool:
        pool.map(cavaleiro, cavaleiros)

    print(f'\nA porta correta era 'f'{porta_saida.value}')

if __name__ == "__main__":
    main()