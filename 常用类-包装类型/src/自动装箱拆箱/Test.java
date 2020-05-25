package 自动装箱拆箱;
//这是针对于JDK5.0之后，在这之前都不行
//自动装箱，自动拆箱
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		JDK5.0之前		
		Integer i1=Integer.valueOf(10);		//装箱
		int i2=i1.intValue();		//拆箱	
//		JDK5.0之后,可以自动装箱，自动拆箱
		Integer i5=10;
		int i6=i5;
		System.out.println(i5);
		System.out.println(i6+1);
//		调用m1,m2方法
		m1(521);//521
		m1("jai");//jai，自动装箱
		System.out.println(m2(5,6));//-1，自动装箱
	}
	public static void m1(Object o){
		System.out.println(o);		
	}

	public static int m2(Integer a,Integer b){ 
		return a+b;	//自动拆箱	
	}
}
