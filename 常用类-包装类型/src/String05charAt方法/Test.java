package String05charAt方法;
//以下方法来源于JDK=API中的string类中
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="我是网友，我是坏人";
//		第一种charAt(int index)
		char c1=s1.charAt(2);//返回指定索引处，数组第三个元素		
		System.out.println(c1);//网
		
//		第二种boolean类型，endsWith​(String suffix)方法，判断这句话是否以java结尾
		System.out.println("hellowword.java".endsWith("java"));//true
		System.out.println("hellowword.java".endsWith(".java"));//true
		System.out.println("hellowword.java".endsWith("d.java"));//true
		System.out.println("hellowword.java".endsWith("java "));//false
		System.out.println("hellowword.java".endsWith("txt"));//false
		
//		第三种equalsIgnoreCase​(String anotherString)方法，判断不考虑大小写是否字符串相等
		System.out.println("abc".equalsIgnoreCase("ABc"));//true
		
//		第四种byte[] getBytes​() ，将字符串变成相对应的数字编码
		byte[] b1="abc".getBytes() ;
		for(int i=0;i<b1.length;i++){
			System.out.println(b1[i]);
		}//97 98 99
		
//		第五种int indexOf​(String str) ，返回指定子字符串第一次出现的字符串内的索引。 
		System.out.println("nimasil.com.ri.\\j.**.oa/flsf".indexOf("oa"));//21
		
//		第六种int indexOf​(String str, int fromIndex) 返回指定子串的第一次出现的字符串中的索引，从指定的索引开始。  
		System.out.println("abc.def.ab.cd.ab.def".indexOf("ab",11));//14
		
//		第七种字符串分割String[] split​(String regex) 将此字符串拆分为给定的 regular expression的匹配。 
		String riqi="2018,10,13";
		String[] s=riqi.split(",");
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+" ");
		}//2018  10  13
//		第八种static String valueOf​(Object obj) 返回 Object参数的字符串表示形式 
		Object o=null;
		System.out.println(o);//null不会出现空指针异常，因为这个String valueOf​(Object obj) 把toString方法重写了
		System.out.println(String.valueOf(o));//null
		System.out.println(o.toString());//空指针异常
		
	}

}
