package ch06.sec10;

public class SamsungTv {
	public static String brand;
	public String model;
	public int inch;

	public void printValues() {
		System.out.printf("%s, %s, %d\n", brand, model, inch);
	}

	public static void staticMethod() {
//		System.out.printf("%s, %s, %d\n", brand
//		, modedl, inch);
	}

	// static 메소드는 static 맴버필드 파라미더
	public static void StaticMethod(int n1, int n2) {
		System.out.printf("%s, %s, %d\n",brand
		,n1,n2);
	}
}

