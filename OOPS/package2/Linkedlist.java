package package2;
import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(){
        
    }
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}
	


public class Linkedlist {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int x;
		x=s.nextInt();
		ListNode head=new ListNode(x);
		ListNode temp=head;
		for(int i=1;i<n;i++){
		    x=s.nextInt();
		    ListNode li=new ListNode(x);
		    temp.next=li;
		    temp=li;
		}
		temp=head;
		for(int i=0;i<n;i++){
		    System.out.print(temp.val+"->");
		    temp=temp.next;
		}
		
	}
}
