package String06������ʽ����;
//������ʽ��һ�Ŷ�����ѧ��
//������ʽ��һ���ַ�ģʽ��ר�����ַ�����ʽƥ���
//������ʽ��ͨ�õ�
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("aa".matches("^a(2)$"));
		String s1="aafjlsangflaj3429580wfjsaldfnaaafljalfjaafjdlsfjn23op4";
//		��dd���ɡ�����
		System.out.println(s1.replaceAll("dd","��"));
//		��dd���ɡ�����
		System.out.println(s1.replaceAll("d(2)","��"));
//		�����ֻ��ɡ��ҡ�
		System.out.println(s1.replaceAll("\\d","��"));
//		�������ֻ��ɡ��ҡ�
		System.out.println(s1.replaceAll("\\D","��"));
		
	}

}
