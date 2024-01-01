import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxJavaStreams {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 3,  9, 9, 5, 5, 3, 7, 2, 3};
		
		List<Integer> newArr = Arrays.asList(2, 4, 3,  9, 9, 5, 5, 3, 7, 2, 3);
		
		
		 // Before java8
		int num = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<num) {
				
			}
				
		}
		System.out.println(num);
		
		//finding the minimum number in the array 
		
		Optional<Integer> minNum = newArr.stream().min((val1, val2)->{return val1.compareTo(val2);});
		System.out.println(minNum.get());

		Optional<Integer> maxNum = newArr.stream().max((val1, val2)->{return val1.compareTo(val2);});
		System.out.println(maxNum.get());
	}

}
