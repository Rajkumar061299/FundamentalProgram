package program;

import java.util.ArrayList;

public class NumberOFPeopleInBus {

	public static int countPassengers(ArrayList<int[]> stops) {
		int sum = 0;
		for (int[] arr : stops) 
			sum += (arr[0] - arr[1]);
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[] { 10, 0 });
		list.add(new int[] { 3, 5 });
		list.add(new int[] { 2, 5 });

		System.out.println(countPassengers(list));
	}

}
