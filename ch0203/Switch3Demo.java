package ch0203;
public class Switch3Demo {
    public static void main(String[] args) {
        whoIsIt("호랑이");
        whoIsIt("참새");
        whoIsIt("고등어");
        whoIsIt("곰팡이");
    }

    static void whoIsIt(String bio) {
        String kind = switch (bio) {                                          // String kind = "..."; switch (bio) 를 아예 합쳐버림
            case "호랑이", "사자" -> "포유류";                  // bio값이 '호랑이'이거나 '사자'이면 kind에 '포유류'를 대입한다.
            case "독수리", "참새" -> "조류";
            case "고등어", "연어" -> "어류";
            default -> {
                System.out.print("어이쿠! ");                    // 일치되는 case 레이블이 없으면 실행한다.
                yield "...";
            }
        };
        System.out.printf("%s는 %s이다.\n", bio, kind);
    }
}
