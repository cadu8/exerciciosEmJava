package entities;

public class Product {
	private String name;
	protected Double price;
	//construtores
	public Product() {
	}
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	//getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	//metodos
	public String priceTag() {
		return    getName()
				+ " $ "
				+ String.format("%.2f%n",getPrice());
	}
	
}
