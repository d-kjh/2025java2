package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	private List<Card> cards = new ArrayList<>(); // 편리한 배열

	public void receiveCard(Card card){
		cards.add(card);
	}

	public void showCards() {
		for (int i = 0; i < cards.size(); i++) {
			Card card = cards.get(i);
			System.out.println(card);
		}
	}

	public List<Card> openCards() {
		return this.cards;
	}

}
