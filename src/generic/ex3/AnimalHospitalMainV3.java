package generic.ex3;


import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        // Animal 외의 타입 컴파일 오류
        //AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>();
        //AnimalHospitalV3<Object> objectHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //문제1: 개 병원에 고양이 전달
        //dogHospital.set(cat); //다른 타입 입력 : 컴파일 오류

        //문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);


    }
}
