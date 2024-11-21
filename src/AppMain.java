import java.util.Scanner;
import java.util.Random;
public class AppMain {
	public static void main(String[] args) {
		AppMain a = new AppMain();
		a.run();
	}
	/**
	 * Método donde colocar todos los ejercicios
	 */
	public void run() {
	
		System.out.println("Inicio de la aplicación");
		/*  Insertar aquí las llamadas a los ejercicios que se vayan implementando */
		//ej210();
		//ej202();
		//ej201();
		//ej212();
		//ej214();
		//ej215();
		//ej216();
		//ej217();
		//ej218();
		ej220();
		System.out.println("Fin de la aplicación");
	}
	//------------------- Lista de ejercicios resueltos
	public void ej201() {
	System.out.println("Iniciando programa");
	   Scanner sc = new Scanner(System.in);
	int a= 0;
	int b= 0;
	int c= 0;
	System.out.println("Hola:D");
	System.out.print("Inserte a= ");
	a = sc.nextInt();
	System.out.println("Inserte b= ");
	b = sc.nextInt();
	System.out.println("Inserte c= ");
	c = sc.nextInt();
		
		if (a==b&&a==c) {
			System.out.println("Es un Triángulo Equilátero");
		}
		else if (((a * a)+(b * b) == (c*c)) ||
				((c*c)+(b*b) == (a*a))  ||
				(a*a)+(c*c) == (b*b))
						{
			System.out.println("Es un Triángulo Rectángulo");
		}else if ((a==c) ||
				 (a==b) ||
				 (b==c))
						{
		    System.out.println("Es un Triángulo Isóseles");
		    
		    }else {
		    	System.out.println("Triángulo Escaleno");
		    }
		System.out.println("Finalizado");
			}
//////-----------------------------------------------------------------------------------------
public void ej202() {
		
		System.out.println("Hola");
		int Alumnos;
		int Precio;
		int Costototal;
		System.out.println("Número de viajeros= ");
		Scanner sc = new Scanner(System.in);
		Alumnos = sc.nextInt();
			if(Alumnos>=100) {
				Precio = 65;
				Costototal = Alumnos * Precio;
				System.out.println("El costo total del viaje en euros es" + Costototal);
				System.out.println("El costo por alumno en euros es" + Precio);
			}	
			else if(Alumnos>=50) {
				Precio = 70;
				Costototal = Alumnos * Precio;
				System.out.println("El costo total del viaje en euros es" + Costototal);
				System.out.println("El costo por alumno en euros es" + Precio);
			}	else if(Alumnos>=30){
					Precio = 95;
					Costototal = Alumnos * Precio;
					System.out.println("El costo total del viaje en euros es" + Costototal);
					System.out.println("El costo por alumno en euros es" + Precio);
			}			else {
							Costototal = 4000;
							Precio = Costototal;
								if (Alumnos < 30) {
									Costototal= Precio;
								   }else {
									Costototal = Precio*Alumnos; }
								System.out.println("El costo total del viaje es euros" + Costototal);
									}
	}
//------------------------------------------------------------------------------------------------new 	
public void ej210() { 
		System.out.println("Ejercicio 210");
		double Compramínima =100;
		double Descuento = 0.08;
		double Precio=0;
			Scanner sc = new Scanner(System.in);
				System.out.println("Ingrese el valor del producto= ");
					//				double Precio = sc.nextInt();
					double Preciofinal;
						if (Precio > Compramínima) { 
						Descuento = Precio*Descuento;
							Preciofinal= Precio-Descuento;
								//						System.out.println("Se aplicó el descuento del 8%" + Preciofinal);
								//					}else {
							Preciofinal = Precio;
							System.out.println("No se aplicó descuento" + Preciofinal);
						}
			}
//-------------------------------------------------------------------------------------------------------	
public void ej211() {
	System.out.println("Hola, ingrese las notas de los alumnos");
		double Notas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Notas:");
		Notas = sc.nextInt();
		if (Notas>=0&&Notas<=10)  {
			if (Notas >=9) {
				System.out.println("Sobresaliente");
			}else if (Notas >=6.5)
				System.out.println("Notable");
				}else if (Notas >=5) {
					System.out.println("Suficiente");
					}else {
						System.out.println("Insuficiente");
					}
				}		
//--------------------------------------------------------------------------------------------------
public void ej212() { 
	System.out.println("Ejercicio 212");
		double Compramínima =100;
		double Descuento= 0.08;
		double ValorMáximo = 50;
			Scanner sc = new Scanner(System.in);
				System.out.println("Ingrese el valor del producto= ");
					double Precio = sc.nextInt();
					double Preciofinal;
					if (Precio<0) {
						System.out.println("Error: El precio no puede ser negativo");
						}else {
							double PrecioFinal;
					if (Precio >= Compramínima) { 
							Descuento = Precio*Descuento;
							Preciofinal= Precio-Descuento;
							System.out.println("Se aplicó el descuento del 8%" + Preciofinal);
							}else {
							Preciofinal = Precio;
							System.out.println("No se aplicó descuento" + Preciofinal);
						}
					}
}
public void ej213() {
	System.out.println("Ejercicio 213");
		int a;
		int b;
		int resultado;
		int opción;
			System.out.println("Ingresa el primer número");
			Scanner sc = new Scanner(System.in);
			a= sc.nextInt();
			System.out.println("Ingresa el segundo número");
			b= sc.nextInt();
			
				System.out.println("Ingresa que operación deseas realizar");
				System.out.println("1.Suma");
				System.out.println("2.Resta");
				System.out.println("3.Multiplicación");
				System.out.println("4.División");
				System.out.print("Elije un número");
				 opción= sc.nextInt();
				 	switch (opción) {
				 	case 1:
				 		resultado=a+b;
				 		System.out.println("El resultado es:  "+ resultado);
				 	case 2:
				 		resultado=a-b;
				 		System.out.println("El resultado es:  "+ resultado);
				 	case 3:
				 		resultado=a*b;
				 		System.out.println("El resultado es:  "+ resultado);
				 	case 4:
				 		if (b !=0) {
				 			System.out.println("El resultado es:  "+a+"/"+b+"="+((double)a/b)); }
				 			else {
				 				System.out.println("No se puede dividir por 0");
				 			}
				 	}	 		
}
//----------------------------------------------------------------------------------------------------------
public void ej214() {
	System.out.println("Ejercicio 214");
	Scanner sc = new Scanner(System.in);
	int mes;
	System.out.println("Ingresa el número del més:");
		mes= sc.nextInt();
			switch (mes) {
			case 2:
				System.out.println("El número de días es 28 y 29 en los años biciestos");
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("El número de días es 30");
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("El número de días es 31");			
}
}
//---------------------------------------------------------------------------------------------------------------------
public void ej215() {
	System.out.println("Ejercicio 215: ");
	Scanner sc= new Scanner(System.in);
	System.out.println("Ingresa la temperatura: ");
	int temperatura= sc.nextInt();
	System.out.println(temperatura >= 21 ? "Activa el aire acondicionado" : "Apaga el aire acondicionado");
}
//------------------------------------------------------------------------------------------------------------------
public void ej216() {
	System.out.println("Ejercicio 216");
	Scanner sc= new Scanner(System.in);
	System.out.println("Ingresa la hora (0-23):");
	int hora= sc.nextInt();
	String mensaje;
	if(hora<0 || hora>23) {
		mensaje = "Hora no válida";
	}else if ((hora>=9 && hora<14) || (hora>=16 && hora<19)) {
		mensaje= "Horario de trabajo";
	}else if (hora==14 || hora==15) {
		mensaje= "Tiempo libre";
	}else{
		mensaje= "Tiempo libre";
	}
	System.out.println(mensaje);
}
//------------------------------------------------------------------------------------------------------------
public void ej217() {
	Scanner scanner = new Scanner(System.in);
    int numeroSecreto = (int) (Math.random() * 100) + 1;
    int intento, intentos = 0;

    System.out.println("¡Bienvenido al juego de adivinar el número!");
    System.out.println("He pensado en un número entre 1 y 100.");
    System.out.println("Intenta adivinarlo o ingresa 999 para abandonar el juego.");

    do {
        System.out.print("Ingresa tu intento: ");
        intento = scanner.nextInt();
        intentos++;

        if (intento == 999) {
            System.out.println("Has decidido abandonar el juego. ¡Hasta la próxima!");
            break;
        } else if (intento < numeroSecreto) {
            System.out.println("El número es mayor. Sigue intentando.");
        } else if (intento > numeroSecreto) {
            System.out.println("El número es menor. Sigue intentando.");
        } else {
            System.out.println("¡Felicidades! Has adivinado el número " + numeroSecreto + " en " + intentos + " intentos.");
        }} while (intento != numeroSecreto);
    }
//-------------------------------------------------------------------------------------------------------------------------------------
public void ej218() {
	Scanner scanner = new Scanner(System.in);
    int min = 1, max = 100, intento, intentos = 0;
    String respuesta;

    System.out.println("Piensa en un número entre 1 y 100.");
    System.out.println("Después de cada intento, indica si el número es:");
    System.out.println("'mayor' si tu número es mayor,");
    System.out.println("'menor' si tu número es menor,");
    System.out.println("'correcto' si el programa ha adivinado, o");
    
    do {
        intento = (min + max) / 2;
        intentos++;

        System.out.println("\nIntento " + intentos + ": ¿Es tu número el " + intento + "?");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.nextLine();

        if (respuesta.equals("mayor")) {
            min = intento + 1;
        } else if (respuesta.equals("menor")) {
            max = intento - 1;
        } 
         else if (!respuesta.equals("correcto")) {
            System.out.println("Por favor, responde 'mayor', 'menor', 'correcto' o 'abandonar'.");
            intentos--; // No contar este intento si la entrada no es válida
        }

    } while (!respuesta.equals("correcto"));

    if (respuesta.equals("correcto")) {
        System.out.println("¡Genial! He adivinado tu número " + intento + " en " + intentos + " intentos.");
    	}
	}
//-------------------------------------------------------------------------------------------------------------------
//ARRAYS---------------------ARRAYS---------------ARRAYS-----------------ARRAYS---------------------------ARRAYS--------
// ARRAYS-------------ARRAYS-----------------ARRAYS-------------------ARRAYS----------------------ARRAYS-------------------
public void ej220() {

	int[] arrayb= {10,20,30,40,50,60,70};
	int maximo= maximo(arrayb);
	System.out.println(maximo);
	int minimo= minimo(arrayb);
	System.out.println(minimo);
	double media= media(arrayb);
	System.out.println(media);
}
public static int maximo(int[] entero) {
	int max=entero[0];
	for(int i=0; i<entero.length;i++) {
		int auxiliar=entero[i];
		if(max<auxiliar) {
			max=auxiliar;
		}
	}	
return max;
}
public static int minimo(int[] entero2) {
	int min=entero2[0];
	for(int i=0; i<entero2.length;i++) {
		int auxiliar=entero2[i];
		if(min>auxiliar) {
			min=auxiliar;
	}
}
	return min;
}
public static double media(int[]entero3) {
	int total=0;
	for(int i=0;i<entero3.length;i++) {
		total= total+entero3[i];
		}
	double media=total/entero3.length;
	return media;	
}}
//------------------------------------------------------------

