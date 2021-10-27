package helmetstarter;

import helmet.Monitor;

public class MonitorStarter {
	public static void main(String[] args)
	{
		Monitor monitor =new Monitor();
		monitor.add("hcl");
		monitor.add("hp");
		monitor.add("apple");
		monitor.add("dell");
		monitor.add("infotech");
		monitor.displayBrandsName();
				
		
	}

}
