class CarRunner{
	public static void main(String[] values){
		int vivekKmDriven=100000;
		int priyaKmDriven=20000;
		int sinduKmDriven=10000;
		int keerthiKmDriven=80000;
		int nandanKmDriven=7000;
		int darshanKmDriven=3000;
		int[] kmDrivenGroup={vivekKmDriven,priyaKmDriven,sinduKmDriven,keerthiKmDriven,nandanKmDriven,darshanKmDriven};
		int temRef=kmDrivenGroup[2];
		System.out.println(temRef);
		//int temRef2=kmDrivenGroup[4];
		System.out.println("===============");
		for(int index=0;index<kmDrivenGroup.length;)
		{
			int temp=kmDrivenGroup[index];
			System.out.println(temp);
			index++;
		}
	
	}
}