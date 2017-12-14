package 上课_23种设计模式Day03;

import java.lang.reflect.Constructor;
import java.util.MissingFormatArgumentException;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Singleleton3 s1=Singleleton3.getInstance();
		//System.out.println();
		Class<? extends Singleleton3> c = s1.getClass();
		Constructor<? extends Singleleton3> cons = c.getDeclaredConstructor();
		//获得类的构造器  暴力改变构造器的访问权限  true为可访问
		cons.setAccessible(true);
		//获得类的实例对象
		Singleleton3 newInstance = cons.newInstance();
		System.out.println(s1==newInstance);
		
		
	}
}
