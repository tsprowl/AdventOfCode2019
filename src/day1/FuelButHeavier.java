// Solution for Day 1, Part 2 of Advent of Code 2019


package day1;

import java.util.ArrayList;

public class FuelButHeavier {

	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		int totalFuel = 0;
			arrlist.add(128398);
			arrlist.add(118177);
			arrlist.add(139790);
			arrlist.add(84818);
			arrlist.add(75859);
			arrlist.add(139920);
			arrlist.add(90212);
			arrlist.add(74975);
			arrlist.add(120844);
			arrlist.add(85533);
			arrlist.add(77851);
			arrlist.add(127044);
			arrlist.add(128094);
			arrlist.add(77724);
			arrlist.add(81951);
			arrlist.add(115804);
			arrlist.add(60506);
			arrlist.add(65055);
			arrlist.add(52549);
			arrlist.add(108749);
			arrlist.add(92367);
			arrlist.add(53974);
			arrlist.add(52896);
			arrlist.add(66403);
			arrlist.add(93539);
			arrlist.add(118392);
			arrlist.add(78768);
			arrlist.add(128172);
			arrlist.add(85643);
			arrlist.add(109508);
			arrlist.add(104742);
			arrlist.add(71305);
			arrlist.add(84558);
			arrlist.add(68640);
			arrlist.add(58328);
			arrlist.add(58404);
			arrlist.add(70131);
			arrlist.add(73745);
			arrlist.add(149553);
			arrlist.add(57511);
			arrlist.add(119045);
			arrlist.add(90210);
			arrlist.add(129537);
			arrlist.add(114869);
			arrlist.add(113353);
			arrlist.add(114181);
			arrlist.add(130737);
			arrlist.add(134877);
			arrlist.add(90983);
			arrlist.add(84361);
			arrlist.add(62750);
			arrlist.add(114532);
			arrlist.add(139233);
			arrlist.add(139804);
			arrlist.add(130391);
			arrlist.add(144731);
			arrlist.add(84309);
			arrlist.add(137050);
			arrlist.add(79866);
			arrlist.add(121266);
			arrlist.add(93502);
			arrlist.add(132060);
			arrlist.add(109190);
			arrlist.add(61326);
			arrlist.add(58826);
			arrlist.add(129305);
			arrlist.add(141059);
			arrlist.add(143017);
			arrlist.add(56552);
			arrlist.add(102142);
			arrlist.add(110604);
			arrlist.add(136052);
			arrlist.add(93872);
			arrlist.add(71951);
			arrlist.add(72954);
			arrlist.add(70701);
			arrlist.add(137381);
			arrlist.add(76580);
			arrlist.add(62535);
			arrlist.add(62666);
			arrlist.add(126366);
			arrlist.add(66361);
			arrlist.add(109076);
			arrlist.add(126230);
			arrlist.add(73367);
			arrlist.add(94459);
			arrlist.add(126314);
			arrlist.add(133327);
			arrlist.add(143771);
			arrlist.add(50752);
			arrlist.add(75607);
			arrlist.add(117606);
			arrlist.add(142366);
			arrlist.add(59068);
			arrlist.add(75574);
			arrlist.add(149836);
			arrlist.add(57058);
			arrlist.add(77622);
			arrlist.add(83276);
			arrlist.add(82734);
			for (int i = 0; i < 100; i++) {
				int fuelForModel = 0;
				int result = arrlist.get(i);
				while (Math.floorDiv(result, 3) > 1 ) {
					result = Math.floorDiv(result, 3);
					result = result - 2;
					fuelForModel = result;
					totalFuel += fuelForModel;
				}				
			}
			System.out.println(totalFuel);
	}

}
