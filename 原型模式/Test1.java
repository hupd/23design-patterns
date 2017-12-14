package 原型模式;
public class Test1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype1 prototype1=new Prototype1();
		prototype1.setNum(500);
		prototype1.setObj(new Obj());
		Prototype1 prototype12=(Prototype1) prototype1.qClone();
		System.out.println(prototype12.getNum());
		System.out.println(prototype1.getObj()==prototype12.getObj());
		System.out.println(prototype1==prototype12);
	}
}
