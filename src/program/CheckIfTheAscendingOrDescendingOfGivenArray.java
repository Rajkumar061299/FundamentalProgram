package program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CheckIfTheAscendingOrDescendingOfGivenArray {

	public static void sort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static String isSortedAndHow(int[] array) {
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

		if (list.equals(list.stream().sorted().collect(Collectors.toList())))
			return "yes, ascending";

		if (list.equals(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())))
			return "yes, descending";

		return "no";
	}

	public static String replaceAllWord(String s) {

		System.out.println(s.replaceAll("(.*)to(.*)", "Welcome"));

		return s.replaceAll("Full(.*)", "RAJKUMAR");

	}

	public static void main(String[] args) {
		sort(new int[] { 2, 57, 40, 66, 22, 11 });

		System.out.println(isSortedAndHow(new int[] { 1234, 123, 12, 1 }));

		System.out.println(replaceAllWord("Welcome to Full Creative"));

	}
}
