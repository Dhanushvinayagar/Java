package betom;

public class swap {
	public static void main(String args[]) {
		int arr[]= {1,1,0,2,2,0};
		int low=0,j,high=arr.length-1,mid,temp=0;
		mid=low;

		for(int i=0;i<arr.length-1;i++) {
			if(arr[low]>arr[high]) {
				temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
			}
			if(arr[low]<arr[high]) {
				mid++;
			}
			if(arr[low]>arr[mid]) {
				temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				if(arr[mid]>arr[high]) {
					temp=arr[high];
					arr[high]=arr[mid];
					arr[mid]=temp;
				}
				mid++;
				high--;
			}
			if(mid>high) {
				for(int k=0;k<arr.length;k++) {
					System.out.println(arr[i]);
				}
				break;
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
