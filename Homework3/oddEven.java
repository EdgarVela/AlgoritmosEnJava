/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   
   public static void main(String[] args) {
    int num=0;
   	int lim=Integer.parseInt(args[0].toString());
		do
		{
			if (num%2==0){
				System.out.println("El Numero es Par");
			}else if (num%2!=0){
			System.out.println("El Numero es Impar");}
			num++;
		}
		while(num<=lim);
	}
}