package array;

public class BookArray2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0]=new Book("태백산맥 "," 권종석 ");
		library[1]=new Book("태백산정  "," 권종석 ");
		library[2]=new Book("태백산인  "," 권종석 ");
		library[3]=new Book("태백산소  "," 권종석 ");
		library[4]=new Book("태백산가  "," 권종석 ");
		
	for (int i=0; i<library.length; i++) {
		library[i].showInfo();
	}
	for(int i=0 ; i<library.length; i++) {
		System.out.println(library[i]);
	}
	}
}
