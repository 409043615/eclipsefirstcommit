package String;
//�����ַ���ʱ�����ַ����������������һ���ַ������ַ�������������������
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hellow";//���ַ����������ﴴ��һ��Hellow�ַ��������ַ������ɱ�
		String s2="Hellow";//���ַ���������ֱ��������
		System.out.println(s1==s2);//true
//	�����Ƚ��ַ�����������Ƿ���Ȳ�����==����һ���ǽ��ң�Ҫ��equal����
		String s3=new String("abc");
		String s4=new String("abc");
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		String s5="Hel";
		String s6="low";
		String s7=s5+s6;//��������������䣬̫ռ�������ռ�
		System.out.println(s7);
	}

}
