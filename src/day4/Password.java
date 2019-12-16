// Solution for Day 4, Part 1 of Advent of Code 2019


package day4;

import java.util.LinkedList;

public class Password {

	public static boolean hasAdjacent(Integer[] num) {
		if ((num[0] == num[1]) || (num[1] == num[2]) || (num[2] == num[3]) || (num[3] == num[4]) ||	 (num[4] == num[5])){
			return true;
		}
		else return false;
	}
	
	public static boolean hasIncrease(Integer[] num) {
		if ((num[0] <= num[1]) && (num[1] <= num[2]) && (num[2] <= num[3]) && (num[3] <= num[4]) && (num[4] <= num[5])) {
			return true;
		}
		else return false;
	}

	public static void main(String[] args) {

		int numCombos = 0;

		for (int i = 245182; i <= 790572; i++) {
			LinkedList<Integer> stack = new LinkedList<Integer>();
			int point = 0;
			
			int tempNum = i;
			
			Integer[] holder = new Integer[6];
			
			while (tempNum > 0) {
				stack.push( tempNum % 10 );
				tempNum = tempNum / 10;
			}
			
			while (!stack.isEmpty()) {
				
				holder[point] = stack.pop();
				point++;
			}
			
			if ((hasIncrease(holder) == true) && (hasAdjacent(holder) == true)) {
				numCombos++;
			}
			
		}
		
		System.out.println(numCombos);


	}

}
