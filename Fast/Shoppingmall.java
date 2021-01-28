package Fast;
class Shopping{
	long number;
	String id;
	String date;
	String name;
	String goods;
	String addr;
	public void setSp() {
		System.out.println("주문번호 : " + number);
		System.out.println("주문자 아이다 : " + id);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문 상품 번호 : " + goods);
		System.out.println("배송 주소 : " + addr);
	}
}
public class Shoppingmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping sh = new Shopping();
		sh.number = 201907210001L;
		sh.id = "abc123";
		sh.date = "2019년 7월 21일";
		sh.name = "홍길순";
		sh.goods = "PD0345-12";
		sh.addr = "서울시 영등포구 여의도동 20번지";
		sh.setSp();
	}

}
