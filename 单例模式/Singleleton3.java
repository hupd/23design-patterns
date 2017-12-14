package 上课_23种设计模式Day03;

public class Singleleton3 {
	//内部类可以防止jvm指令重排序
	private static boolean flag;
	private Singleleton3() {
		// TODO Auto-generated constructor stub
		if(!flag)
			flag=true;
		else {
	 throw	new RuntimeException("不能多次调用构造器") ;
		}
	}
	private static class sing{
		private static Singleleton3 instance=new Singleleton3();
	}
	public static Singleleton3 getInstance(){
		return sing.instance;
	}

}
