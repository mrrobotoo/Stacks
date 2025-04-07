import java.util.Iterator;
import java.util.Stack;

public class Eje1 {
	public static void main(String[] args) {
		
		
		
		Stack<Character> palabra = new Stack<Character>();
		Stack<Character> palabraAux = new Stack<Character>();

		
		boolean esIsograma = false;
		palabra.push('o');
		palabra.push('o');
		palabra.push('l');
		palabra.push('a');
		
		Character character;
		
		while(!palabra.isEmpty()) {
			
		
			
		while(!esIsograma) {
			
			if (palabra.isEmpty()) {
				break;
			}
			
			palabraAux.push(palabra.pop());
			for (Iterator iterator = palabra.iterator(); iterator.hasNext();) {
				 character = (Character) iterator.next();
				 if (palabraAux.peek().equals(character)) {
					esIsograma = true;
					break;
				}
				
			}
			
		}
		System.out.println(esIsograma);

	}
	
	}
}
