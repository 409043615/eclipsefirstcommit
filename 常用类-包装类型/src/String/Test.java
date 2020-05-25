package String;
//创建字符串时，在字符串常量池里会生成一份字符串，字符串常量池在主方法中
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hellow";//在字符串常量池里创建一个Hellow字符串，该字符串不可变
		String s2="Hellow";//从字符串常量池直接拿来用
		System.out.println(s1==s2);//true
//	不过比较字符串内容相等是否相等不能用==，上一条是侥幸，要用equal方法
		String s3=new String("abc");
		String s4=new String("abc");
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		String s5="Hel";
		String s6="low";
		String s7=s5+s6;//不建议用这种语句，太占缓存区空间
		System.out.println(s7);
	}

}
