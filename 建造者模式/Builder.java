package 建造者模式;
//真正的组装电脑，构建这几台电脑
/**
 * 指导者角色调用具体建造者角色以创建产品对象，指导者没有产品类的具体知识，真正拥有产品类的具体知识的是具体建造者对象
 * @author Administrator
 *
 */
public class Builder {
	private ComputerBuilder computerBuilder;
	public Builder(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}
	public void construct(){
		computerBuilder.builderCPU();
		computerBuilder.builderMainboard();
		computerBuilder.builderMemory();
	}
}
