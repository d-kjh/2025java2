package blackjack;

public class CardDeck {
	private final Card[] cards = new Card[52]; // cards는 카드객체 52개의 주소값을 저장 할 수 있음
	private final String[] patterns = {"♧", " ◆ ", "♥", "♤"};
	private int selectedIdx = 0;

	public CardDeck(){
		// 각방은 Card객체의 주소값
		// 모든 방에 모두 다른 주소값을 넣는다.
		// 각 카드가 가지고 있는 값 달라야함
		int index = 0;
//		for (int i = 0; i < patterns.length; i++){
		for (String pattern : patterns) {
			for (int k = 1; k <= 13; k++) {
				String denomiation = switch (k) {
					case 1 -> "A";
					case 11 -> "J";
					case 12 -> "Q";
					case 13 -> "K";
					default -> String.valueOf(k);
				};
				cards[index++] = new Card(pattern, denomiation);
			}
		}
		shuffle(); // 내부적으로 사용하는 메소드
	}
	private void shuffle(){ // 카드 개거체 순서 섞기
		for (int i = 0; i < cards.length; i++){
			int r = (int)(Math.random() * cards.length);
			Card c = cards[i];
			cards[i] = cards[r];
			cards[r] = c;
		}
	}
	public Card getCard(){
		if (selectedIdx == cards.length){
			return  null;
		}
		Card c = cards[selectedIdx];
		cards[selectedIdx++] = null;
		return c;
	}
	
	public void printAllCards() {
		for (Card card : cards){
//			System.out.printf("(%s)%s\n", card.getPattern(), card.getDenomination());
			System.out.println(card);
		}
	}
}
