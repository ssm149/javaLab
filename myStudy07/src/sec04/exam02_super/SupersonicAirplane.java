package sec04.exam02_super;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SOUPERSONIC = 2;

	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SOUPERSONIC) {
			System.out.println("초음속 비행 모드로 변경합니다.");			
		}else {
			super.fly();
		}
		
	}

}
