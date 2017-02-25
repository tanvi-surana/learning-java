package stack;

import java.util.Stack;

public class StackImplementation {
     
	public static void main(String[] args) {
		Stack s=new Stack();
		String str="abcd";
		
		for(int i=0;i<str.length();i++)
		{
			//System.out.println(str.charAt(i));
			//Character a=str[i];
			s.push(str.charAt(i));
		}
		
		String reverseStr="";
		
		while(!s.isEmpty())
		{
			reverseStr+=s.pop();
			
		}
		
		System.out.println(reverseStr);

	}

}
