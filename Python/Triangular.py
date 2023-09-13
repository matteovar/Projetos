#Matteo Domiciano Varnier - 32158238

import copy

def triangular(entrada):
	saida = [None for x in range(len(entrada))]
	for i in reversed(range(0,len(entrada[0])-1)): 
		soma = 0
		for j in reversed(range(i,len(entrada))):
			if i != j: 
				soma += saida[j]*entrada[i][j] 
			else: 
				saida[i]=(entrada[i][len(entrada[0])-1]-soma)/entrada[i][i] 
				break
	return saida

# Complexidade O(n^2)



def pivotante(entrada):
	n = len(entrada) 
	anterior = copy.deepcopy(entrada) 
	proximo = copy.deepcopy(entrada)
	for k in range(1,n): 
		if proximo[k][k] == 0: 
			return None 
		anterior = copy.deepcopy(proximo)
		for i in range(n):
			for j in range(n+1):
				if i < k: 
					proximo[i][j] = anterior[i][j]
				elif i > k-1 and j < k:
					proximo[i][j] = 0
				else:
					proximo[i][j] = anterior[i][j]-(anterior[i][k-1]/anterior[k-1][k-1]*anterior[k-1][j])
	return proximo 

# Complexidade O(n^3)

def gauss(entrada):
    resultado = triangular(pivotante(entrada))
    resultado_arredondado = [round(x, 2) for x in resultado]
    return resultado_arredondado
# Complexidade O(n^2)+O(n^3)

entrada = [[1,1,0,3,4], [2,1,-1,1,1], [3,-1,-1,2,-3], [-1,2,3,-1,4]]
print(gauss(entrada))