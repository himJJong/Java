package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		int num=0;
		int sum=0;
		
		for(num=0; ;num++) {
			sum+=num;
			if (sum>100){
				break;
			}
		}
		System.out.println("num값은 ="+num);
		System.out.println("sum값은 ="+sum);
	}

}
