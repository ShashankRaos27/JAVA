class AllConstructorsRunner
{
	public static void main(String[] args)
	{
		//internet
		Internet internet=new Internet();
		String s= internet.provider;
		System.out.println(s);
		//deodrant
		Deodrant deodrant=new Deodrant();
		String h=deodrant.brand;
		int value=deodrant.price;
		int quan=deodrant.quantity;
		String col=deodrant.color;
		System.out.println(h);
		System.out.println(value);
		System.out.println(quan);
		System.out.println(col);
		//powerbank
		PowerBank powerbank=new PowerBank();
		int cap=powerbank.capacity;
		String com=powerbank.company;
		int pr=powerbank.price;
		System.out.println(cap);
		System.out.println(com);
		System.out.println(pr);
		//wallet
		Wallet wallet=new Wallet();
		int p=wallet.price;
		String c=wallet.color;
		String cmd=wallet.countryMade;
		System.out.println(p);
		System.out.println(c);
		System.out.println(cmd);
		
	}
}