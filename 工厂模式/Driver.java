package ����ģʽ;

public class Driver {
	public static ICar driverCar(String s){
		if ("Benz".equals(s))
			return new Benz();
		else if ("����".equals(s)) {
			return new ����();
		}
		return null;
		
	}

}
