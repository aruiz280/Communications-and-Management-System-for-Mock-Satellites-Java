

public class VacationTest {


	public static void main(String[] args) {
	PieceMealVacation pieceMealVac1 = new PieceMealVacation("Orlando", 1000.00 , "Disney", 4, 989.49);
	System.out.println("The first piece meal vacation is:\n" + pieceMealVac1);
	
	if(pieceMealVac1.overBudget() > 0)
		System.out.println("It is under budget by $" + String.format("%.2f", pieceMealVac1.overBudget()));
	else
		System.out.println("It is over budget by $" + String.format("%.2f", (pieceMealVac1.overBudget() * -1)));

	PieceMealVacation pieceMealVac2 = new PieceMealVacation("Bahamas", 2000.00, "ClubMed", 4, 2049.99);
	System.out.println("The second piece meal vacation is:\n" + pieceMealVac2);

		if(pieceMealVac2.overBudget() > 0)
			System.out.println("It is under budget by $" + String.format("%.2f", pieceMealVac2.overBudget()));
		else
			System.out.println("It is over budget by $" + String.format("%.2f", (pieceMealVac2.overBudget() * -1)));

		if(pieceMealVac1.equals(pieceMealVac2))
			System.out.println("aiv1 and aiv2 are equal");
		else
			System.out.println("aiv1 and aiv2 are not equal");

		pieceMealVac2.setBrand(pieceMealVac1.getBrand());
		pieceMealVac2.setPrice(pieceMealVac1.getPrice());

		//cannot figure out why "aiv and aiv2 are not equal is printed twice. error unknown!!	
		if(pieceMealVac1.equals(pieceMealVac2))
				System.out.println("aiv1 and aiv2 are equal");
			
		else
				System.out.println("aiv1 and aiv2 are not equal");

			pieceMealVac2.setDestination(pieceMealVac1.getDestination());
			pieceMealVac2.setBudget(pieceMealVac1.getBudget());

				
			if(pieceMealVac1.equals(pieceMealVac2))
					System.out.println("aiv1 and aiv2 are now equal");
				
			else
					System.out.println("aiv1 and aiv2 are not equal");

				String[] itemsList1 = { "hotel", "meals", "airfare", "windsurfing" };
				double[] costsList1 = { 750.00, 250.00, 400.00 };
				AllInclusiveVacation allIncVac1 = new AllInclusiveVacation("Miami", 1500.00, itemsList1, costsList1);
				System.out.println("\n" + allIncVac1);

					if(allIncVac1.overBudget() > 0)
						System.out.println("It is under budget by $" + String.format("%.2f", allIncVac1.overBudget()));
					else
						System.out.println("It is over budget by $" + String.format("%.2f", (allIncVac1.overBudget() * -1)));

					String[] itemsList2 = { "hotel", "meals", "airfare", "windsurfing" };
					double[] costsList2 = { 750.00, 250.00, 400.00, 120.00, 200.00 };
					AllInclusiveVacation allIncVac2 = new AllInclusiveVacation("Miami", 1500.00, itemsList2, costsList2);
					System.out.println("\n" + allIncVac2);
					
					if(allIncVac2.overBudget() > 0)
						System.out.println("It is under budget by $" + String.format("%.2f", allIncVac2.overBudget()));
					else
						System.out.println("It is over budget by $" + String.format("%.2f", (allIncVac2.overBudget() * -1)));

					if(allIncVac1.equals(allIncVac2))
						System.out.println("pmv1 and pmv2 are equal");
					else
						System.out.println("pmv1 and pmv2 are not equal");

					allIncVac2.setItems(itemsList1);
					allIncVac2.setCosts(costsList1);
					
					if(allIncVac1.equals(allIncVac2))
						System.out.println("pmv1 and pmv2 are now equal");
					else
						System.out.println("pmv1 and pmv2 are not equal");
	}
}