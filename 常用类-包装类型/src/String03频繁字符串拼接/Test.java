package String03Ƶ���ַ���ƴ��;
//������ʹ���ַ���ƴ�ӣ���Ϊ�ַ���һ���������ɱ䣬��Ϊ��ǳ�ռ�ڴ棬���������մ����ܴ�����
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
