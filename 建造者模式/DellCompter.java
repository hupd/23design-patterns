package 建造者模式;
//买电脑的配件
public class DellCompter implements ComputerBuilder{
	private	computer computer1;
	public DellCompter(computer computer1) {
		this.computer1 = computer1;
	}
	public void builderCPU() {
		// TODO Auto-generated method stub
		computer1.setCpu(new InterCPU());
	}
	@Override
	public void builderMemory() {
		// TODO Auto-generated method stub
		computer1.setMemory(new KingstonMemory());
	}
	@Override
	public void builderMainboard() {
		// TODO Auto-generated method stub
		computer1.setMainboard(new AsusMainboard());
	}
	@Override
	public computer getCompter() {
		// TODO Auto-generated method stub
		return computer1;
	}
}
