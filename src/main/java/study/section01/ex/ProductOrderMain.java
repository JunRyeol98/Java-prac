package study.section01.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        // 상품 주문 정보와 최종 금액 출력

        ProductOrder[] orders = new ProductOrder[3]; // 이부분

        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;
        orders[0] = tofu; // 이부분

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        orders[1] = kimchi;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;
        orders[2] = coke;

//        ProductOrder[] productOrders = {tofu, kimchi, coke}; // 최적화
        
        int sum = 0;
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
            sum += (orders[i].price * orders[i].quantity);
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
