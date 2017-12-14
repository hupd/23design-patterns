package 工厂模式;

public class Test {
	public static void main(String[] args) {
		ICar driverCar = Driver.driverCar("宝马");
		driverCar.driver();
	}
}
