package examples.deitel;

public class StackUnwinding {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\t\tFile\t\t\t\tLine\tMethod");

            for (StackTraceElement elemnt :
                    traceElements) {
                System.out.printf("%s\t", elemnt.getClassName());
                System.out.printf("%s\t", elemnt.getFileName());
                System.out.printf("%s\t", elemnt.getLineNumber());
                System.out.printf("%s%n", elemnt.getMethodName());
//                System.out.printf("%s%n", elemnt.isNativeMethod());
            }
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method 3");
    }
}
