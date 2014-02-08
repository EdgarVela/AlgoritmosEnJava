/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   		int c=1,r=1;
		int lim=Integer.parseInt(args[0].toString());
   		System.out.println("Numero "+args[0]);
		do{
		r=r*c;
		c++;
		}
		while(c<=lim);
   		System.out.println("el producto es: "+r);
        }

}