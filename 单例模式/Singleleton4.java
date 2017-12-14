package �Ͽ�_23�����ģʽDay03;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Singleleton4 implements Serializable{
	//�ڲ�����Է�ֹjvmָ��������
	private static boolean flag;
	private Singleleton4() {
		if(!flag)
			flag=true;
		else {
	 throw	new RuntimeException("���ܶ�ε��ù�����") ;
		}
	}
	//���л����� �� ���������л����ٷ����л�
	//�۲��Ƿ���ͬһ������
	public  Object copy() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		//�����л�
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream  ois=new ObjectInputStream(bis);
		return  ois.readObject();
	}
	//��ֹ�����л������¶���ķ���
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