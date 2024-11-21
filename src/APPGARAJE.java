
public class APPGARAJE {

	public APPGARAJE(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Coche c1 = new Coche();
			Coche c2 = new Coche("GZS.0001",2400,"Rojo",true);
			Coche c3 = new Coche("AWS-0007",2500,"Verde",true,"Ferrari");
			
			c1.color= "amarillo";
			c1.matricula= "ABC-3412";
			c1.setMotor(1800);
			c1.setMarca("Lamgorgini");
			
			String smatricula = c2.matricula;
			int imotor =c2.getMotor();
			/*
			imprimeFicha(c1);
			imprimeFicha(c2);
			*/
			c1.FichaTecnica();
			c2.FichaTecnica();
			
			
			System.out.println("Aplicación terminada");
	}
		public static void imprimeFicha(Coche car) {

		System.out.println("FICHA AUTOMÓVIL");
		System.out.println("---------------");
		System.out.println("Matrícula :" + car.matricula);
		System.out.println("Motor : " + car.getMotor());
		System.out.println("Color : " + car.color);
		System.out.println("Tiene Radio : " + car.getRadio());
		}
}
		