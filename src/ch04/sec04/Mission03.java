package ch04.sec04;

public class Mission03 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3;// 3 ~ 8 랜덤값
        System.out.println("star : " + star);
        for (int i = 0; i < star; i++){
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
        for(int i =0; i<star; i++) {
            for (int j = 0; j <= star; j++){
                System.out.printf("%s", (j != star) ? "*" : "\n");
            }
        }
    }
}
