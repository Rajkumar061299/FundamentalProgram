package program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheLastName {

	/*
	 * Input : Anna:Wahl;Grace:Gates;James:Russell;Elizabeth:Rudd;Victoria:STAN;Jacob:Wahl;
	 * Alex:Wahl;Antony:Gates;Alissa:Meta;Megan:Bell;Amandy:Stan;Anna:Steve 
	 * output : (BELL,
	 * MEGAN)(GATES, ANTONY)(GATES, GRACE)(META, ALISSA)(RUDD, ELIZABETH)(RUSSELL,
	 * JAMES)(STAN, AMANDY)(STAN, VICTORIA)(STEVE, ANNA)(WAHL, ALEX)(WAHL,
	 * ANNA)(WAHL, JACOB)
	 */

	public static String meetingOne(String s) {

		return Arrays.stream(s.toUpperCase().split(";")).map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
				.sorted().collect(Collectors.joining(""));
	}

	public static String meeting(String s) {

		String result = "";

		s = s.toUpperCase().replaceAll("[:]", " ");
		List<String> list = Arrays.asList(s.split(";"));

		for (int i = 0; i < list.size(); i++) {
			list.set(i, ((list.get(i).substring(list.get(i).indexOf(' '))).trim() + " "
					+ list.get(i).substring(0, (list.get(i).indexOf(' ')) + 1).trim()));

		}

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			result += "(" + list.get(i).substring(0, (list.get(i).indexOf(' ')) + 1).trim() + ", "
					+ (list.get(i).substring(list.get(i).indexOf(' '))).trim() + ")";
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(meeting(
				"Anna:Wahl;Grace:Gates;James:Russell;Elizabeth:Rudd;Victoria:STAN;Jacob:Wahl;Alex:Wahl;Antony:Gates;Alissa:Meta;Megan:Bell;Amandy:Stan;Anna:Steve"));
	}
}
