package streamsJavaDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewStreams {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("cup", null, "forest", "sky", "book", null, "theatre",null, "house");
		
	//List<String> result = words.stream().filter(s->s!=null).collect(Collectors.toList());
	//System.out.println(result);
	
	words.stream().filter(s->s!=null).forEach(p->System.out.println(p));

	}

}
