package 建造者模式;
//组装电脑的接口（因为具体零件不确定 所以抽象为接口）
public interface ComputerBuilder {
	public void builderCPU();
	public void builderMemory();
	public void builderMainboard();
	public computer getCompter();
}
