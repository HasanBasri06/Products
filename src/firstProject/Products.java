package firstProject;


public class Products {
	
	private String name;
	private double price;
	private String details;
	
	public void ProductName(String name, double price, String details) {
		
		this.name 	 = name;
		this.price 	 = price;
		this.details = details;

		
		System.out.println("Ýsim : " + this.name + " Fiyat : " + this.price + " Detay : " + this.details);
	
		
	}
	

}
