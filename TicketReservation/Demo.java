import java.util.Scanner;
public class Demo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome our reservation service .....");
		System.out.print("Input Your Name : ");
		String name = input.nextLine();
		
		System.out.print("Input Your Email Id  : ");
		String email = input.nextLine();
		
		System.out.print("Input Your Phone number : ");
		int number  = input.nextInt();
		
		System.out.print("Input Your Pickup Location  : ");
		String location = input.nextLine();
		
		System.out.print("Input Your Destination : ");
		String destination  = input.nextLine();
		
		System.out.print("Input Your Pickup Date : ");
		String newDate = input.nextLine();
		
		System.out.print("Input  Pickup Hour : ");
		int hour = input.nextInt();
		
		
		System.out.print("Input  Pickup Minute : ");
		int minetue = input.nextInt();
		
		System.out.print("Input  AM/PM : ");
		String am_pm = input.nextLine();
		
		
		System.out.println("");
		System.out.print("Please Type  1. for booking confirm : ");
		int confirm = input.nextInt();
		
		if(confirm==1){
			System.out.println("");
			System.out.println("Your Name is : "+name);
			System.out.println("Your email is : "+email);
			System.out.println("Your number is : "+number);
			System.out.println("Your Pickup Location is : "+location);
			System.out.println("Your Destination is : "+destination);
			System.out.println("Your Pickup Date is : "+newDate);
			System.out.println("Your Pickup time : "+hour+":"+minetue+""+am_pm);
			System.out.println("Your ticket reservation is successful.\n Thank You for booking ticket.");
			
		}else{
			
			System.out.println("Thank You visit my site.");
		}
		
	}
}