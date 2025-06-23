package ch07.sec07.poly2;

public class Buyer {
    private int money;
    private int bonusPoint;

    public Buyer() {
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
        System.out.println(productName + " 를(을) 구입함");
    }

    public int getMoney() {
        return money;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }

}
