package String04�ַ���������N�ַ���;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		��һ��
		String s1="abc";
//		�ڶ���
		String s2=new String("def");
//		������
		byte[] bytes={97,98,99,100};
		String s3=new String(bytes);
		System.out.println(s3);
//		������
		String s4=new String(bytes,0,3);//��˼��bytes�����0�±�Ԫ�������������Ԫ��
		System.out.println(s4);
//		������
		char[] chars={'��','��','��','��','��'};
		String s7=new String(chars);
		System.out.println(s7);
//		������
		String s8=new String(chars,2,2);//��˼��chars�����2�±�Ԫ���������2��Ԫ��
		System.out.println(s8);
		
	}

}

