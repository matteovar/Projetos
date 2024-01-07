from math import *

# Função e derivada  
def f(x):
  return e*x-(3*(x**2))

def df(x):
  return e*x-6*x

# Critérios de parada
def newton_tol(f, df, p, epsilon, N0=50):
  n = 1
  pn = p
  while n <= N0:
    pn1 = pn - f(pn)/df(pn)
    if abs(pn1 - pn) < epsilon:
      print('Raiz encontrada após', n, 'iterações (critério: tolerância)')
      print('Raiz encontrada:', pn1)  
      return pn1
    pn = pn1
    n += 1
  print('Excedeu o número máximo de iterações')
  return None

def newton_diff(f, df, p, epsilon, N0=50):
    n = 1 
    pn = p
    pn1 = p + 2*epsilon
    while abs(pn1 - pn) > epsilon:
        pn1 = pn - f(pn)/df(pn)
        pn = pn1
        n += 1
        if n > N0:
            print('Excedeu o número máximo de iterações (critério: diferença)')
            return None
    print('Raiz encontrada após', n, 'iterações (critério: diferença)')
    print('Raiz encontrada:', pn1)
    return pn1
  
def newton_abs(f, df, p, epsilon, N0=50):
    n = 1
    pn = p
    while abs(f(pn)) > epsilon:
        pn1 = pn - f(pn)/df(pn)
        pn = pn1
        n += 1
        if n > N0:
            print('Excedeu o número máximo de iterações (critério: valor absoluto)')
            return None
    print('Raiz encontrada após', n, 'iterações (critério: valor absoluto)')
    print('Raiz encontrada:', pn1)
    return pn1

# Entrada do usuário
n = int(input('Informe número de intervalos: '))

intervals = []
for i in range(n):
  a = float(input(f'Limite inferior intervalo {i+1}: '))
  b = float(input(f'Limite superior intervalo {i+1}: '))
  intervals.append((a, b))  

# Aplicação em cada intervalo
for a, b in intervals:
    p0 = (a + b)/2
    epsilon = 0.0001
  
    print(f'\nIntervalo de {a} a {b}:')
  
    newton_tol(f, df, p0, epsilon) # chamada faltando
    newton_diff(f, df, p0, epsilon)
    newton_abs(f, df, p0, epsilon)