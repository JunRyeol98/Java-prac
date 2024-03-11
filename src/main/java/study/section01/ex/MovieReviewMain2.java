package study.section01.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

//        reviews[0] = inception; / reviews[1] = aobutTime; 처럼 배열 0번째부터 넣어줄 수 있고
//        MovieReview[] movieReviews = new MovieReview[2]; // 배열 2개를 선언하여 초기화할 수 있다.
        MovieReview[] movieReviews = {inception, aboutTime}; // 리뷰들을 하나로 묶어서 초기화도 가능하다.

        // 영화 리뷰 정보 출력
        for (int i = 0; i < movieReviews.length; i++){
            System.out.println("영화 제목: " + movieReviews[i].title + ", 리뷰: " + movieReviews[i].review);
        }

        // for문 - 반복 요소를 변수에 담아서 처리하기
        for (int i = 0; i < movieReviews.length; i++){
            MovieReview m = movieReviews[i];
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
        // for문 - 향상된 for문 활용 단축어 : iter
        for (MovieReview m : movieReviews) {
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
//        System.out.println("영화 제목: " + inception.title + ", 리뷰: " + inception.review);
//        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
    }
}
