package String09以Integer为例讲解八种数据类型;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		获取int类型最大最小值
		System.out.println("int最大值为"+Integer. MAX_VALUE );
		System.out.println("int最大值为"+Integer.MIN_VALUE );
//		以int推byte
		System.out.println("byte最大值为"+Byte.MAX_VALUE );
		System.out.println("byte最大值为"+Byte.MIN_VALUE );
//		创建Integer​类型对象
		Integer i1=new Integer(3);//int-->Integer
		Integer i2=new Integer("22");// String-->Integer
//		这里要有一行空的，要不然程序报错，不知道为什么
		System.out.println(i1);
		System.out.println(i2);		
		//Integer i3=new Integer("csaf");//不能是字母，可以是数字字符串否则编译通过，运行异常
//		引用数据类型转换基本数据类型​
	    Integer i3=new Integer(10);
	    int in1=i3.intValue();
	    System.out.println(in1+3);//13
	}

}
