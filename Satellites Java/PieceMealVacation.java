
public class PieceMealVacation extends Vacation {
	
	private String brand;
	private int rating;
	private double price;
	
	public PieceMealVacation() {
		
		super();
		this.brand = "";
		this.rating = 1;
		this.price = 0.0;
	}

		//constructor with 5 instance var
	public PieceMealVacation(String destination, double budget, String brand, int rating, double price) {
		super(destination, budget);
		setBrand(brand);
		setRating(rating);
		setPrice(price);
	}

	//accessors and mutators !
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRating() {
		return rating;
	}

		//setting ratings with mutators
	public void setRating(int rating) {
		if(rating < 0 || rating > 5)
			throw new IllegalArgumentException( "Rating must be > 0 and <= 5");
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0)
			throw new IllegalArgumentException( "Price must be >= 0.0");
		this.price = price;
	}

	@Override
	public String toString() {
		return(super.toString() + "\n"
				+ "Brand: " + getBrand() + "; Rating: " + getRating() + "; Price: $" + String.format("%.2f", getPrice()));
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof PieceMealVacation) {
			double p1 = getPrice();
			double p2 = ((PieceMealVacation) o).getPrice();
			double diff;
			
			if(p1 > p2)
				diff = (p1 - p2);
			else
				diff = (p2 - p1);
			return(super.equals(o) && getBrand().equalsIgnoreCase(((PieceMealVacation) o).getBrand())
					&& getRating() == ((PieceMealVacation) o).getRating()
					&& diff <= 0.0001);
			}
			return false;
	}

	@Override
	public double overBudget() {
		double budget = getBudget();
		double price = getPrice();
		return(budget - price);
				
	}
}