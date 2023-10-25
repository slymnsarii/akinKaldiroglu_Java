package homework;

public class HelloTest {
    public static void main(String[] args) {
        Hello object = new Hello();



        String answer = object.sayHello("John");
        System.out.println(answer);

        answer = object.sayHello("Carole");
        System.out.println(answer);
        System.out.println("World : " + object.world);

        answer = object.sayHello("");
        System.out.println(answer);
    }
}
