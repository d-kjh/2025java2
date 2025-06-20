package ch05.sec05.method;

public class ChatAtMethod {
	public static void main(String[] args) {
		String gender = checkGender("900212-1998756");
		String gender2 = checkGender("900212-2928657");

		// 8번째 문자가 '2' , '4' > 여자 리턴
		// 8번째 문자가 '1' , '3' > 남자 리턴
		// 네가지 숫자가 모두 아니면 null 리턴

		System.out.println("gender1 : " + gender);
		System.out.println("gender2 : " + gender2);
		System.out.println("gender3 : " + checkGender("901232-3344890"));
		System.out.println("gender4 : " + checkGender("901232-4344890"));
		System.out.println("gender5 : " + checkGender("901232-5344890"));
	}

	public static String checkGender(String ssn) {
		char gen = ssn.charAt(7);
		return switch (gen) {
			case '1', '3' -> "남자";
			case '2', '4' -> "여자";
			default -> null;
		};
	}
}