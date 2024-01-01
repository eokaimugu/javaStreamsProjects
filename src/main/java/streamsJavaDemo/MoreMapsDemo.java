package streamsJavaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreMapsDemo {

	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("bus", "car", "train", "bike","flight", "aboboyaa","metra");
		List<String> upperVehicles = new ArrayList<String>();
		
		/*for(String name:vehicles)
		{
			System.out.println(name.length());
		}*/
		
		//vehicles.stream().map(v->v.length()).collect(Collectors.toList());
		//System.out.println(vehicles.stream().map(v->v.length()).collect(Collectors.toList()));
		
		vehicles.stream().map(v->v.length()).forEach(s->System.out.println(s));
		//vehicles.stream().map(v->v.length()).forEach((System.out::println));
		

	}

}
