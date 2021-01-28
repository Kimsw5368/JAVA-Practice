package string;

class Plasrict{
	public String toString(){
		return "플라스틱 입니다.";
	}
}
class Powder{
	public String toString() {
		return "파우더입니다.";
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
