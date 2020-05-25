package String09Integer2;

public class Test {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		引用数据类型转换基本数据类型​
	    Integer i1=new Integer(10);
	    int i2=i1.intValue();
	    System.out.println(i1+3);//13
//***static int parseInt​(String s) 将字符串参数解析为带符号的十进制整数。  
	    String s="-35";
	    int i3=Integer.parseInt(s);
	    System.out.println(i3+10);
	    //int i4=Integer.parseInt("ac");里边不能是字母，必须是数字字符串
//***static double parseDouble​(String s) 将字符串参数解析为带符号的十进制整数。   
	    double d1=Double.parseDouble("3.0");
	    System.out.println(d1+10.0);
//	       将int类型十进制转成二进制
	    String i5=Integer.toBinaryString(10);
	    System.out.println(i5);
//	       将int类型十进制转成八进制
	    String i6=Integer.toHexString(10);
	    System.out.println(i6);
//	       将int类型十进制转成十六进制
	    String i7=Integer.toOctalString(10);
	    System.out.println(i7);
//	    int转Integer
	    Integer i8=Integer.valueOf(10);
	    System.out.println(i8);
//	    String转Integer
	    Integer i9=Integer.valueOf("10");
	    System.out.println(i9);
	}

}
