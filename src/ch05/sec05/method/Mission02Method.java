package ch05.sec05.method;

public class Mission02Method {
	public static void main(String[] args) {
		String ext = getExt("asdf.adkf.jpg"); // "jpg" 리턴
		String ext2 = getExt("asdf.a.135..432.7437.347.34.dkf.jepg"); // "jpeg" 리턴

		System.out.println("ext : " + ext);
		System.out.println("ext2 : " + ext2);
	}
	public static String getExt(String tmp) {
		int idx = tmp.lastIndexOf('.');
		return tmp.substring(idx + 1);
	}
}
