package String08��װ����;

public class Test {

//	���󣺹涨m1�������Խ���Java������һ����������
//	���Կ��Խ��������Ͱ�װ��java.lang.byte�ȣ��ڽ��в�������
	public static void m1(Object o){
		System.out.println(o);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		������������
		byte b=10;
//		������������
		Byte b1=new Byte(b);
//		Byte�Ѿ���toString������д
		m1(b1);//���ֱ�Ӵ�b����ִ��󣬲������jdk�汾����
		long l=28;
		Long l1=new Long(l);		
		m1(l1);//���ֱ�Ӵ�b����ִ��󣬲������jdk�汾����
	}

}
