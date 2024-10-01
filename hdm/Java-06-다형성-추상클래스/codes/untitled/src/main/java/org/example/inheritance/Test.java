package org.example.inheritance;

public class Test {
    public static void main(String[] args) {

//    	Animal ani = new Animal();
    	// 추상 메서드가 없더라도
    	// abstract 키워드가 붙어있으면 추상 클래스이고
    	// 객체 생성이 불가능하다.
    	
    	Animal[] animals = new Animal[3];
		// 객체를 만드는게 아니라 배열을 만드는 것임.
		// Animal 객체생성 x
		// 배열 객체를 생성하는것임.
    	
		animals[0] = new Cat("Luna", 3);
		animals[1] = new Dog("Max", 4);
		animals[2] = new Cow("Daisy", 2);
		
		for(Animal animal : animals) {
			animal.eat();
			animal.speak();
			// 추상 메서드로 선언하게 되면
			// Animal 타입으로 참조했을 때
			// 해당 메서드가 목록에 보임
			// => 실행될 때는 실제 자식 클래스에서 오버라이드한
			//    메서드가 실행.
		}
		// 추상 클래스
		// - 추상 메서드를 가질 수 있는 클래스
		// - 객체 생성이 불가
		// - 추상 메서드를 자식 클래스에서 오버라이드 하지 않으면
		//   자식 클래스도 추상 클래스가 되어야 한다.


		// 상속을 통해서 (다형성을 통해서)
		// 코드의 중복을 줄여봤으나..
		// 상속 이후에 쓰이지 않는 코드가 있다. (animal의 speak는 안쓰임.)
		
		
    }
}
