package string;

class Plasrict{
	public String toString(){
		return "�ö�ƽ �Դϴ�.";
	}
}
class Powder{
	public String toString() {
		return "�Ŀ���Դϴ�.";
	}
}
class GenericPrinter<T>{
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	public String toString() {
		return material.toString();
	}
}
public class genericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);
		
		GenericPrinter<Plasrict> plasticPrinter = new GenericPrinter<Plasrict>();
		Plasrict plastic= new Plasrict();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter);
	}

}
