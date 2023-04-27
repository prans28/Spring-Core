package springlifecycle;

public class samosa {
	private double price;
	private String name;
	public samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("i am setting name ");
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("i am setting price");
		this.price = price;
	}
	@Override
	public String toString() {
		return "samosa [price=" + price + ", name=" + name + "]";
	} 
	
	public void init() {
		System.out.println("this is init ");
	}
	public void destroy() {
		System.out.println("this is destroy ");
	}

}
