package ch13.sec01;

public class BoxGenericExample {
    public static void main(String[] args) {
        BoxGeneric<String> strBox = new BoxGeneric<>();
        strBox.setObj("hi");

        String strValue = strBox.getObj();
        System.out.println("strValue: " + strValue);

        BoxGeneric<Integer> intBox = new BoxGeneric<>();

    }
}
