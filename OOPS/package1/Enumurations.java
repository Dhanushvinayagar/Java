package package1;

 enum Days{
	Sunday,Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday;
}

public class Enumurations {
	public static void main(String args[]) {
		Days e=Days.Sunday;
		System.out.println(e);
		for(Days s: Days.values()) {
			System.out.println(s);
		}
	}
}
