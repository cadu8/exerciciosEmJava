package entities;

public class ImoportedProduct extends Product{
	private Double customFee;
	//construtores
	public ImoportedProduct() {
		super();
	}
	public ImoportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	//getters e setters
	public Double getCustomFee() {
		return customFee;
	}
	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	//metodos
	public double totalPrice() {
		return customFee + price;
	}
	@Override
	public String priceTag() {
		return   "Name: "
				+ getName()
				+ " $ "
				+ String.format("%.2f",totalPrice())
				+ String.format("( Customs fee: $ %.2f%n)", customFee);
	}
}
