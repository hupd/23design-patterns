package 工厂方法模式;

public class 宝马司机 implements 司机{

	@Override
	public ICar CarDriver() {
		// TODO Auto-generated method stub
		return new  宝马();
	}

}
