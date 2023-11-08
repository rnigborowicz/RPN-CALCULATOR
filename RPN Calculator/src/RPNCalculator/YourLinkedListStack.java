package RPNCalculator;

	

	public class YourLinkedListStack implements YourStack {
		// YOU MUST USE THIS IMPLEMENTATION - just code the methods
		private YourStackNode head = null;
		private Integer size = 0;
		

		public void push(Integer i) {
				
			YourStackNode node = new YourStackNode();
			    
		       
		 
		       
		        System.out.println("Inserting " + i);
		 
		        node.setItem(i);
		        node.setNext(head);
		        head = node;
		       
		        size++;
		        
		        }
		        
		 
		    
		

		public Integer pop() {
			YourStackNode node = new YourStackNode();
			node = head;
			head = head.getNext();
			
			size--;
			return node.getItem();
			
	        
	 
	        
	 
			
		}

		public Integer size() {
			return size;
		}

		
		
		
		
		
		
		
		
	}


