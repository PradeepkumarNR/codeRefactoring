package understandableVariables;

public class Product {

	private String name = "";

	private double price = 0.0;
	private double shippingcost = 0.0;
	private int quantity = 0;

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getShippingcost() {
		return shippingcost;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product(String name, double price, double shippingcost, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.shippingcost = shippingcost;
		this.quantity = quantity;
	}

	public double getTotalCost() {
		double quantityDiscount = 0.0;
		if ((quantity > 50) || (quantity * price > 500)) {
			quantityDiscount = .10;
		}else if((quantity>25)|| (quantity*price>100)){
			quantityDiscount=.07;
		}else if((quantity>=10)|| (quantity*price>50)){
			quantityDiscount=.05;
		}
		double discount= ((quantity-1)* quantityDiscount*price);
		return totalcost;
		
		
	}

}
