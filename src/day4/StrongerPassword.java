// Solution for Day 4, Part 2 of Advent of Code 2019


package day4;

import java.util.LinkedList;

public class StrongerPassword {
	public static boolean hasAdjacent(Integer[] num) {
		if ((num[0] == num[1]) || (num[1] == num[2]) || (num[2] == num[3]) || (num[3] == num[4]) ||	 (num[4] == num[5])){
			int zeroCount = 0;
			int oneCount = 0;
			int twoCount = 0;
			int threeCount = 0;
			int fourCount = 0;
			int fiveCount = 0;
			int sixCount = 0;
			int sevenCount = 0;
			int eightCount = 0;
			int nineCount = 0;
			
			for (int i = 0; i < 6; i++) {
				switch (num[i]) {
				case 0:
					zeroCount++;
					break;
				case 1:
					oneCount++;
					break;
				case 2:
					twoCount++;
					break;
				case 3:
					threeCount++;
					break;
				case 4:
					fourCount++;
					break;
				case 5:
					fiveCount++;
					break;
				case 6:
					sixCount++;
					break;
				case 7:
					sevenCount++;
					break;
				case 8:
					eightCount++;
					break;
				case 9:
					nineCount++;
					break;
				}
			}
			if ((zeroCount == 2) || (oneCount == 2) || (twoCount == 2) || (threeCount == 2) || (fourCount == 2) || (fiveCount == 2) || (sixCount == 2) || (sevenCount == 2) || (eightCount == 2) || (nineCount == 2)) {
				return true;
			}
			else return false;
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
