package model;

public class Product {
	private int id;
	private String title;
	private String brand;
	private int price;

	public Product(int id, String title, String brand, int price) {
		super();
		this.id = id;
		this.title = title;
		this.brand = brand;
		this.price = price;
	}

	public Product(String title, String brand, int price) {
		super();
		this.title = title;
		this.brand = brand;
		this.price = price;
	}

	public Product() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
