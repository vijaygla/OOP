public class interfaceStaticMethod {
    public static void main(String[] args) {
        A.staticMethod();
    }
}


interface  A {
    // Static method in interface
    public static void staticMethod() {
        System.out.println("Static method cannot be override in interface");
    }
}

