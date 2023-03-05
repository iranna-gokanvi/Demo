
public class SllepPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("typing started");
		for(int i=1;i<=10;i++){
			System.out.println("type code..");
			try{
				Thread.sleep(1000);
			}
           catch(Exception e){
        	   e.printStackTrace();
           }
		}
		System.out.println("syntax will be checking");
		for(int i=1;i<=10;i++){
			System.out.println("syntax checked");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
