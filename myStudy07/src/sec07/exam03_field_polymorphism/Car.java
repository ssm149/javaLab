package sec07.exam03_field_polymorphism;

public class Car {
	
	Tire[] tires = {
			new Tire("�� ����", 6),
			new Tire("�� ������", 2),
			new Tire("�� ����", 3),
			new Tire("�� ������", 4)
	};
	
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
	for (int i=0; i<tires.length; i++) {
		if(tires[i].roll()== false) {
			stop();
			return (i+1);
		}
	}
	return 0;
	}
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
