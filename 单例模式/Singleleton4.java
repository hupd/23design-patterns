package 上课_23种设计模式Day03;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Singleleton4 implements Serializable{
	//内部类可以防止jvm指令重排序
	private static boolean flag;
	private Singleleton4() {
		if(!flag)
			flag=true;
		else {
	 throw	new RuntimeException("不能多次调用构造器") ;
		}
	}
	//序列化方法 。 将对象序列化，再反序列化
	//观察是否是同一个对象
	public  Object copy() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		//反序列化
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream  ois=new ObjectInputStream(bis);
		return  ois.readObject();
	}
	//防止反序列化创建新对象的方法
	public Object readResolve(){
		return getInstance();
	}
	private static class sing{
		private static Singleleton4 instance=new Singleleton4();
	}
	public static Singleleton4 getInstance(){
		return sing.instance;
	}
}