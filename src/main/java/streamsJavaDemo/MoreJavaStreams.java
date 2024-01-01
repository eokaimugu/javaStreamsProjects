package streamsJavaDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreJavaStreams {

	public static void main(String[] args) {
		
		// Print unique numbers in an array using java streams
		
		//int [] numbers = {17, 20 ,17, 2,2,5,7,7,4,4,3,5};
		
		List<Integer> values = Arrays.asList(17, 20 ,17, 2,2,5,7,7,4,4,3,5);
		
	 values.stream().distinct().forEach(s->System.out.println(s));
	 List<Integer> list = values.stream().distinct().sorted().collect(Collectors.toList());
	 
		System.out.println(list);
		
		

	}

}

