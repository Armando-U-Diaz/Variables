Algoritmo tuCalificacion
	Definir nombre Como Caracter
	Definir calificacionM, calificacionQ, calificacionI, promedio Como Real
	Escribir "�Cual es tu nombre?"
	Leer nombre
	Escribir "�Cual es tu calificacion de Matematicas?"
	Leer calificacionM
	Escribir "�Cual es tu calificacion de Quimica?"
	leer calificacionQ
	Escribir "�Cual fu tu calificacon de Ingles?"
	Leer calificacionI
	promedio<-(calificacionI+calificacionM+calificacionQ)/3
	si promedio>5.9999 Entonces
		Escribir nombre, " Aprobaste"
		Escribir "Calificacion final: ", promedio
	SiNo
		Escribir nombre, " No aprobo"
		Escribir "Calificacion final: ", promedio
	FinSi
FinAlgoritmo
