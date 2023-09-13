import math

def expTaylor(x, n):
  resultado = 1
  fatorial = 1

  for i in range(1, n+1):
    fatorial *= i
    termo = x**i / fatorial
    if i >= 5:
      termo = round(termo, 4) 
    resultado += termo

  return resultado

x = 3 
n = 10

print(round(expTaylor(x, n), 4))