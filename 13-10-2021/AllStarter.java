class AllStarter
{
	public static void main (String[] rao)
	{
		BiCycle biCycle=new BiCycle();
		biCycle.brake();
		biCycle.move();
		biCycle.displayDetails();
		Watch watch=new Watch();
		watch.displayDetails();
		Lock lock =new Lock();
		lock.open();
		lock.close();
		
		
	}	
}