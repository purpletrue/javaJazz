package ch09;

public class TryCatch4Demo {
    public static void main(String[] args) {
        Reso reso = new Reso();

        try(reso) {
            reso.show();
        } catch (Exception e) {
            System.out.println("예외 처리");
        }
    }
}

class Reso implements AutoCloseable {
    void show() {
        System.out.println("자원 사용");
    }
    public void close() throws Exception {
        System.out.println("자원 닫기");
    }
}