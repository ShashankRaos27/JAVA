class Movie{
	public static void entertain(int ticketPrice, int movieLenght, String movieName, int rating, String[] actors)
	{
	System.out.println("movie details");
	System.out.println("ticketPrice "+ticketPrice);
	System.out.println("movieLenght" +movieLenght);
	System.out.println("rating" +rating);
	System.out.println("moive name " +movieName);
		for(int index=0; index<actors.length;)
		{
			String Actors=actors[index];
			System.out.println(Actors);
			index++;
		}
	}
}