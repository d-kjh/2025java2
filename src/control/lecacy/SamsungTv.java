package control.lecacy;

import control.Speaker;
import control.Tv;

public class SamsungTv implements Tv {
	//삼성Tv는 스피커를 사용할 수 있다
	//스피커는 HarmanSpeaker를 사용한다
	private Speaker speaker;

	public SamsungTv(){
		this.speaker = new HarmanSpeaker();
	}
	
	@Override
	public void sound() {
		System.out.println("삼송티비 스피커는");
		this.speaker.speakerSound();
	}
}
