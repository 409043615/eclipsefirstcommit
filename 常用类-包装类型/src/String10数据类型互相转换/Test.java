package String10�������ͻ���ת��;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.intתInteger
		Integer i1=Integer.valueOf(10);
		
//		2.Integerתint
		int i2=i1.intValue();
		
//		3.String����תInteger
		Integer i3=Integer.valueOf("10");
		
//		4.IntegerתString
		String i4=i3.toString();
		
//		5.Stringתint
		int i5=Integer.parseInt("34");
		
//		6.intתString
		String i6=10+"";//����һ���ַ�������
	}

}
