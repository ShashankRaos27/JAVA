class Gagan{
	public static String bro( int age){
		if(age>18)
			return "adult";
		else
			return "kids";
		
	}
	public static int dob(int age){
		if(age>20)
			return 20;
		else
			return 19;
	}
	public static void main(String[] values){
		String s=Gagan.bro(17);
		System.out.println(s);
		int a=Gagan.dob(21);
		System.out.println(a);
		String[] frndsList={"shashank", "suraj"};
		String d=Gagan.frnds(frndsList);
		System.out.println(d);
		
		}
	public static void frnds(String[] fd)
	{
		String s=fd[0];
		//return s;
	}
		
}
