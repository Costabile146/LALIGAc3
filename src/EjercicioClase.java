public class EjercicioClase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a = {10,20,30,40,50,60,70,80,90,100};
int [] b = {1,-5,10,15,-20,21,2,5,3,8};
int [][] c = {{1,2},{1,2},{1,2}};
	pintArray(b);
	System.out.print("{");
		for (int i=0; 1<a.length;i++) {
			System.out.print(a[i]);
			if(1<a.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("};");
	}
	public static void pintArray(int c[]) {
		
		System.out.print("{");
		for (int i=0; i<c.length;i++) {
			System.out.print(c[i]);
			if(i<c.length-1) 
				System.out.print(",");
			System.out.print("}");
			}
		}
	
}
	
