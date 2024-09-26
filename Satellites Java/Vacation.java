

public abstract class Vacation {
	
	private String destination;
	private double budget;
	
	public Vacation() { 
		this.destination = "";
		this.budget = 0.0;
		}

	
	public Vacation(String destination, double budget) {
		setDestination(destination);
		setBudget(budget);
		}
	
	//accessors and mutators setup!
	public String getDestination() {
		return destination;
		}
	
	public void setDestination(String destination) {
		this.destination = destination;
		}
	
	
	public double getBudget() {
		return budget;
		}
	
	//include illegalargument
	public void setBudget(double budget) {
		if(budget < 0)
			throw new IllegalArgumentException("Budget must be >= 0.0");
		this.budget = budget;
		}
	
	//moves to next line...confused on wording..use \n?
	@Override
	public String toString() {
		return("Destination: " + getDestination() + "; Budget: $" + String.format("%.2f", getBudget()));
		}
	
	@Override
	public boolean equals(Object o) { 
		if(o instanceof Vacation) {
			double b1 = getBudget();
			double b2 = ((Vacation) o).getBudget();
			double diff;
			if(b1 > b2)
				diff = (b1 - b2);
			else
				diff = (b2 - b1);
			return(getDestination().equalsIgnoreCase(((Vacation) o).getDestination()) &&
					(diff <= 0.0001));
			}
		return false;
		}

	public abstract double overBudget();
	
}