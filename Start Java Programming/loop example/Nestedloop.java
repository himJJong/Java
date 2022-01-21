package loopexample;

public class Nestedloop {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {
			for(times=1;times<=9;times++) {
				System.out.println(dan+"X"+times+"="+dan*times+"입니다.");
			}
			System.out.println();
		}

	}

}
