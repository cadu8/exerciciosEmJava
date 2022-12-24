package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	//construtores
	public Employee() {
	}
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	//getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	//metodos
	public double payment() {
		return hours*valuePerHour;
	}
	@Override
	public String toString() {
		return    name + "- R$ " 
				+ String.format("%.2f%n", payment() );
	}
	
}
