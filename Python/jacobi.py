#Matteo Dommiiciano Varnier - 32158238  
#Felipe Mazzeo Barbosa - 32257023

import time
start = time.time()

def printAprox(arr): #auxiliar para formatação
    for i in range(len(arr)):
        print("x%s: %.5f\t" % (i+1, arr[i]), end = ' ')
    print("\n")



def metJacobi(matrSist, arrResult, tamanh, aprox=None,  
              maxItera = 100, tolMin = 1e-3):
    
    if aprox is None:
        aprox = [0 for i in range(tamanh)] 
        
    aprox2 = [0 for i in range(tamanh)]
    matrAum = matrSist
    arrResultAum = arrResult

    for i in range(tamanh):
        p = matrAum[i][i]
        for j in range(tamanh):
            if p != 0:            
                matrAum[i][j] = -(matrAum[i][j] / float(p))
                
            if i == j:
                matrAum[i][i] = 0
            if p == 0: 
                print("Impossivel fazer, Divisão por zero na linha", i+1)
                return
        arrResultAum[i] = arrResultAum[i] / float(p)

    sucesso = False
    
    for x in range(maxItera):
        print("k=%d" % (x+1))
        if p == 0:
            raise ValueError("Divisão por zero na linha %d" % (i+1))
        if x%2 == 0:
            for i in range(tamanh):
                soma = 0
                for j in range(tamanh):
                    soma += matrAum[i][j] * aprox[j]
                aprox2[i] = soma + arrResultAum[i]
            printAprox(aprox2)
            if x == maxItera-1:
                if (max(aprox)!=0) and \
                (abs(max(aprox2) - max(aprox)) / abs(max(aprox))) < tolMin:
                    #a tolerância foi atingida
                    print("O processo foi bem-sucedido")
                    sucesso = True
                else:
                    print("O processo excedeu o numero maximo de iteracoes")
            
            
        else:
            for i in range(tamanh):
                soma = 0
                for j in range(tamanh):
                    soma += matrAum[i][j] * aprox2[j]
                aprox[i] = soma + arrResultAum[i]
            printAprox(aprox)
            if x == maxItera-1:
                if (max(aprox)!=0) and \
                (abs(max(aprox2) - max(aprox)) / abs(max(aprox))) < tolMin:
                    #a tolerância foi atingida
                    print("O processo foi bem-sucedido")
                    sucesso = True
                else:
                    print("O processo excedeu o numero maximo de iteracoes")

           
            
    return sucesso




maxItera = 10      #Máximo de Iterações
tolMin = 1e-3       #Tolerancia

#Para Ax = b
matriz = [[10,-1,2,0],    #A
          [-1,11,-1,3],
          [2,-1,10,-1],
          [0,3,-1,8]
          ]


arrResult = [6,25,-11,15]   #b

print("Matriz:")
for i in matriz :
    print('\t'.join(map(str, i)))
print("\n")


tam = len(arrResult)    
aproxIni = [0 for i in range(tam)]      #Vetor de aproximações iniciais


metJacobi(matriz, arrResult, tam, aproxIni, maxItera, tolMin)

end = time.time()
print("Tempo de execucao: {} segundos".format(end-start))