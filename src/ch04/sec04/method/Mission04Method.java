package ch04.sec04.method;

public class Mission04Method {
	public static void main(String[] args) {
		gugudan(4);
		System.out.println("-------------------");

		gugudan(4, 9); //4~9단까지
	}
	
	public static void gugudan(int dan){
		System.out.printf("------- %d 단-------\n", dan);
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
	}
	public static void gugudan(int dan, int dan2){
		for (int i = dan; i <= dan2; i ++){
			gugudan(i);
		}
	}
}
