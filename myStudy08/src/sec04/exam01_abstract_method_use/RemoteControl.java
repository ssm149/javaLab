package sec04.exam01_abstract_method_use;

public interface RemoteControl {
	// 상수선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//추상 메소도**
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default  메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}



