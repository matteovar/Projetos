
def copia_matriz(matriz):
  nova_matriz = []
  for linha in matriz:
    nova_linha = []
    for elemento in linha:
      nova_linha.append(elemento)
    nova_matriz.append(nova_linha)
  
  return nova_matriz

def triangular(entrada):
  saida = [None for x in range(len(entrada))]
  
  for i in reversed(range(0, len(entrada[0]) - 1)):
    soma = 0
    for j in reversed(range(i, len(entrada))):
      if i != j:
        soma += saida[j] * entrada[i][j]
      else:
        saida[i] = (entrada[i][len(entrada[0]) - 1] - soma) / entrada[i][i]
        break
        
  return saida
  
def pivotante(entrada):
  n = len(entrada)

  for k in range(1, n):
    if entrada[k][k] == 0:
      return None
    
    entrada_tmp = copia_matriz(entrada)
    
    for i in range(n):
      for j in range(n + 1):
        if i < k:
          entrada[i][j] = entrada_tmp[i][j]
        elif i > k - 1 and j < k:
          entrada[i][j] = 0  
        else:
          entrada[i][j] = entrada_tmp[i][j] - (entrada_tmp[i][k - 1] / entrada_tmp[k - 1][k - 1] * entrada_tmp[k - 1][j])

  return entrada
  
def gauss(entrada):
  resultado = triangular(pivotante(entrada))
  resultado_arredondado = [round(x, 2) for x in resultado]
  
  return resultado_arredondado

def imprime_matriz(matriz):
  for linha in matriz:
    for valor in linha:
      print(f"{valor:.2f}", end="\t")
    print()
    
entrada = [[1, 1, 0, 3, 4], [2, 1, -1, 1, 1], [3, -1, -1, 2, -3], [-1, 2, 3, -1, 4]]

print("Matriz de Entrada:")
imprime_matriz(entrada)

print("\nResultado do Triangulo:")
for j, valor in enumerate(triangular(entrada)):
  print(f"x{j + 1} = {valor}")
  
print("\nResultado do Pivotante:")  
for k, valor in enumerate(pivotante(entrada)):
  print(f"x{k + 1} = {valor}")
  
print("\nResultado do Método de Eliminação de Gauss:")
for i, valor in enumerate(gauss(entrada)):
  print(f"x{i + 1} = {valor}")