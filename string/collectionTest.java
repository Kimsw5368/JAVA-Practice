package string;

import java.util.*;

class Member{
	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId,String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String toString() {
		return memberName + "ȸ������ ���̵��" + memberId + "�Դϴ�.";
	}
}

public class collectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("a");
		myList.add("b");
		myList.add(1,"d");
		
		System.out.println(myList);
		for (int i=0; i<myList.size();i++) {
			String s = myList.get(i);
			System.out.println(s);
		}
	}

}
