package String07buffer和rbuilder;
//StringBuilder buffer和/StringBuilder builder
///StringBuilderbuffer和StringBuilderbuilder是一个字符串缓冲区
//工作原理：预先在内存中申请一块空间，容纳字符序列，
//若空间不够用，则自动扩容，以便容纳更多的字符串序列
//等等、、、、、、、、

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1=new StringBuffer();//16,括号里边可以改变容量
//		可以向StringBuffer中追加字符串
		String[] c1={"唱","跳","rap","篮球"};
//		字符串遍历,append是StringBuffer的方法
//		字符串频繁拼接使用StringBuffer或者StringBulider
		for(int i=0;i<c1.length;i++){
			if(i==c1.length-1){
				s1.append(c1[i]);
			}
			else{
				s1.append(c1[i]);
				s1.append(",");
			}							
		}
		
		System.out.println(s1);
		/*[Ljava.lang.String;@15db9742
		"[" 表示一维数组 
		"[["表示二维数组 
		"L"表示一个对象 
		"java.lang.String"表示对象的类型 
		"@"后面表示该对象的HashCode	*/	
	}

}
