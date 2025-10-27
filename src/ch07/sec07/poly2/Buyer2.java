package ch07.sec07.poly2;

import java.util.*;

import static java.lang.String.format;

public class Buyer2 {
    private int money;
    private int bonusPoint;
    public List<String> productList = new ArrayList<>();
    public Buyer2() {
        this.money = 1_000; // 기본 1천만원
        this.bonusPoint = 0;
    }
    public void buy(Product product) {
        if (product.getPrice() > this.money) {
            System.out.println("잔액부족");
            return;
        }
        this.money -= product.getPrice();
        this.bonusPoint += product.getBonusPoint();
        String productName = product.getClass().getSimpleName();
        productList.add(productName);
        System.out.println(productName + " 를(을) 구입함");
    }

    public int getMoney() {
        return money;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }

    public void printPurchasedList() {

        System.out.println(productList);
    }
    public void printPurchasedProduct() {
        Map<String, Integer> map = new HashMap<> ();
        for (String s : productList) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        String result = map.entrySet().stream()
                .map(e -> String.format("%s %d대", e.getKey(), e.getValue()))
                .reduce((a, b) -> a + ", " + b)
                .orElse("");

        System.out.println(result);    }
}
