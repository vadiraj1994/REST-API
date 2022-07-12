package GenericLibrary;

import java.util.Random;

/**
 * 
 * @author Vadiraj
 *
 */
public class JavaLibrary {

	/**
	 * This method is used to get the Random Number
	 */
	public int getRandomNumber()
	{
		Random ran=new Random();
		int random=ran.nextInt(500);
		return random;
	}
	
}
