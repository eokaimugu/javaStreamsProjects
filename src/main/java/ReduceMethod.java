import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "C", "1", "2", "3");

		Optional<String> reduced = list.stream().reduce((value, accumulatedValue) -> {
			return accumulatedValue + value;
		});
		System.out.println(reduced.get());

		// Using toArray method in java streams

		/*
		 * List<String> list = Arrays.asList("A", "B","C","1","2","3"); Object arr[] =
		 * list.stream().toArray(); System.out.println(arr.length); for(Object o:arr) {
		 * 
		 * System.out.println(o); }
		 */

	}

}
