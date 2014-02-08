/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   
   public static void main(String[] args) {
		int Inf=Integer.parseInt(args[0].toString());
		int Sup=Integer.parseInt(args[1].toString());
		System.out.println("Los Limites ingresados son:    "+args[0]+"   "+args[1]);
		Inf++;
		System.out.println("La suma entre sus limites es:");
		do{
		System.out.println(Inf);
		Inf++;
		}
		while(Inf<Sup);      
   }
}