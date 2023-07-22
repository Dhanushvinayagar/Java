package object;

class Tyear{
	void name() {
		System.out.println("3 year");
	}
}
class Student extends Tyear{
	void name() {
		System.out.println("Student");
	}
}
class Teacher extends Tyear{
	void name() {
		System.out.println("Teacher");
	}
}

public class Overridding{
	public static void main(String args[]) {
		Tyear t=new Tyear();
		t.name();
		Student s=new Student();
		s.name();
		Tyear st=new Student();
		st.name();
		Teacher te=new Teacher();
		te.name();
		Tyear tt=new Teacher();
		tt.name();
	}
}
