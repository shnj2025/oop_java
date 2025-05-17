public class oop{
    static void myMethod() {
        System.out.println("Shahanaj");
    }

    static void myMethod(String name) {
        System.out.println(name);
    }

    static void myMethod(String fname, String lname) {
        System.out.println(fname + " " + lname);
    }

    static void myMethod(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (arr[i] == 6 || arr[i] == 7) {
                continue;
            }
            if (arr[i] == 9) {
                break;
            } else {
                sum = sum + arr[i];
            }
        }
        int avg = sum / arr.length;
        System.out.println("Sum is " + sum);
        System.out.println("Avarage is " + avg);
        myMethod();
        myMethod("Shahanaj");
        myMethod("Lutfun Naher", "Shahanaj");
        myMethod(2, 3);
    }
}