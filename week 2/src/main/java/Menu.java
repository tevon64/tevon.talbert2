import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int lo =  0;
		 
		

		for (int i = 0; i < 5; i++)
		{ 		   
			System.out.println("Press 1 for a random number");
			System.out.println("Press 2 to reverse a chose word");
			System.out.println("Press 3 for kill this love");

		lo = sc.nextInt();
			if(lo == 1)
			{ 
				System.out.println("You chose Random method");
				double number = Math.random();
				System.out.println(number);
			}
			if(lo == 2)
			{ String input = new String("");
			input = sc.nextLine();
			StringBuilder xy = new StringBuilder(input);
			System.out.println(xy.reverse());
			
			System.out.println("wait 2");
				
			}
			
			if (lo == 3)
			{
				
				System.out.println("See ya later");
				break;
			}
		}
		
	
		// TODO Auto-generated method stub

	}
public int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
}
}

