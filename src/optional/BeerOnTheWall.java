package optional;

/* 
 * Print the lyrics to the song "99 Bottles of Beer on the wall"
 * 
 * http://99-bottles-of-beer.net/lyrics.html
 */

public class BeerOnTheWall {
	public static void main(String[] args) {
		
		for (int i = 99; i > 0; i--)
		{
			if (i > 0)
			{
				System.out.println(i + " bottles of beer on the wall, " + i + " bottle of beer. \n Take one down and pass it around," + i + " bottles of beer on the wall.");
			}
		}
		
		System.out.println(" \n No more bottles of beer on the wall, no more bottles of beer. ");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");

	}
}
