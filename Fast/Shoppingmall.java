package Fast;
class Shopping{
	long number;
	String id;
	String date;
	String name;
	String goods;
	String addr;
	public void setSp() {
		System.out.println("�ֹ���ȣ : " + number);
		System.out.println("�ֹ��� ���̴� : " + id);
		System.out.println("�ֹ� ��¥ : " + date);
		System.out.println("�ֹ��� �̸� : " + name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + goods);
		System.out.println("��� �ּ� : " + addr);
	}
}
public class Shoppingmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping sh = new Shopping();
		sh.number = 201907210001L;
		sh.id = "abc123";
		sh.date = "2019�� 7�� 21��";
		sh.name = "ȫ���";
		sh.goods = "PD0345-12";
		sh.addr = "����� �������� ���ǵ��� 20����";
		sh.setSp();
	}

}
