
public class PhrasOmatic {
	 public static void main (String[] args){

	        String[] wordListOne = {"24/7", "multi-tier","30,000 foot", "B-to-B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic" };

	        String[] wordListTwo = {"empowered","sticky","value-added","oriented", "centric","distributed","clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};

	        String[] wordListThree = {"process","tipping-point","solution","architecture","core competency","strategy","mind share","portal","space","vision","paradigm","mission"};

	        int onelength = wordListOne.length;

	        int twolength = wordListTwo.length;

	        int threelength = wordListThree.length;

	        int r1 = (int) (Math.random() * onelength);

	        int r2 = (int) (Math.random() * twolength);

	        int r3 = (int) (Math.random() * threelength);

	        String phrase = wordListOne[r1] + "\t" + wordListTwo[r2] + "\t" + wordListThree[r3];

	        System.out.println("What we need is a\t"+ phrase);

	    }
}
