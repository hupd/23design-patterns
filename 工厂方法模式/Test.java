package ��������ģʽ;

import ����ģʽ.Driver;

public class Test {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		 ����˾�� ����˾��1 = new ����˾��();
		 
		����˾�� ����˾��1 = (����˾��)Class.forName("��������ģʽ.����˾��").newInstance();
		 ICar carDriver = ����˾��1.CarDriver();
		 carDriver.Driver();
	}

}
