public class Person {
    
    boolean male = true;
    String name = "Oleg";
    float height = 1.82f;
    int age = 43;

    void go() {
        System.out.println("Иди!");
    }

    boolean sit() {
        System.out.println("Сидеть!");
    return true;
    }

    void run() {
        System.out.println("Беги!");
    }

    String talk() {
        System.out.println("Говори!");
    return "Thank you!";
    }

    void teachJava() {
        System.out.println("Учи Джаву!");
    }
    public static void main(String[] args) {
        Person Oleg = new Person();
        if (Oleg.male) {
            System.out.println("Мужчина");
        } else {
            System.out.println("Женщина");
        }
        System.out.println(Oleg.age);
        Oleg.go();
        System.out.println(Oleg.talk());
    }
}
