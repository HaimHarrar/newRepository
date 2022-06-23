import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
	
		Ques2[]arr=new Ques2[3];
		arr[0]=new Ques2(3,"haim");
		arr[1]=new Ques2(4.7,"avi");
		arr[2]=new Ques2(1.3,"josef");
		double avg=arr[0].avg_jump(arr);
		System.out.println(avg);
		arr[0].above_avg(arr, avg);
		
 	}
	
}
