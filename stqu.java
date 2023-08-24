import java.util.Queue;
import java.util.LinkedList;

public class stqu {
    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<>();
    
    public static void main(String[] args) {    
        push(1);
        push(2);
        push(3);
        pop();
        push(4);
        pop();
        System.out.println(q1);

    }

    public static void push(int num) {
            while(q1.size()!=0){  
                q2.add(q1.remove());
            }
            q1.add(num);
            while(q2.size()!=0){
                q1.add(q2.remove());
            }
   
    }
    public static void pop() {
        System.out.println(q1.remove());        
    }

}
