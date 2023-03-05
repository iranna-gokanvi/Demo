import java.util.*;
public class ATM1{
	public static void main(String[] args) {
		ATM11 a=new ATM11();
		a.transaction();
	}
}
 class ATM11 {
	public void transaction() {
		Scanner sc=new Scanner(System.in);
		System.out.println("transaction started");
		System.out.println("enter your pin");
		try{
			int n=sc.nextInt();
			System.out.println("correct pin");
		}
		catch(Exception e){
			System.out.println("invalid pin,try again!");
			try{
				Scanner s=new Scanner(System.in);
				System.out.println("enter your pin");
				int nn=s.nextInt();
				System.out.println("correct pin");
			}
			catch(Exception ee){
				System.out.println("invalid pin,it is last chance");
				try{
					Scanner s1=new Scanner(System.in);
					System.out.println("enter your pin");
					int n1=s1.nextInt();
					System.out.println("correct pin");
				}
				catch(Exception eee){
					
					System.out.println("invalid pin.your account is blocked for 24 hours");
				}
			}
			
		}
		System.out.println("transaction ended");
		
		
	}

}
