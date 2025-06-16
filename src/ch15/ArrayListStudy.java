package ch15;

import blackjack.Card;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListStudy {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
//		List<String> list = new ArrayList<>(); // 다형성 - 오로지 상속관계만 가능
		// <String> 제네릭 (Generic), 제한을 건다. 오로지 String객체 주소값만 담을 수 있는 컬랙션
		Card card = new Card("", "");
		// list.add(card); 안 담김
		System.out.println("list.size():" + list.size());
		list.add("가"); // 0번 방에 "가" 주소값이 들어감
		list.add("나"); // 1번 방에 "나" 주소값이 들어감
		System.out.println("list.size(): " + list.size());
		System.out.println("list.get(0): " + list.get(0));
		System.out.println("list.get(1): " + list.get(1));
	}
}
