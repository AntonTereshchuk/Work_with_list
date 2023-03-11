package task;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = new ArrayList<>();
		workWithList(listOfIntegers);

	}
	
	public static void workWithList(List<Integer> listOfIntegers) {
		
		for (int i = 0; i < 10; i++) {
			listOfIntegers.add((int) (Math.random() * 100));
		}
		
		listOfIntegers.remove(0);
		listOfIntegers.remove(0);
		listOfIntegers.remove(listOfIntegers.size()-1);
		
		System.out.println("List of integers: " + listOfIntegers.toString());
	}

}
