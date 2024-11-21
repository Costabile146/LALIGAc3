public class Arrays {
    public static void main(String[] args) throws Exception {
        
        int[] a= {10,20,30,40,50,60,70,80,90,100};
        int[] b= {1,-5,10,15,-20,21,2,5,3,8};
        int[][] c = {{1,2},{1,2},{1,2}};

        //PRIMERO
        System.out.println("Iniciando programa 1");
        pintaArray(a);
        
        /* 
        System.out.print ("{");
        for (int i=0; i<a.length;i++) {
            System.out.print (a[i]); 
            if (i<a.length-1) {
                System.out.print (","); 
            }
        }
        System.out.print ("}"); */
        System.out.println("");
        System.out.println("Finalizando programa 1");
        
        //SEGUNDO
        System.out.println("Iniciando programa 2");

        System.out.print ("{");
        for (int i=0; i<b.length;i++) {
            if (b[i]>20) {break;};
            System.out.print (b[i]);
             
            if (i<b.length-1) {
                System.out.print (","); 
            }
        }
        System.out.print ("}");
        System.out.println("");
        System.out.println("Finalizando programa 2");


        //TERCERO
        System.out.println("Iniciando programa 3");
        System.out.print ("{");
        for (int i=a.length-1; i>=0;i--) {
            System.out.print (a[i]); 
            if (i<=a.length-1) {
                System.out.print (","); 
            }
        }
        System.out.print ("}"); 
        System.out.println("");
        System.out.println("Finalizando programa 3");

        //CUARTO
        System.out.println("Iniciando programa 4");
            
                int sumaArray=0;
                for (int fila=0; fila<c.length;fila++) {
                    for (int columna=0; columna<c[0].length;columna++) {
                        sumaArray=(sumaArray+(c[fila][columna])); 
                    }
                }

        System.out.print ("La suma de todos los valores del array es: "+sumaArray);
        System.out.println("");
        System.out.println("Finalizando programa 4");


    }  //main


public static void pintaArray(int x []) {
    System.out.print ("{");
    for (int i=0; i<x.length;i++) {
        System.out.print (x[i]); 
        if (i<x.length-1) {
            System.out.print (","); 
        }
    }
    System.out.print ("}");
}

}  //class
