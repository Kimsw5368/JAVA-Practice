package Fast;
import java.util.*;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �����Դϴ�.");
	}
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("����� �մϴ�.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���󰩴ϴ�.");
	}
}
public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		/*Human human = (Human)hAnimal;
		human.readBooks();
		*/
		/* polymorphism test = new polymorphism();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(hAnimal); 
		*/
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
			
		}
		
		polymorphism test = new polymorphism();
		test.testDownCasting(animalList);
		
	}
	/*public void moveAnimal(Animal animal) {
		animal.move();
	 }*/
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i =0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}
		}
	}

}
