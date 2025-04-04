import java.util.Iterator;
import java.util.Stack;



/*
 *  push() para meter datos en la pila
	pop() elimina el ultimo valor de la pila  y retorna el mismo
	peek( ) Returns the top element of the stack.
	top() Returns the top element of the stack.
	isEmpty() returns true if stack is empty else false.
	isFull() returns true if the stack is full else false
 */

public class FundamentosDeProgramacionApp {
	/*
	 * Este es el metodo encargado cuando se compila
	 * java.
	 * */
	public static void main(String[] args) {
		Stack<Integer> pila1  = new Stack<>();
		Stack<Integer> pilaAUX  = new Stack<>();
	
	pila1.push(4);
	pila1.push(3);
	pila1.push(2);
	pila1.push(1);

		
//		Integer elemento;
//		do {
//			elemento = pila1.pop();
//			pilaAUX.push(elemento);
		//	if(elemento %2 == 0) {
		//	pilaAUX.push(0);
		//	
		//}
//			
//		}while(!pila1.empty());
		
		//Segundo forma
		
//		Integer elemento;
//		while(!pila1.empty()) {
//			elemento = pila1.pop();
//			pilaAUX.push(elemento);
//			if(elemento %2 == 0) {
//				pilaAUX.push(0);
//				
//			}
//		};
		
		//tercera forma
		Integer elemento;
		Iterator iterator = pila1.iterator();
		for (; iterator.hasNext();) {
			 elemento = pila1.pop();
			pilaAUX.push(elemento);
			if(elemento %2 == 0) {
				pilaAUX.push(0);
				
			}
			
		}
		
		System.out.println(pila1);
		System.out.println(pilaAUX);	
			
	
		
		
//		for (Integer elemento : pila1) {
//			//valorTopAnterior =pila1.pop();
//			
//			pilaAUX.push(elemento);
//			
//			if(elemento %2 == 0) {
//				pilaAUX.push(0);
//				
//			}
//			System.out.println(pilaAUX);
//			
//		}
//		pila1.clear();
//		System.out.println(pila1);
//		
//		for (Integer elemento : pilaAUX) {
//			pila1.push(elemento);
//		
//			
//		}
//		pilaAUX.clear();
//		System.out.println(pilaAUX);
//		System.out.println(pila1);
//		
//		
//	}
	
		
	}



		

	}