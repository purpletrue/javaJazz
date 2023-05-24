package ch0203;

// TODO: 2023-05-16 개발자 이유진

public class Switch2Demo {
    public static void main(String[] args) {
        whoIsIt("호랑이");
        whoIsIt("참새");
        whoIsIt("고등어");
        whoIsIt("곰팡이");
    }

    static void whoIsIt(String bio) {
        String kind = "";
        switch (bio) {
            case "호랑이":
            case "사자":
                kind = "포유류";               // bio 값이 '호랑이'이거나 '사자'이면 실행하며,
                break;                         // break 문에 의하여 switch문을 벗어난다
            case "독수리":
            case "참새":
                kind = "조류";
                break;
            case "고등어":
            case "연어":
                kind = "어류";
                break;
            default:
                System.out.print("어이쿠! ");            // bio값이 '호랑이', '사자', '독수리', '참새', '고등어',
                kind = "...";                           // '연어' 가 아니면 수행하는 실행문이다.
        }
        System.out.printf("%s는 %s이다.\n", bio, kind);
    }
}