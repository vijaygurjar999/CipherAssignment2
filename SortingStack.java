
import java.util.*;

class SortStack 
{ 
	
	public static Stack<Integer> sortstack(Stack<Integer> 
											input) 
	{ 
		Stack<Integer> tmpStack = new Stack<Integer>(); 
		while(!input.isEmpty()) 
		{ 
			
			int tmp = input.pop(); 
		
			while(!tmpStack.isEmpty() && tmpStack.peek() 
												> tmp) 
			{ 
			input.push(tmpStack.pop()); 
			} 
			tmpStack.push(tmp); 
		} 
		return tmpStack; 
	} 

	public static void main(String args[]) 
	{ 
        Scanner scan = new Scanner(System.in);
		Stack<Integer> input = new Stack<Integer>(); 
        int initialSize=scan.nextInt();
        for(int i=0;i<initialSize;i++){
            int n=scan.nextInt();
            input.add(n);
        }
		Stack<Integer> tmpStack=sortstack(input); 
		System.out.println("Sorted numbers are:"); 
	
		while (!tmpStack.empty()) 
		{ 
			System.out.print(tmpStack.pop()+" "); 
        } 
        scan.close();
	} 
} 

