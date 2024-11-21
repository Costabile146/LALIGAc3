
public class apifjfaoijfaoifasz {

	private static void main(String[] args) {

		int[] enteros = {1,2,3,4,5,6,7,8,9};
		System.out.print("(");
		for(int i = 0; i < enteros.length; i++) {
			System.out.print(enteros[i]);
			if(i<enteros.length-1) {
				System.out.print(",");
			}
		}
		System.out.print(")");
	}
}