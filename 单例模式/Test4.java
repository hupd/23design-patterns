package �Ͽ�_23�����ģʽDay03;

import java.io.IOException;

public class Test4 {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Singleleton4 s1=Singleleton4.getInstance();
		Singleleton4 s2 = (Singleleton4)s1.copy();
		System.out.println(s1==s2);
		
	}

}
