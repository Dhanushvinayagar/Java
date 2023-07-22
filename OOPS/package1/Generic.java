package package1;

class gene<T> {
   T data;

  public gene(T data) {
    this.data = data;
  }

  public T get() {
    return this.data;
  }
}


class geneme {
  public <T> void genericsMethod(T data) {
    System.out.println("Data : " + data);
  }
}
public class Generic {
  public static void main(String[] args) {
	  //class
    gene<Integer> i = new gene<>(5);
    
    System.out.println("Generic Class : " + i.get());

    gene<String> s= new gene<>("Java Programming");
    System.out.println("Generic Class : " + s.get());
    
    //method
    System.out.println("Generics Method:");
    geneme ge = new geneme();
    ge.<Integer>genericsMethod(25);
    ge.<String>genericsMethod("Java Programming");

  }
}
