package study.section01.class01;

public class Application3 {
    /* 타입은 데이터의 종류나 형태를 나타낸다.
    * int라고 하면 정수 타입, String이라고 하면 문자 타입이다.
    * 그렇다면 학생( Student ) 이라는 타입을 만들면 되지 않을까?
    * 클래스를 사용하면 int, String 과 같은 타입을 직접 만들 수 있다.
    * 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다. 이 설계도가 바로 클래스이다.
    * 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.
    * 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.
    * */



    public static void main(String[] args) {
        Student student1; // 학생을 담아 둘 수 있는 변수 선언
        student1 = new Student(); // 학생을 실제 메모리에 생성
        // 배열에서는 []를 통해서 접근했지만, 클래스에서는 .을이용하여 멤버 변수에 접근한다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // new Student()로 생성한 객체의 참조값을 student2에 담는다.
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);

    }
}
