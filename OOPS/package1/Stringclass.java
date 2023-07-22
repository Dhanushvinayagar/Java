package package1;

public class Stringclass {
	public static void main(String args[]) {
		String s=new String("Java");
		System.out.println("String:"+s);
		System.out.println("Length:"+s.length());
		
		String s1="Good programming";
		System.out.println("Sentence"+s1);
		System.out.println("Length:"+s1.length());
		
		System.out.println(s+s1+"\n");
		
		String str[]=s1.split(" ");
		for(String i:str) {
			System.out.print(i);
		}
		
		String string1="javatpoint";
		for(int i=0;i<string1.length();i++){
		for(int j=i+1;j<=string1.length();j++){
		   System.out.println(string1.substring(i,j));
		    }
		}

		System.out.println(" ");
		for(int i=0;i<string1.length();i++){
		for(int j=i+1;j<=string1.length();j++){
		   System.out.println(string1.subSequence(i,j));
		  
		    }
		}
		
		System.out.println("\n\n"+"String buffer:");
		StringBuilder sb=new StringBuilder("hello");
		sb.append("fine");
		System.out.println(sb);
		sb.insert(1,"aaa");
		System.out.println(sb);
		sb.replace(1,4,"cb"); 
		System.out.println(sb);
		sb.delete(1,3);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
	}
}
