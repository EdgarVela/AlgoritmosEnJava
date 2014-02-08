/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int x = 0;
   		int z=Integer.parseInt(args[0].toString());
			z--;
			if(z>0)
			{
				do
				{
				System.out.println("El valor actual es: "+x);
				x++;
				}
				while(x<z);
			}
				else
				{
				System.out.println("Ingrese un valor diferente a cero:");
				}		
   			System.out.println("El valor actual es: "+x); 
   }

}