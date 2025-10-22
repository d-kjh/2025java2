package ch13.sec01;

public class BoxObjExample {
    public static void main(String[] args) {
        BoxObj obj = new BoxObj();
        obj.setObj(10);
        int intValue = (int)obj.getObj();
        System.out.println("intValue is " + intValue);

        obj.setObj("문자열");
        String strValue = (String)obj.getObj();
        System.out.println("strValue is " + strValue);

        obj.setObj(true);

    }
}
