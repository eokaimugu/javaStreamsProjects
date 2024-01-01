package streamsJavaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args)
	
	
	{
		List<String> vehicles = Arrays.asList("bus", "car", "train", "bike","flight", "aboboyaa");
		List<String> upperVehicles = new ArrayList<String>();
		
	/*System.out.println("Without using stream concept------------");	
		for(String name:vehicles) {
			upperVehicles.add(name.toUpperCase());
		}
		
		System.out.println(upperVehicles);*/
		
		//upperVehicles = vehicles.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
		
		
		vehicles.stream().map(v->v.toUpperCase()).forEach(v->System.out.print(" "+v));
		
		
		
	}

}
