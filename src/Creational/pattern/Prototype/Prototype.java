/**
 * 
 */
package pattern.Prototype;

/**
 * ����ԭ��(Prototype)��ɫ
 * <p>
 * ����һ�������ɫ��ͨ����һ��Java�ӿڻ������ʵ�֡�
 * �˽�ɫ���������еľ���ԭ��������Ľӿڡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-28
 */
public interface Prototype extends Cloneable {

	/**
	 * ���ؿ�¡�Ķ���ʵ��
	 * <p>
	 * clone()�ľ���ʵ��һ�������ַ�ʽ���������ʵ����
	 * <p>
	 * clone()�����������µ�������
	 * 1�����κζ���x�����У�x.clone() != x��
	 * ����֮����¡������ԭ������ͬһ������
	 * 2�����κζ���x�����У�x.clone().getClass() == x.getClass()��
	 * ����֮����¡������ԭ���������һ����
	 * 3���������x��equals()��������ǡ���Ļ�����ôx.clone().equals(x)Ӧ���ǳ����ġ�
	 */
	public Object clone();
}