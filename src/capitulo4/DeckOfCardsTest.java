package capitulo4;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // coloca Cards em ordem aleat�ria

		// imprime todas as 52 cartas na ordem em que elas s�o distribu�das
		for (int i = 1; i <= 52; i++) {
			// distribui e exibe uma Card
			System.out.printf("%-19s", myDeckOfCards.dealCard());

			if (i % 4 == 0) // gera uma nova linha ap�s cada quarta carta
				System.out.println();
		}
	}

}
