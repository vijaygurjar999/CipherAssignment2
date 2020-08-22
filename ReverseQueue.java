
import java.util.*;
import java.util.LinkedList;
public class ReverseQueue { 
	
	static Queue<Integer> queue; 
 
	static void Print() 
	{ 
		while (!queue.isEmpty()) { 
			System.out.print( queue.peek() + ", "); 
			queue.remove(); 
		} 
	} 
 
	static void reversequeue() 
	{ 
		Stack<Integer> stack = new Stack<>(); 
		while (!queue.isEmpty()) { 
			stack.add(queue.peek()); 
			queue.remove(); 
		} 
		while (!stack.isEmpty()) { 
			queue.add(stack.peek()); 
			stack.pop(); 
		} 
	} 

	public static void main(String args[]) 
	{ 
        Scanner scan = new Scanner(System.in);
		queue = new LinkedList<Integer>(); 
        int initialSize=scan.nextInt();
        for(int i=0;i<initialSize;i++){
            int n=scan.nextInt();
            queue.add(n);
        }
		reversequeue(); 
		Print(); 
	} 
} 
