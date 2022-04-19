package capitulo5;

import java.util.EnumSet;

public class EnumBooksTest {

	public static void main(String[] args) {
		 System.out.println("All books:");
		
		 // imprime todos os livros em enum EnumBooks
		 for (EnumBooks book : EnumBooks.values())
		 System.out.printf("%-10s%-45s%s%n", book,
		book.getTitle(),book.getCopyrightYear());
		
		 System.out.printf("%nDisplay a range of enum constants:%n");
		
		 // imprime os primeiros quatro livros
		 for (EnumBooks book : EnumSet.range(EnumBooks.JHTP, EnumBooks.CPPHTP))
		 System.out.printf("%-10s%-45s%s%n", book,
		book.getTitle(),book.getCopyrightYear());

	}

}
