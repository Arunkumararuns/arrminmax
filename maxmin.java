
package javaclass2;
/*max
public class maxmin {

	public static void main(String[] args) {
		int arr[]= {10,15,20,25,30};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}*/
//min
import java.util.*;
public class maxmin {

	public static void main(String[] args) { 
		int arr[]= {10,15,20,25,30};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
/* min
public class maxmin {

public static void main(String[] args) { 
	int arr[]= {10,15,20,25,30};
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(max>arr[i]) {
			max=arr[i];
		}
	}
	System.out.println(max);

}

}*/