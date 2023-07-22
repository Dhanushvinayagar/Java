package object;

import java.util.Stack;

public class Stackinbuild {
	public static void main(String args[]) {
		System.out.println("Integer stack");
		Stack<Integer> st=new Stack<Integer>();//Create integer stack
		System.out.println("Pushing...");
		st.push(6);			//push
		st.push(7);
		st.push(8);
		System.out.println("Stack:"+st);//display stack
		System.out.println("Stack size:"+st.size()); //display stack size
		
		System.out.println("Check empty:"+st.isEmpty()); //check empty stack
		
		System.out.println("Peek element:"+st.peek()); //check peek element
		
		System.out.println("Search:"+st.search(8)); //search 8 return 1 position
		System.out.println("Search:"+st.search(2)); //search 2 return -1
		
		System.out.print("Pop:");
		System.out.print(st.pop());	//pop
		System.out.print(st.pop());
		System.out.println(st.pop());
		
		System.out.println("Check empty:"+st.isEmpty());
		
		
		//character stack
		System.out.println("\nCharacter stack");
		Stack<Character> s=new Stack<>();//Create integer stack
		System.out.println("Pushing...");
		s.push('a');			//push
		s.push('1');
		s.push('!');
		System.out.println("Stack:"+s);	//display stack
		
		System.out.println("Check empty:"+s.isEmpty()); //check empty stack
		
		System.out.println("Peek element:"+s.peek()); //check peek element
		
		System.out.println("Search:"+s.search('!')); //search ! return 1
		System.out.println("Search:"+s.search('2')); //search 2 return -1
		
		System.out.print("Pop:");
		System.out.print(s.pop());	//pop
		System.out.print(s.pop());
		System.out.println(s.pop());
		
		System.out.println("Check empty:"+s.isEmpty());
		
		
		//String stack
		
		System.out.println("\nCharacter stack");
		Stack<String> str=new Stack<>();//Create integer stack
		System.out.println("Pushing...");
		str.push("abc");			//push
		str.push("123");
		str.push("!");
		System.out.println("Stack:"+str);	//display stack
		
		System.out.println("Check empty:"+str.isEmpty()); //check empty stack
		
		System.out.println("Peek element:"+str.peek()); //check peek element
		
		System.out.println("Search:"+str.search('!')); //search ! return 1
		System.out.println("Search:"+str.search('2')); //search 2 return -1
		
		System.out.print("Pop:");
		System.out.print(str.pop());	//pop
		System.out.print(str.pop());
		System.out.println(str.pop());
		
		System.out.println("Check empty:"+str.isEmpty());
		
	}
}
