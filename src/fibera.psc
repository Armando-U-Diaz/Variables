Algoritmo fibera
	Definir x, a, b, c, d Como Entero
	Leer x
	a<-0
	b<-1
	d<-0
	Mientras x>=d Hacer
		Escribir d, ' / ', c
		d<-d+1
		c<-b
		b<-a+b
		a<-c
	Fin Mientras
FinAlgoritmo
