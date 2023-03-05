import java.util.*;
public class Test {

	public static void main(String[] args) throws InvalidPinException {
      ATM a=new ATM();
      a.transaction();
	}

}

class ATM{
	public void transaction() throws InvalidPinException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your pin");
		int p=sc.nextInt();
		int pin=2506;
		if(p==2506){
			System.out.println("correct pin");
		}
		else{
			System.out.println("invalid pin");
			InvalidPinException ie=new InvalidPinException();
			throw ie;
			
		}

	}
}

class InvalidPinException extends Exception{
	public String getMessage(){
		return "invalid pin exception occured";
	}
}