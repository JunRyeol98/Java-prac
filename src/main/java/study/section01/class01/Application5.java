package study.section01.class01;

public class Application5 {

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

        Student[] students = new Student[] {student1, student2}; //  new Student[] 코드를 지워서 더 최적화 가능

        for(int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);

        }
        for(int i = 0; i < students.length; i++) {
            Student s = students[i]; // 반복 요소를 변수에 담아서 처리하기
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
        for (Student s : students) { // 향상된 for 문 명령어 : iter
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
