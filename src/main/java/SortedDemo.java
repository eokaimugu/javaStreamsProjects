import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedDemo {

	public static void main(String[] args) {
		
		/*List<Integer> rawList = Arrays.asList(3,7,5,2,3,9,0,1,8,10,7);
		rawList.stream().sorted().forEach(s->System.out.println(s));//sorts in ascending order*/
		
		List<Integer> rawList = Arrays.asList(3,7,5,2,3,9,0,1,8,10,7);
		rawList.stream().sorted(Comparator.reverseOrder()).forEach(r->System.out.println(r));
		
		List<String>names = Arrays.asList("John", "Mary","Sasta","Tanko", "Zandu");
		names.stream().sorted().forEach(p->System.out.print(" "+p));
		System.out.println(" ");
		
		names.stream().sorted(Comparator.reverseOrder()).forEach(r->System.out.print(" "+r));
	}

}
