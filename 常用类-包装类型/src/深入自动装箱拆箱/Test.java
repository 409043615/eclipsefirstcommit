package 深入自动装箱拆箱;
//自动装箱拆箱是编译阶段的东西，跟运行阶段无关，主要是方便程序员编程
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
//		这里不会自动装箱
		System.out.println(i1==i2);//false
//		Integer已经将object中的equal方法重写了
		System.out.println(i1.equals(i2));//true
//		注意以下程序*****,这是为什么呢？
//		因为在-128到+127之间，会有一个int常量池，方便程序员使用
		Integer i3=127;
		Integer i4=127;
		System.out.println(i3==i4);//true
		Integer i5=-128;
		Integer i6=-128;
		System.out.println(i5==i6);//true
		Integer i7=-129;
		Integer i8=-129;
		System.out.println(i7==i8);//false
	}

}
