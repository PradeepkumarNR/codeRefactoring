package creationmethods;

public class ShopHappenings2 {

	private String goodsname = "";
	private String catogory = "";
	private double currentPrice = 0.0;
	private int numofbagsinStock = 0;
	private double stockearnedvalue=0.0;

	public String getGoodsname() {
		return goodsname;
	}

	public String getCatogory() {
		return catogory;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public int getNumofbagsinStock() {
		return numofbagsinStock;
	}

	public ShopHappenings2(String goodsname, String catogory, double currentPrice, int numofbagsinStock, double stockearnedvalue) {
		super();
		this.goodsname = goodsname;
		this.catogory = catogory;
		this.currentPrice = currentPrice;
		this.numofbagsinStock = numofbagsinStock;
		this.stockearnedvalue=stockearnedvalue;
	}
	public ShopHappenings2(String goodsname, String catogory, double currentPrice, int numofbagsinStock) {
		//super();
		this(goodsname, catogory, currentPrice,numofbagsinStock, 0.0);
		
	}
	public ShopHappenings2(String goodsname, String catogory, int numofbagsinStock) {
		//super();
		this(goodsname, catogory, 0.0,numofbagsinStock, 0.0);
		
	}
	
	public static void main(String[] args) {
		ShopHappenings2 one= new ShopHappenings2("one", "abcd", 3);
		System.out.println(one.getCatogory());
		System.out.println(one.getGoodsname());
		
	}
	

}
