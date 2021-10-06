class EmailRunner
{
	public static void main(String[] values)
	{
		boolean fire=false;
		Email.sendMessage(fire);
		String ms="to day is monday";
		boolean flag=Email.recieveMessage(ms);
		System.out.println(fire==flag);
	}
}