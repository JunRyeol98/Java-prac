package study.section01.class01;

public class Application2 {

    public static void main(String[] args) {
        // 배열의 선언 및 초기화
        String[] studentNames = { "학생1", "학생2", "학생3"};
        int[] studentAges = { 15, 16, 20 };
        int[] studentGrade = { 90, 80, 90 };

        /* 코드의 문제점
        * 학생을 추가할때 값을 일일이 하나씩 넣어주어야하며
        * 실수로 값을 바꿔넣었을때 데이터가 변하게 된다
        * 따라서 인간이 관리하기에 좋은 코드가 아니다
        */

        // 앞서 봤던 두 코드 전부 여러줄의 코드로 만들어졌을때 관리하기에는 어려운 코드이다.
        // 따라서 같은 속성 학생이라는 공통점이 있으니  학생의 이름, 나이, 성적을 학생으로 묶는 것이
        // 여러 데이터를 관리 및 유지 보수 하는데  용이하다.
        for ( int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrade[i]);
        }
    }
}
