package RPNCalculator;
import java.util.ArrayList;



	public class YourArrayListStack implements YourStack {
		ArrayList<Integer> theStack = new ArrayList<>();

		public void push(Integer i) {
			
			
			theStack.add(i);
			
			
			}
		
		public Integer pop() {
		
			
			return theStack.remove(size() -1);
			
			
			
			
	//	if (theStack.isEmpty()) {
	//		return null;
			
	//	}
	//	int n = theStack.get(theStack.size() -1);
	//	theStack.remove(theStack.size() - 1);
	//	return n;
		
		
		
		
		
		//int Index = theStack.size() -1;
		//int el = theStack.remove(Index);
		//return el;
		
		
			
		}

	public Integer size() {
			return theStack.size(); 
			
		}

	}


