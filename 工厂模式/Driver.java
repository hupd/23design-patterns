package 工厂模式;

public class Driver {
	public static ICar driverCar(String s){
		if ("Benz".equals(s))
			return new Benz();
		else if ("宝马".equals(s)) {
			return new 宝马();
		}
		return null;
		
	}

}
