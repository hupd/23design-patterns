package �Ͽ�_23�����ģʽDay03;

import java.lang.reflect.Constructor;
import java.util.MissingFormatArgumentException;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Singleleton3 s1=Singleleton3.getInstance();
		//System.out.println();
		Class<? extends Singleleton3> c = s1.getClass();
		Constructor<? extends Singleleton3> cons = c.getDeclaredConstructor();
		//�����Ĺ�����  �����ı乹�����ķ���Ȩ��  trueΪ�ɷ���
		cons.setAccessible(true);
		//������ʵ������
		Singleleton3 newInstance = cons.newInstance();
		System.out.println(s1==newInstance);
		
		
	}
}
