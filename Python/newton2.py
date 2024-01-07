from math import *
def f(x):
    return e**x-(3*(x**2))

def df(x):
    return e**x-6*x

def newton(f, df, p, epsilon, N0=50):
    n = 1
    pn = p
    while n <= N0:
        pn1 = pn - f(pn)/df(pn)
        if abs(pn1 - pn) < epsilon:
            print('Raiz encontrada após', n, 'iterações')
            return pn1
        pn = pn1
        n += 1
    print('Excedeu o número máximo de iterações')
    return None

p0 = 4
epsilon = 0.0001

raiz = newton(f, df, p0, epsilon)
print(f'Raiz encontrada: {raiz:.8f}')