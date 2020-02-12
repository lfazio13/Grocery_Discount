import java.util.Scanner;

public class GroceryDiscount {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);



		double UserInput = 0;

		double Discount = 0;



		while(true)
		{
			System.out.println("Enter amount paid");
			if (scan.hasNextDouble())
			{
				UserInput = scan.nextDouble();
				if(UserInput == 0)
					break; 

				if(UserInput < 10)
					System.out.println("No discount" + UserInput);
				else if(UserInput >= 10 && UserInput < 60)
				{
					Discount = UserInput * .08;
					System.out.println("8% discount" + Discount);
				}


				else if(UserInput >= 60 && UserInput < 150)
				{
					Discount = UserInput * .10;
					System.out.println("10% discount" + Discount);

				}
				else if(UserInput >= 150 && UserInput < 210)
				{
					Discount = UserInput * .12;
					System.out.println("12% discount" + Discount);

				}
				else if(UserInput >= 210 && UserInput > 1000)
				{
					Discount = UserInput * .14;
					System.out.println("14% discount" + Discount);
				}	
				else if( UserInput >=1000) {
					System.out.println("Price too high, enter new amount");
				}
			}

			else {
				System.out.println(scan.next()+" Is not a valid number");
			}





		}


	}
}

