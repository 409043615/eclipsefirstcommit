package String07buffer��rbuilder;
//StringBuilder buffer��/StringBuilder builder
///StringBuilderbuffer��StringBuilderbuilder��һ���ַ���������
//����ԭ��Ԥ�����ڴ�������һ��ռ䣬�����ַ����У�
//���ռ䲻���ã����Զ����ݣ��Ա����ɸ�����ַ�������
//�ȵȡ���������������

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1=new StringBuffer();//16,������߿��Ըı�����
//		������StringBuffer��׷���ַ���
		String[] c1={"��","��","rap","����"};
//		�ַ�������,append��StringBuffer�ķ���
//		�ַ���Ƶ��ƴ��ʹ��StringBuffer����StringBulider
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
		"[" ��ʾһά���� 
		"[["��ʾ��ά���� 
		"L"��ʾһ������ 
		"java.lang.String"��ʾ��������� 
		"@"�����ʾ�ö����HashCode	*/	
	}

}
