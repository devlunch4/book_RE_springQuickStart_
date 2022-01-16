package polymorphism;

public class SamsungTV implements TV {
	private SonySpeaker speaker;

	public SamsungTV() {
		System.out.println("===> Samsung(1) 按眉 积己");
	}

	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) 按眉 积己");
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("SamsungTV---傈盔 囊促.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---傈盔 馋促.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
