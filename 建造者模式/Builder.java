package ������ģʽ;
//��������װ���ԣ������⼸̨����
/**
 * ָ���߽�ɫ���þ��彨���߽�ɫ�Դ�����Ʒ����ָ����û�в�Ʒ��ľ���֪ʶ������ӵ�в�Ʒ��ľ���֪ʶ���Ǿ��彨���߶���
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
