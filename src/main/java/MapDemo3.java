import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		
	List<Integer>numbers = Arrays.asList(5,9,12,7,4,15);
	List<Integer> mulNumbers = new ArrayList<Integer>();
		
		/*for(int newNumbers:numbers) {
			
			mulNumbers.add(newNumbers*3);
		}
		System.out.println(mulNumbers);*/
	
	//mulNumbers = numbers.stream().map(m->m*3).collect(Collectors.toList());
	//System.out.println(mulNumbers);
	numbers.stream().map(n->n*3).forEach(s->System.out.print(" "+s));
	
	}

}
