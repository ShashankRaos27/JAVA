class CalendarRunner1{
	public static void main(String[] names){
		String personName1 = "Priya";
		String personName2 = "Diya";
		String personName3 = "Evaa";
		String personName4 = "Aravi";
		String personName5 = "Aanya";
		
		System.out.println("----------------personName1-------------------");
	// priya-10-Wendnesday
		System.out.println("Name is : " +personName1 + " Birth month is :" +Calendar1.getBirthMonth(personName1));
		System.out.println("Birthday is :" +Calendar1.getBirthDay(personName1));
	     
		System.out.println("----------------personName3-------------------");
		
	//evaa-8-Friday
	    System.out.println("Name is : " +personName3 + " Birth month is :" +Calendar1.getBirthMonth(personName3));
		System.out.println(" Birthday is :" +Calendar1.getBirthDay(personName3));
	   
	   System.out.println("----------------personName5-------------------");
	   
	//else-aanya,return-9,return "Sunday"
	    System.out.println("Name is : " +personName5 + " Birth month is :" +Calendar1.getBirthMonth(personName5));
		System.out.println("Birthday is :" +Calendar1.getBirthDay(personName5));
    }
}