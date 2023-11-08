package RPNCalculator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.List;



	public class YourRPNCalculator implements SimpleRPNCalculator {

		YourStack theStack = null;
		
		private List <String> ops;
		
		public YourRPNCalculator(YourStack stack) {
			theStack = stack;
			
			//Set <String> set = new HashSet <> ();
			//set.add("+");
			//set.add("^");
			//set.add("-");
			//set.add("*");
			//set.add("/");
			ops = List.of("+", "/", "-", "*");
			
			
		}

		
		public String calculate(String inputString) {
			
			ArrayList<String> tokens = RPNStringTokenizer.tokenize(inputString);
			
			if (tokens == null) {
				return("bad tokins");
				
			}
			else {
				for (String x : tokens) {
					if (ops.contains(x)) {
						theStack.push(useOps(x));
						
					}
					else {
						
						theStack.push(Integer.parseInt(x));
						
					}
				}
				if (theStack.size() != 1) {
					return ("wrong operator to do stuff");
					
				}
				int result = theStack.pop();
				return ("result of calc" + result);
				
				
				
			}
				}
	
	
	
			
			
		public Integer useOps(String f) {
			
			if (theStack.size() < 2) {
				return null;
				
			
			}
			int rs = theStack.pop();
			int ls = theStack.pop();
			
			
			switch(f) {
			
			case "+":
				return ls + rs;
			case "-":
				return ls - rs;
			case "*":
				return ls * rs;
			case "/":
				return ls / rs;
				
			}		
						
			
		
			return null; 
			
		}
			
		}
	
	
