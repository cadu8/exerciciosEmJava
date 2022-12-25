package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	//construtorews
	public UsedProduct() {
		super();
	}
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	//getters e setters
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	//metodos
	@Override
	public String priceTag() {
		return    getName()
				+ " (used) "
				+ String.format("$ %.2f ",(getPrice()))
				+ " (Manufacture date: "
				+ sdf.format(manufactureDate);
	
	}
}
