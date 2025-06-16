package blackjack;

import java.util.List;

public class Rule {
	private final static int MAX_SCORE = 21;

	public static void getWinner(Dealer dealer, Gamer gamer){
		// 경우의 수 6가지
		// 1. 둘 다 총 점수가 21점 초과 > 비김

		// 2. 둘 다 총 점수가 21점 이하지만 점수가 같음 >> 비김
		// 3. 딜러의 총 점수가 21점 초과 게이머의 총 점수가 21점 이하 > 게이머 승

		// 4. 둘 다 총 점수가 21점 이하지만 게이머의 총 점수가 21점에 가까움 > 게이머 승
		// 5. 게이머의 총 점수가 21점 초과 딜러의 총 점수가 21점 이하 > 딜러 승
		// 6. 둘 다 총 점수가 21점 이하지만 딜러의 총 점수가 21점에 가까움 > 딜러 승
		int dScore = getScore(dealer.openCards());
		int gScore = getScore(gamer.openCards());
//		if ( dScore > MAX_SCORE && gScore > MAX_SCORE || dScore == gScore) {
//			System.out.println("비김");
//		} else if ( dScore <= MAX_SCORE && gScore <= MAX_SCORE) {
//			System.out.println(dScore > gScore ? "딜러 승" : "게이머 승");
//		} else if ( dScore <= MAX_SCORE){
//			System.out.println("딜러 승");
//		} else {
//			System.out.println("게이머 승");
//		}

		if ((dScore > MAX_SCORE && gScore > MAX_SCORE) || dScore == gScore) {
			System.out.println("비김");
		} else if (dScore <= MAX_SCORE && gScore <= MAX_SCORE) {
			if (dScore > gScore) {
				System.out.println("딜러 승");
			} else if (dScore < gScore) {
				System.out.println("게이머 승");
			} else {
				System.out.println("비김"); // 동점 처리
			}
		} else if (dScore <= MAX_SCORE) {
			System.out.println("딜러 승");
		} else {
			System.out.println("게이머 승");
		}

	}

	public static int getScore(List<Card> cards){
		int sumScore = 0;

		for (Card card : cards){
			int score = convertDenominationToScore(card.getDenomination());
//		for (int i = 0; i < cards.size(); i++){
//			Card card = cards.get(i);
//			int Score = switch (card.getDenomination()){
//				case "A" -> 1;
//				case "J","Q","K" -> 10;
//				default -> Integer.parseInt(card.getDenomination());
//			};
			sumScore += score;
		};
		return sumScore;
	}

	private static int convertDenominationToScore(String denomination) {
		return switch (denomination) {
			case "A" -> 1;
			case "J", "Q", "K" -> 10;
			default -> Integer.parseInt(denomination);
		};
	}
}
