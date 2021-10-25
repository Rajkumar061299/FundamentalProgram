package program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckFirstWordIsCapital {

	public static String toJadenCase(String phrase) {
		if (phrase == null || phrase.equals(""))
			return null;

		/*
		 * return (Stream.of(phrase.split(" ")).map(word ->
		 * String.valueOf(word.charAt(0)).
		 * toUpperCase().concat(word.substring(1)).concat(" "))
		 * .collect(Collectors.joining())).trim();
		 */

		return Arrays.stream(phrase.split(" ")).map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
				.collect(Collectors.joining(" "));
	}

	public static void main(String[] args) {
		System.out.println(toJadenCase("hi was there"));
	}
}
