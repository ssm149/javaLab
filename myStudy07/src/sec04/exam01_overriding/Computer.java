package sec04.exam01_overriding;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		return super.areaCircle(r);
	}

}
