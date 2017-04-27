package array.findDuplicateNum;

/**
 * 
 * @author Tzipora Ziegler
 *
 */
public class DuplicateNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Print "Duplicate not found." when this exception is thrown.
	 */
	public DuplicateNotFoundException(){
		super("Duplicate not found.");
	}
	
}
