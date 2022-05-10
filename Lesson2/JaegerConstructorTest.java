public class JaegerConstructorTest {
    public static void main(String[] args) {

        JaegerConstructor gipsyAvenger = new JaegerConstructor("Gipsy Avenger", "Mark-6", "Pab Pacific Defense Corps", 81.8f, 2.004f);

        JaegerConstructor gipsyDanger = new JaegerConstructor("Gipsy Danger", "Mark-3", "USA", 79.2f, 1.98f);

        // JaegerConstructor jaegerConstructor = new JaegerConstructor();
        System.out.println(gipsyAvenger);
        System.out.println(gipsyDanger);

        gipsyDanger.drift();
        System.out.println(gipsyAvenger.scanKaiju());
        gipsyDanger.useWeapon();
        gipsyAvenger.move();
 
    }
}


