package ch07.sec02;

public class SmartPhone extends Phone{
	private boolean wifi;

	public SmartPhone(String model, String color){
		super(model,color); // 무조건 최상위
		System.out.println("SmartPhone 생성자 호출!!");
	}

	public void setWifi(boolean wifi){
		this.wifi = wifi;
	}

	public void internet() {
		System.out.println("인터넷 on");
	}
	public void bell() {
		System.out.println("스맡폰이 지잉");
	}
}

