package profitsharing;

public class ProfitSharing {
	private String name="";
	private double[] totalprofits= null;
	public String getName(){
		return name;
	}
	public double [] gettotalprofit(){
		return totalprofits;
	}
	public ProfitSharing(String name, double[] totalprofits) {
		super();
		this.name = name;
		this.totalprofits = totalprofits;
	}
	

}
