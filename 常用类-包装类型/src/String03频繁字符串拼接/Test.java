package String03频繁字符串拼接;
//尽量少使用字符串拼接，因为字符串一旦创建不可变，因为这非常占内存，给垃圾回收带来很大问题
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] aihao={"sport","sleep","play","run"};
		for(int i=0;i<aihao.length;i++){
			String temp="";
			if(i==aihao.length-1){
				temp+=aihao[i];
			}
			else if(i<aihao.length){
				temp+=aihao[i]+",";
			}
			System.out.print(temp);
		}
		
	}

}
