package ch05.sec05;

public class Mission02 {
    public static void main(String[] args) {
        String filName = "가나다라.haha.jpg"; // 확장자 추출하기

        int idx = filName.lastIndexOf(".");
        String ext = filName.substring(idx + 1);

        System.out.println("ext : " + ext);
    }
}
