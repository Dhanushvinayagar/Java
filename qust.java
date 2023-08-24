import java.util.Stack;

public class qust {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static void main(String[] args) {        
        add(1);
        add(2);
        add(3);
        System.out.println(s1);
        remove();
        System.out.println(s1);
        add(5);
        add(6);
        System.out.println(s1);
        remove();
        System.out.println(s1);
        remove();
        System.out.println(s1);


    }
    public static void add(int num) {
        s1.push(num);
    }

    public static void remove(){
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        s2.pop();
        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }

}
