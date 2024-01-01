package flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsFlatMap {

	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("Scott", "David", "John");
		List<String> teamB = Arrays.asList("Mary", "Sasta", "Tom");
		List<String> teamC = Arrays.asList("Ken", "Jonny", "Kitty");

		List<List<String>> allPlayers = new ArrayList<List<String>>();

		allPlayers.add(teamA);
		allPlayers.add(teamB);
		allPlayers.add(teamC);

		// Before Java 8

		for (List<String> team : allPlayers) {
			for (String name : team) {

				System.out.println(name);
			}

		}
		
		//Using Java Stream
		
		List<String> playerName = allPlayers.stream().flatMap(players->players.stream()).collect(Collectors.toList());
		System.out.println(playerName);

	}

}
