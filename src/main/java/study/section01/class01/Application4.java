package study.section01.class01;

public class Application4 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 학생을 실제 메모리에 생성
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // new Student()로 생성한 객체의 참조값을 student2에 담는다.
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);

    }
}
