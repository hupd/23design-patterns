package ԭ��ģʽ;
//ԭ��ģʽ ǳ��¡     ��¡���Ƕ��������
// ֻ���¡��ֵ�������¡��������ö���ԭ��ָ��ʲô���ڻ�ָ��ʲô  ��
public class Prototype1 implements Cloneable{
	private int  num;
	private Obj obj;
	public Obj getObj() {
		return obj;
	}

	public void setObj(Obj obj) {
		this.obj = obj;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	//��¡ 
	public  Object qClone() throws CloneNotSupportedException{
		Prototype1 prototype1=(Prototype1) super.clone();
		return prototype1;
	}
}


//Cloneable ��¡  
//Seriable  ���л�