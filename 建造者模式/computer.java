package 建造者模式;
public class computer {
	private CPU cpu;
	private Memory memory;
	private Mainboard mainboard;
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public Mainboard getMainboard() {
		return mainboard;
	}
	public void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}
}
