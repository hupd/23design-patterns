package 建造者模式;
import java.awt.List;
public class Test {
	public static void main(String[] args) {
		computer computer=null;
		ComputerBuilder computerBuilder=new DellCompter(new computer());
		Builder builder=new Builder(computerBuilder);
		builder.construct();
		computer=computerBuilder.getCompter(); 
		System.out.println(computer);
	int  ARR[]={213,321,331};
	}
}

class Test3{
	public static void main(String[] args) {
		System.out.println("你好世界");
	}
}