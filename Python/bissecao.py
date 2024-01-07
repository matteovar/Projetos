import math
from math import e

def f(x):
  return x*math.cos(x) - (2*(x**2)) + 3 * x - 1

def bisseccao(f, a, b, epsilon):
  print(f"a = {a}, b = {b}")

  while abs(b - a) > epsilon:
    m = (a + b) / 2

    print(f"m = {m}")

    if abs(f(m)) < epsilon:
      return m
    elif f(a) * f(m) < 0:
      b = m
    else:
      a = m

    print(f"a = {a}, b = {b}")

  return (a + b) / 2

n_intervalos = int(input("Quantos intervalos deseja analisar? "))

for i in range(n_intervalos):

  encontrou_raiz = False
  
  a = float(input("Limite inferior do intervalo: "))
  b = float(input("Limite superior do intervalo: "))

  epsilon = 0.001

  raiz = bisseccao(f, a, b, epsilon)

  if abs(f(raiz)) < epsilon:
    print(f"\nEncontrada raiz aproximada em {raiz} menor que o erro epsilon")
    encontrou_raiz = True
    
  print(f"\nRaiz no intervalo [{a}, {b}] = {raiz}")
