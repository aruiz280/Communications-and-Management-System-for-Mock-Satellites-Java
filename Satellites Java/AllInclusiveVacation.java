

import java.util.Arrays;

public class AllInclusiveVacation extends Vacation {

	private String[] items;
	private double[] costs;

	public AllInclusiveVacation() {
		super();
		items = new String[10];
		costs = new double[10];
	}

	public AllInclusiveVacation(String destination, double budget, String[] items, double[] costs) {
		super(destination, budget);
		setItems(items);
		setCosts(costs);
	}

	//acessors and mutators
	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = new String[items.length];
		for(int i = 0; i < items.length; i++)
			this.items[i] = items[i];
	}

	public double[] getCosts() {
		return costs;
	}

	public void setCosts(double[] newCosts) {
		this.costs = new double[items.length];
		Arrays.fill(costs, 0.0);
		
		if(newCosts.length < costs.length) {
			for(int i = 0; i < newCosts.length; i++)
				this.costs[i] = newCosts[i];
		}
		else {
			for(int i = 0; i < costs.length; i++)
				this.costs[i] = newCosts[i];
		}
	}
	
	//toString return destination and budget using super()
	@Override
	public String toString() {
		String itemDetails = "";
		for(int i = 0; i < items.length; i++) {
			if(i == items.length - 1)
				itemDetails += items[i] + ": $" + String.format("%.2f", costs[i]);
			else
				itemDetails += items[i] + ": $" + String.format("%.2f", costs[i]) + "\n";
		}

			return(super.toString() + "\n"
					+ itemDetails);
	}

	private boolean itemsArrayEquals(String[] itemsArr) {
		boolean isEqual = true;
		for(int i = 0; i < this.items.length; i++) {
			if(!getItems()[i].equalsIgnoreCase(itemsArr[i])) {
				isEqual = false;
				break;
			}
		}
		return isEqual;
	}

	private boolean costsArrayEquals(double[] costsArr) {
		boolean isEqual = true;
		for(int i = 0; i < this.costs.length; i++) {
			double c1 = getCosts()[i];
			double c2 = costsArr[i];
			double diff;
			
			if(c1 > c2)
				diff = (c1 - c2);
			else
				diff = (c2 - c1);
			if(diff > 0.0001) {
				isEqual = false;
				break;
			}
		}
		return isEqual;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof AllInclusiveVacation) {
			return(super.equals(o)
					&& itemsArrayEquals(((AllInclusiveVacation) o).getItems())
					&& costsArrayEquals(((AllInclusiveVacation) o).getCosts()));
		}
		return false;
	}

	@Override
	public double overBudget() {
		double totalCost = 0.0;
		for(int i = 0; i < getCosts().length; i++)
			totalCost += getCosts()[i];
		double budget = getBudget();
		return(budget - totalCost);
	}
}