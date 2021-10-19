class StringTester
{
	public static void main(String[] rao)
	{
		String name=new String("RCB");
		String location=new String("banglore");
		String captain=new String("virat");
		String coach=new String("dravid");
		String win=new String("ESCN");
		String onwer=new String("vijay  malya");
		String keeper=new String("bharath");
		String batsman=new String("abd");
		String bowler=new String("siraj");
		String fans=new String("loyal");
		boolean name1=location.startsWith("b");
		System.out.println(name1); //1
		String lc=name.toLowerCase();
		System.out.println(lc); //2
		String cap=captain.toUpperCase();
		System.out.println(cap); //3
		int w=win.length();
		System.out.println(w); //4
		boolean c=coach.isEmpty();
		System.out.println(c); //5
		boolean o=onwer.matches("vijay malya");
		System.out.println(o); //6
		String k=keeper.substring(5);
		System.out.println(k); //7
		int b=batsman.codePointAt(2);
		System.out.println(b); //8
		int b1=bowler.codePointBefore(2);
		System.out.println(b1); //9
		boolean f=fans.endsWith("l");
		System.out.println(f); //10
		String fa=fans.trim();  //11
		System.out.println(fa);
		
		boolean kee=keeper.contentEquals("bharath");
		System.out.println(kee); //12
		 String ww=win.replace('E','M');
		System.out.println(ww); // 13
		char sss=name.charAt(2);
		System.out.println(sss); //14
		boolean bat=batsman.contains("abd");
		System.out.println(bat); //15
	}
}