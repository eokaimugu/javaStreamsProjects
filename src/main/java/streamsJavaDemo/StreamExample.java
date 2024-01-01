package streamsJavaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,15,18,9,20,22,23);
		List<Integer> evenNumbers = new ArrayList<Integer>();
		
		/*for(int values:numbers) {
			
			if(values%2==0) {
				evenNumbers.add(values);
			}
		}
		System.out.println(evenNumbers);*/
		
		//evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		//System.out.println(evenNumbers);
		
		numbers.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		//numbers.stream().filter(n->n%2==0).forEach(System.out::println);
		
	}

}
