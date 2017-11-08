package creationmethods;

public class ShopHappenings {

	private double litersofOil;
	private int bagsofriceinstock;
	private int customersvisited;
	private int totalbusinessoftheday;
	private int rejectedgoods;
	private int totalprofitoftheday;
	private int numofdaysshopopened;
	private int avgofoneweeksprofit;

	/*
	 * public ShopHappenings(double litersofOil, int bagsofriceinstock) {
	 * this.litersofOil=litersofOil; this.bagsofriceinstock=bagsofriceinstock;
	 * 
	 * }
	 * 
	 * public ShopHappenings(int rejectedgoods){
	 * this.rejectedgoods=rejectedgoods;
	 * 
	 * }
	 * 
	 * public ShopHappenings(int totalbusinessoftheday){
	 * 
	 * }
	 */

	public ShopHappenings(double litersofOil, int bagsofriceinstock, int customersvisited, int totalbusinessoftheday,
			int rejectedgoods, int totalprofitoftheday, int numofdaysshopopened, int avgofoneweeksprofit) {
		super();
		this.litersofOil = litersofOil;
		this.bagsofriceinstock = bagsofriceinstock;
		this.customersvisited = customersvisited;
		this.totalbusinessoftheday = totalbusinessoftheday;
		this.rejectedgoods = rejectedgoods;
		this.totalprofitoftheday = totalprofitoftheday;
		this.numofdaysshopopened = numofdaysshopopened;
		this.avgofoneweeksprofit = avgofoneweeksprofit;
	}
	
    public int getTotalBusinessOftheWeek(){
    return totalbusinessoftheday*numofdaysshopopened;
    }

	public static ShopHappenings createBusinessChart(int totalbusinessoftheday, int numofdaysshopopened) {
		return new ShopHappenings(0, 0, 0, totalbusinessoftheday, 0, 0, numofdaysshopopened, 0);
	}
	
	public static void main(String[] args) {
		ShopHappenings januarybusiness= ShopHappenings.createBusinessChart(300, 5);
		System.out.println("business of jan "+januarybusiness.getTotalBusinessOftheWeek());
	}

}
