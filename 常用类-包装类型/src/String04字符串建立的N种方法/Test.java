package String04字符串建立的N种方法;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		第一种
		String s1="abc";
//		第二种
		String s2=new String("def");
//		第三种
		byte[] bytes={97,98,99,100};
		String s3=new String(bytes);
		System.out.println(s3);
//		第四种
		String s4=new String(bytes,0,3);//意思是bytes数组第0下标元素往后输出三个元素
		System.out.println(s4);
//		第五种
		char[] chars={'我','是','中','国','人'};
		String s7=new String(chars);
		System.out.println(s7);
//		第六种
		String s8=new String(chars,2,2);//意思是chars数组第2下标元素往后输出2个元素
		System.out.println(s8);
		
	}

}

