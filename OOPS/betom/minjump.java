package betom;

public class minjump {
	public static void main(String argd[]) {
//		int arr[]= {1,3,5,8,9,2,6,7,6,8,9};
		int arr[]= {2 ,3 ,1 ,1 ,2 ,4 ,2 ,0 ,1 ,1};
		int val=0,c=0;
		while(val<arr.length) {
			if(val==arr.length-1) {
				break;
			}
			if(arr[val]==0) {
				c=0;
				break;
			}
			System.out.print(arr[val]);
			val=val+arr[val];
			c++;
		}
		System.out.print("\n"+c);
		
	}
	
}
