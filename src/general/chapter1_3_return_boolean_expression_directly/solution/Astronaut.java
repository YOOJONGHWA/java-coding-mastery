package general.chapter1_3_return_boolean_expression_directly.solution;


/*
*   드 모르간의 법칙
*   !A && !B = !(A || B) 참
*   !A || !B = !(A && B) 참
*
*   조건문이 3 개 이상 합 칠때는 간소화를 고려
*   조건문 덩어리를 다른 곳에서도 써야 하면 개별 메서드에 넣는 것이 좋다.
*   반환타입이 불일 떄만 동작한다는 것을 유념
* */
public class Astronaut {

    String name;
    int missions;

    boolean isValid() {
//        return missions < 0 || name == null || name.trim().isEmpty();
        boolean isValidMissions = missions >= 0;
        boolean isValidName = name != null && !name.trim().isEmpty();
        return  isValidMissions && isValidName;
    }
}
