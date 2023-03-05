
public class Pattern {

	public static void main(String[] args) {
	/*for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}*/
     int k=0;
     for(int i=1;i<=5;i++){
    	 for(int j=1;j<=i;j++){
    		 if(i!=1 &&  j!=5 ){
    		 System.out.print(++k+"*");
    		  
    		 
    		 }
    		 else{
    			 System.out.print(++k);
    		 }
    	 }
    	 System.out.println();
     }
	}

}
