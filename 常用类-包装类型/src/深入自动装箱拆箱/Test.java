package �����Զ�װ�����;
//�Զ�װ������Ǳ���׶εĶ����������н׶��޹أ���Ҫ�Ƿ������Ա���
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
//		���ﲻ���Զ�װ��
		System.out.println(i1==i2);//false
//		Integer�Ѿ���object�е�equal������д��
		System.out.println(i1.equals(i2));//true
//		ע�����³���*****,����Ϊʲô�أ�
//		��Ϊ��-128��+127֮�䣬����һ��int�����أ��������Աʹ��
		Integer i3=127;
		Integer i4=127;
		System.out.println(i3==i4);//true
		Integer i5=-128;
		Integer i6=-128;
		System.out.println(i5==i6);//true
		Integer i7=-129;
		Integer i8=-129;
		System.out.println(i7==i8);//false
	}

}
