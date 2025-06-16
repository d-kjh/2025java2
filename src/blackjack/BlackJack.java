package blackjack;

public class BlackJack {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
//		Card c = cd.getCard();
//		cd.printAllCards();

//		System.out.println(cd.getCard());
//		System.out.println(cd.getCard());
//		System.out.println("------------------------");
		System.out.println("----------------게이머 카드--------------");
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.showCards();
		int score = Rule.getScore(gamer.openCards()); // A:1, 2~10, J,Q,K: 10점

		System.out.println("---------------딜러 카드---------------");
		dealer.receiveCard(cd.getCard());
		dealer.receiveCard(cd.getCard());
		dealer.showCards();
		int score2 = Rule.getScore(dealer.openCards());

		if (dealer.needMoreCard()){
			dealer.receiveCard(cd.getCard());
		}
		System.out.printf("needMoreCard: %s\n", dealer.needMoreCard());

		System.out.println("----------정산------------");
		System.out.printf("게이머 : %d\n 딜러 : %d\n", score, score2);
		Rule.getWinner(dealer, gamer);
	}
}
