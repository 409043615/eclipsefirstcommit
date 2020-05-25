package String10数据类型互相转换;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.int转Integer
		Integer i1=Integer.valueOf(10);
		
//		2.Integer转int
		int i2=i1.intValue();
		
//		3.String类型转Integer
		Integer i3=Integer.valueOf("10");
		
//		4.Integer转String
		String i4=i3.toString();
		
//		5.String转int
		int i5=Integer.parseInt("34");
		
//		6.int转String
		String i6=10+"";//这是一个字符串连接
	}

}
