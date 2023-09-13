print("Multiplicação de Matrizes")

print("\n")
while True: 
    # 
    m = int(input("Entre com o número de linhas da matriz A: "))
    n = int(input("Entre com o número de colunas da matriz A: "))
    o = int(input("Entre com o numerod e linhas da matriz B: "))
    p = int(input("Entre com o número de colunas da matriz B: "))

    if n != o:
        print("Erro: O número de colunas de A deve ser igual ao número de linhas de B.")
        continue

    break

A = []
B = []
for i in range(m):
    linha = []
    for j in range(n):
        linha.append(0)
    A.append(linha)

for i in range(n):
    linha = []
    for j in range(p):
        linha.append(0)
    B.append(linha)
    
# Escrever os elementos de A
print("Entre com os elementos da matriz A:")
for i in range(m):
    for j in range(n):
        A[i][j] = int(input(f"A[{i+1}][{j+1}]: "))
              
# Escrever os elementos de B              
print("Entre com os elementos da matriz B:")
for i in range(n):
    for j in range(p):
        B[i][j] = int(input(f"B[{i+1}][{j+1}]: "))

C = []
for i in range(m):
    linha = []
    for j in range(p):
        linha.append(0)
    C.append(linha)

# Multiplicação das matrizes
for i in range(m):
    for j in range(p):
        for k in range(n):
            C[i][j] += A[i][k] * B[k][j]
            
print("\n")

# Imprimindo matriz A
print("Matriz A:")
for linha in A:
  print(linha)
print("\n")

# Imprimindo matriz B  
print("Matriz B:")
for linha in B:
  print(linha)
print("\n")

# Exibição do resultado
print("Resultado da multiplicação:")
for linha in C:
    print(linha)
