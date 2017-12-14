package 原型模式;
//原型模式 浅克隆     克隆的是对象的数据
// 只会克隆数值，不会克隆类对象（引用对象原来指向什么现在还指向什么  ）
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
	//克隆 
	public  Object qClone() throws CloneNotSupportedException{
		Prototype1 prototype1=(Prototype1) super.clone();
		return prototype1;
	}
}


//Cloneable 克隆  
//Seriable  序列化