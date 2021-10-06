class Email{
	public static void sendMessage(boolean pointArg)
	{
		System.out.println("invoked message :");
		boolean point=pointArg;
		if(point)
		{
			System.out.println("inside point :");
			
		}
		System.out.println("after if....");
		}
		public static boolean recieveMessage(String msg)
		{
			if(msg==null)
			{
				System.out.println("msg is not pointing :");
				return false;
				}
				System.out.println("msg is pointing to some memory  " );
				return true;
			
			}
}