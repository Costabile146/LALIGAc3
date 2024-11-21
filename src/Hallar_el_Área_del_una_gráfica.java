import java.util.Scanner;

public class Hallar_el_Área_del_una_gráfica {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.println("Introduce valor inicial");
double cinicial= sc.nextDouble();
System.out.println("Introduce valor final");
double cfinal= sc.nextDouble();
System.out.println("Introduce cantidad de saltos");
double csaltos= sc.nextDouble();
	 double inc= (cfinal-cinicial)/csaltos;
	 double totalarea= 0*0;
	 	for(double x= cinicial;x<cfinal;x= x+inc) {
	 		double area= inc*funcion(x);
	 			totalarea= totalarea + area;
	 	}
		System.out.println("area=" + totalarea);
	}
public static double funcion(double x) {
return x*x;
}
}