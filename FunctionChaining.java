public class FunctionChaining {
    public static void main(String[] args) {
        A();                                // here we call function A();
        System.out.println("I'm also fine..");
    }
    static void A() {
        B();                                    // function A call B();
        System.out.println("I'm fine.., and you");
    }
    static void B() {
        C();                                   // function B call C();
        System.out.println("How are you?");
    }
    static void C() {
        D();                                   // function C call D();
        System.out.println("I'm SURAJ KUMAR");
    }
    static void D() {                          // this is the function D();
        System.out.println("Hii");
    }
}