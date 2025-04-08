
public class Arreglos {

	public static void main(String[] args) {
			int[] arreglo1 = new  int[2];
			Integer[] arreglo2 = new  Integer[4];
			//arreglo1[0]=32;
			//arreglo1[1]=42;
			
			arreglo2[0]=52;
			arreglo2[1]=72;
			arreglo2[2]=62;
			arreglo2[3]=42;

			int[] arreglo3 = {3,5,5,14,123};
			for (int i : arreglo3) {
				System.out.println(i);
			}
			
			
			for (int i = 0; i < arreglo1.length; i++) {

				System.out.println(arreglo1[i]);
			}
			for (Integer x : arreglo2) {
				//arreglo2[0]=12;
				//System.out.println(x);

			}
			
			int i = 0;
			while(i<arreglo2.length) {
				System.out.println(arreglo2[i]);
				i+=1;
			}
			
			
			
			
			
			
	}

}
