import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class FundamentosDeProgramacionApp {

	public static void main(String[] args) {
		
//		List<String> listaNombres = new ArrayList<>();
//		listaNombres.add("carlos");
//		listaNombres.add("ruhal");
//		listaNombres.add("linda");
//		listaNombres.add("mateo");
//		listaNombres.add("kevin");
//
//		
//		List<String> listaApellidosM = new ArrayList<>();
//		listaApellidosM.add("ruiz");
//		listaApellidosM.add("martinez");
//		listaApellidosM.add("juarez");
//		listaApellidosM.add("miranda");
//
//		List<String> listaApellidosP = new ArrayList<>();
//		listaApellidosP.add("perez");
//		listaApellidosP.add("lopez");
//		listaApellidosP.add("luna");
//		listaApellidosP.add("pacheco");
//		
//		int tamanioListaNombres= listaNombres.size();
//		int tamanioListaApellidosM= listaApellidosM.size();
//
//		int tamanioListaApellidosP= listaApellidosP.size();
//		
//		System.out.println(tamanioListaNombres);
//		System.out.println(tamanioListaApellidosM);
//		System.out.println(tamanioListaApellidosP);
//
//
//		
//		for (int i = 0; i < listaNombres.size(); i++) {
//			System.out.println(listaNombres.get(i));
//			System.out.println(listaApellidosM.get(i));
//			System.out.println(listaApellidosP.get(i));
//
//			
//		}
//		
		
//		7:00
//		7:10
//		
//		7:10:01 > retardo <7:30:00
//		3 o mas retardos impriman hola
//		>7:30:00 falta
		
		//["10:23:21","10:30:30","7:09:12",,]
		String hora1="10|:|2|3|:|2|1|";
	
		List<Integer> listaNumeros = new ArrayList<>(List.of(4,7,86655,6575));
		List<Integer> listaNumerosNuevos = null;
		for (int i = 0; i < listaNumeros.size(); i++) {
			
			int numeroActual= listaNumeros.get(i);
			listaNumerosNuevos = new ArrayList<>();
			
			
			for(;numeroActual != 1;) {
				//If Ternario
				numeroActual =(numeroActual%2 != 0) ? numeroActual*3+1:numeroActual/2;
				
				if(numeroActual%2 != 0) {//impar
					numeroActual = numeroActual*3+1;
				}else {
					numeroActual = numeroActual/2;
				}
				
				listaNumerosNuevos.add(numeroActual);

			}
			
			System.out.println(listaNumerosNuevos);
		}
	}
}
