package �Զ�װ�����;
//���������JDK5.0֮������֮ǰ������
//�Զ�װ�䣬�Զ�����
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		JDK5.0֮ǰ		
		Integer i1=Integer.valueOf(10);		//װ��
		int i2=i1.intValue();		//����	
//		JDK5.0֮��,�����Զ�װ�䣬�Զ�����
		Integer i5=10;
		int i6=i5;
		System.out.println(i5);
		System.out.println(i6+1);
//		����m1,m2����
		m1(521);//521
		m1("jai");//jai���Զ�װ��
		System.out.println(m2(5,6));//-1���Զ�װ��
	}
	public static void m1(Object o){
		System.out.println(o);		
	}

	public static int m2(Integer a,Integer b){ 
		return a+b;	//�Զ�����	
	}
}
