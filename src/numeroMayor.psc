Algoritmo numeroMayor
	Definir numero1, numero2 Como Entero
	Escribir "Ingresa tu primer numero"
	Leer numero1
	Escribir "Ingresa tu siguiente numero"
	Leer numero2
	Si numero1=numero2 Entonces
		Escribir "Son iguales: ", numero1," y ", numero2
	SiNo
		si numero1>numero2 Entonces
			Escribir "El mayor es: ", numero1, " Y el menor es: ", numero2
		SiNo
			EScribir "El mayor es: ", numero2, " Y el menor es: ", numero1
		FinSi
	FinSi
FinAlgoritmo    
