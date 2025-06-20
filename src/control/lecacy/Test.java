package control.lecacy;

import control.Speaker;
import control.Tv;

public class Test {
	public static void main(String[] args) {
		Speaker speaker = new HarmanSpeaker();
		speaker.speakerSound();

		Speaker speaker1 = new JBLSpeaker();
		speaker1.speakerSound();

		System.out.println("-----");
		Tv tv = new SamsungTv();
		tv.sound();
	}
}
