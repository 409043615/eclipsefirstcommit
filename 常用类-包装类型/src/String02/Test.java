package String02;
//String s1="abc"这种方式只会在字符串常量池里创建一个abc字符串
//String s2=new String("def")会在字符串常量池里创建一个def字符串,也会在堆中创建一个def字符串
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abc";
		String s2=new String("def");
		/*这两条语句创建了三个对象，堆中两个，常量池中一个，所以不建议使用new String,占内存
		String s3=new String("hellow");
		String s4=new String("hellow");*/
	}

}
