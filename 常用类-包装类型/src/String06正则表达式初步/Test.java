package String06正则表达式初步;
//正则表达式是一门独立的学科
//正则表达式是一种字符模式，专门做字符串格式匹配的
//正则表达式是通用的
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("aa".matches("^a(2)$"));
		String s1="aafjlsangflaj3429580wfjsaldfnaaafljalfjaafjdlsfjn23op4";
//		将dd换成‘爱’
		System.out.println(s1.replaceAll("dd","爱"));
//		将dd换成‘爱’
		System.out.println(s1.replaceAll("d(2)","爱"));
//		将数字换成‘我’
		System.out.println(s1.replaceAll("\\d","我"));
//		将非数字换成‘我’
		System.out.println(s1.replaceAll("\\D","你"));
		
	}

}
