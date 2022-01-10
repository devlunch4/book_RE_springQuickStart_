package polymorphism;

public class SamsungTV implements TV {
	private SonySpeaker speaker;

	public SamsungTV() {
		System.out.println("===> SamsungTV °´Ã¼ »ý¼º");
	}

	public void powerOn() {
		System.out.println("SamsungTV---Àü¿ø ÄÒ´Ù.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---Àü¿ø ²ö´Ù.");
	}

	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
