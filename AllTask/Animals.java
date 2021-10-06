class Animals{
	public static void main(String[] values){
		String tiger="tiger";
		String lion="lion";
		String cheetha="cheetha";
		String deer="deer";
		String cow="cow";
		String dog="dog";
		String panda="panda";
		String elephant="elephant";
		String kangaroo="kangaroo";
		String cat="cat";
		String[] animals={tiger,lion,cat,cheetha,deer,dog,panda,elephant,kangaroo,cow};
		
		int size=animals.length;
		System.out.println("total animals :" +size);
		System.out.println("index 0: "+animals[0]);
		System.out.println("index 5: "+animals[5]);
		
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(cow);
		System.out.println(deer);
		System.out.println(panda);
		System.out.println(kangaroo);
		System.out.println(elephant);
		
	}
}