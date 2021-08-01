import java.util.*;

public class Test {
	public static void main(String args[]) {
		ArrayList<Car> carList = new ArrayList<Car>();
		Scanner input = new Scanner(System.in);

		System.out.println("Do you want to create a car?");
		String answer = input.nextLine();
		while(answer.toLowerCase().equals("yes")) {
			System.out.println("Give a car:");
			String model = input.nextLine();
			System.out.println("Give a price:");
			double price = input.nextDouble();
			System.out.println("Give a year:");
			int year = input.nextInt();
			Car car = new Car(model, price, year);

			carList.add(car);

			System.out.println("Do you want to create another car?");
			input.nextLine();
			answer = input.nextLine();
			
		} 
		
		for(int i = 0; i < carList.size(); i++) {
			System.out.println(carList.get(i));
			System.out.println();
		}
		
	}
}
