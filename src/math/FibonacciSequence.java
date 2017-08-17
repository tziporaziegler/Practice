package math;

public class FibonacciSequence {

	public String printSequence(int numberElements) {
		StringBuilder builder = new StringBuilder();
		
		for(int i = 1; i <= numberElements; i++){
			builder.append(getElement(i));
			builder.append(" ");	
		}
		return builder.toString();
	}

	public int getElement(int position) {
		if (position == 0) {
			return 0;
		}
		
		if (position == 1 || position == 2) {
			return 1;
		}
 
		return getElement(position - 1) + getElement(position - 2); // tail recursion
	}
}
