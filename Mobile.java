class Mobile {
    public static void main(String []a){
        System.out.println("started main method");
	String model = "12";
	int memory = 128;

	if (model == "12pro"){
	   System.out.println("apple 12pro");
	   if (memory == 64){
	       System.out.println("apple 12pro 64gb");
           }
 	    else if (memory == 128){
	   System.out.println("apple 12pro 128gb");
	   }
	}
          else if (model == "12"){
	   System.out.println("apple 12");
	   if (memory== 64){
		System.out.println("apple 12 64gb");
	}
	    else if (memory == 128){
	     System.out.println("apple 12 128gb");
		}
	}
    }
}