public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.name = "Guffy";

        System.out.println("name = " + wolfOne.name);
        System.out.println("age = " + wolfOne.age);
        wolfOne.howl();
    }
}
