
public class BeerSong {
	public static void main(String[] args) { 
	int beerNum = 5;
    String word = "bottles";
    while (beerNum > 0) {

        if (beerNum == 1) {

            word = "bottle"; // singular, as in ONE bottle.

        } else {

            if (beerNum > 0) {

                System.out.println(beerNum  + "\t" + word + "\tof beer on the wall.");

                System.out.println(beerNum + "\t" + word + "\tof beer.");

                System.out.println("Take one down.");

                System.out.println("Pass it around");

                beerNum = beerNum - 1;

            }

        } // end else

    } // end of while

    System.out.print("No more bottles of beer on the wall");

} // end of main
}
