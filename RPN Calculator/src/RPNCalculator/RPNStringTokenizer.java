package RPNCalculator;
import java.util.ArrayList;



	public interface RPNStringTokenizer {
		public static ArrayList<String> tokenize (String expression) {
			
			ArrayList<String> tokens = new ArrayList<String>();
			
			String[] cat = expression.split(" "); // splitting at space and inserting in array cat 
			
			for (String x: cat) {
				
				if (isOperan(x)||isOperator(x)) {
					tokens.add(x);			
			}
					else {
						
						return null;
					}
			}			
			return tokens;		
		}
			
	public static boolean isOperan(String hi) {
					
			try {
			
				Double.parseDouble(hi);
					return true;
					
			}
					catch(NumberFormatException e){
						return false;
										
					}
			
		}
	
	public static boolean isOperator(String r) {
		
		
		if (r.equals("+")) {
			return true;
			
		}
		if (r.equals("-")) {
				return true;
		}	
				
		if (r.equals("*")) {
			return true;
		}
		if (r.equals("/")) {
			return true;
		
		}
		return false;
		
		
		
	}
		
	}
		
