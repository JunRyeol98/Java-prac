package study.section01.class01;

public class Application1 {

    public static void main(String[] args) {
        // 변수 선언 및 초기화
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        /* 코드의 문제점
        * 새로운 학생을 추가하려면
        * 새로운 학생 변수를 만들어주어야하고
        * 출력문 또한 추가해주어야한다.
        */

        System.out.println("이름: " + student1Name + " 나이: " + student1Age + " 성적: " + student1Grade);
        System.out.println("이름: " + student2Name + " 나이: " + student2Age + " 성적: " + student2Grade);
    }
}
