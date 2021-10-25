package program;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class MaxAndMinOfGivenString {

	public static String highAndLow(String numbers) {

//		int max = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
//		int min = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
//		
//		return Integer.toString(max)+" "+Integer.toString(min);

		final IntSummaryStatistics summary = Arrays.stream(numbers.split(" "))
				.collect(Collectors.summarizingInt(Integer::parseInt));

		return Integer.toString(summary.getMax()) + " " + Integer.toString(summary.getMin());

	}

	public static void main(String[] args) {
		
		System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));

	}

}
