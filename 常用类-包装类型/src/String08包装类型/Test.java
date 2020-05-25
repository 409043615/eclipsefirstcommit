package String08包装类型;

public class Test {

//	需求：规定m1方法可以接受Java中任意一种数据类型
//	所以可以将数据类型包装成java.lang.byte等，在进行参数传递
	public static void m1(Object o){
		System.out.println(o);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		基本数据类型
		byte b=10;
//		引用数据类型
		Byte b1=new Byte(b);
//		Byte已经将toString方法重写
		m1(b1);//里边直接传b会出现错误，不过这个jdk版本不会
		long l=28;
		Long l1=new Long(l);		
		m1(l1);//里边直接传b会出现错误，不过这个jdk版本不会
	}

}
