package program;

public class RemoveVowels {

	public static String disemvowel(String str) {

		return str.replaceAll("[aAeEiIoOuU]", "");
	}

	public static void main(String[] args) {

		System.out.println(disemvowel("Rajkumar"));
	}

}
