package 工厂方法模式;

import 工厂模式.Driver;

public class Test {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		 宝马司机 宝马司机1 = new 宝马司机();
		 
		宝马司机 宝马司机1 = (宝马司机)Class.forName("工厂方法模式.宝马司机").newInstance();
		 ICar carDriver = 宝马司机1.CarDriver();
		 carDriver.Driver();
	}

}
