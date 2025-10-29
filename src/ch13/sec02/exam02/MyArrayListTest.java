package ch13.sec02.exam02;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("가");
        list.add("나");
        list.add("다");
        list.add("라");
        list.add("마");

        System.out.println(list.size());

        String item = list.get(2);
        System.out.println(item);

        list.add(2, "카");

        System.out.println(list.size());
        System.out.println(list.get(2));

        String lastValue = list.pop();
        System.out.println(list.size());
        System.out.println(lastValue);

        System.out.println(list);
    }
}
