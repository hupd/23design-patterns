package �Ͽ�_23�����ģʽDay03;

public class Singleleton3 {
	//�ڲ�����Է�ֹjvmָ��������
	private static boolean flag;
	private Singleleton3() {
		// TODO Auto-generated constructor stub
		if(!flag)
			flag=true;
		else {
	 throw	new RuntimeException("���ܶ�ε��ù�����") ;
		}
	}
	private static class sing{
		private static Singleleton3 instance=new Singleleton3();
	}
	public static Singleleton3 getInstance(){
		return sing.instance;
	}

}
