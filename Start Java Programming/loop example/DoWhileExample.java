package loopexample;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		do {
			sum +=num;
			num++;
		} while(num<=10);
		
		System.out.println("위 sum의 값은 "+sum+"입니다.");

	}
	
	
	

}
