package profitsharing;

import java.util.ArrayList;

//import Shopp.ShopHappenings;

public class Profitsharinginfo {

	ArrayList<ProfitSharing> profitgoodsList = new ArrayList<ProfitSharing>();

	public void addProfitgoods(ProfitSharing goods) {
		profitgoodsList.add(goods);

	}

	public void printProfitableGoodsInfo() {
		printTitles();

		printAvgProfitInfo();
	}

	public void printAvgProfitInfo() {
		double avgprofit;
		for (ProfitSharing goods : profitgoodsList) {
			System.out.printf("%-19s", goods.getName());
			double totalprofit = 0.0;
			double[] totalprofits = goods.gettotalprofit();

			for (int i = 0; i < goods.gettotalprofit().length; i++) {
				totalprofit += totalprofits[i];

			}
			avgprofit = totalprofit / goods.gettotalprofit().length;
			System.out.printf("%1$.2f", avgprofit);
			System.out.println();

		}
	}

	public void printTitles() {
		System.out.printf("%-15s %15s", "Name", "avgprofit\n");

		printCharMultipleTimes('_', 30);
	}

	public void printCharMultipleTimes(char chartoPrint, int howManyTimes) {
		for (int i = 0; i < howManyTimes; i++) {
			System.out.print(chartoPrint);

		}
		System.out.println();
	}

	public static void main(String[] args) {
		Profitsharinginfo info = new Profitsharinginfo();
		double goods1totalprofit[] = { 4.31, 4.12, 4.65 };
		ProfitSharing goods1 = new ProfitSharing("abcd", goods1totalprofit);
		info.addProfitgoods(goods1);

		double goods2totalprofit[] = { 3.12, 3.14, 3.34 };
		ProfitSharing goods2 = new ProfitSharing("efgh", goods2totalprofit);
		info.addProfitgoods(goods2);

		info.printProfitableGoodsInfo();

	}

	double[] listofProfit = { 2.31, 4.56, 6.23 };
	
	double averageProfit = getAvgProfit(listofProfit);

	public double getAvgProfit(double[] listofProfit) {
		double totalprofit = 0;
		for (int i = 0; i < listofProfit.length; i++) {
			totalprofit = totalprofit + listofProfit[i];
		}

		return totalprofit / listofProfit.length;

	}

}
