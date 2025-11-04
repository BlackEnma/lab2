

import java.util.ArrayList;
/** Description of my class
 * SharData contains represents a container for shared data that will be accessed 
 * by multiple threads The shared data consists of a list of integers a boolean array,
 * a boolean flag, and a constant integer. 
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array          list Integers array a list of integers, representing shared data among threads.
	 * @param b              integer  b a final integer that is initialized and cannot be changed later.
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * Returns the boolean array winArray that contains the tow selected numbers.
	 * @return  boolean array representing thread statuses or outcomes.
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Sets the boolean array winArra
	 * @param winArray The boolean array to be shared among threads.
	 */ 
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Returns the list of integers
	 * @return The list of integers that represents shared data.
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * Returns the final integer b, which was initialized in the constructor.
	 * @return The final constant integer value.
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 *Returns the current value of the boolean flag 
	 * @return The boolean flag value.
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 *Sets the boolean flag to the given value 
	 * @param flag The boolean value to set the flag to.
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
