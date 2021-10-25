package program;

public class ConvertFraction {

	public static void main(String[] args) {
		System.out.println(convertFrac(new long[][] { { 1, 2 }, { 1, 3 }, { 10, 40 } }));

	}

	public static long findGCD(long num1, long num2) {

		long min = (num1 < num2) ? num1 : num2;

		for (long i = min; i >= 0; i--) {
			if ((num1 % i == 0) && (num2 % i == 0))
				return i;
		}

		return 1;
	}

	public static String convertFrac(long[][] lst) {

		if (lst.length == 0)
			return "";

		long[] arr = new long[lst.length];
		long gcd = 0;
		for (int i = 0; i < lst.length; i++) {

			gcd = findGCD(lst[i][0], lst[i][1]);
			lst[i][0] /= gcd;
			lst[i][1] /= gcd;
			arr[i] = lst[i][1];
		}

		long lcm = LcmOfArray(arr, 0);

		for (int i = 0; i < lst.length; i++) {
			lst[i][0] *= (lcm / lst[i][1]);
			lst[i][1] = lcm;
		}

		String result = "";
		for (int i = 0; i < lst.length; i++) {
			result += "(" + lst[i][0] + "," + lst[i][1] + ")";

		}

		return result;
	}

	static long LcmOfArray(long[] arr, int idx) {

		if (idx == arr.length - 1) {
			return arr[idx];
		}
		long a = arr[idx];
		long b = LcmOfArray(arr, idx + 1);
		return (a * b / findGCD(a, b)); //
	}

}
