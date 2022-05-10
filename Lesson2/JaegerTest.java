public class JaegerTest {
    public static void main(String[] args) {
        //Jaeger gipsyAvenger;
        Jaeger gipsyAvenger = new Jaeger();
        gipsyAvenger.setModelName("Gipsy Avenger");
        gipsyAvenger.setMark("Mark-6");
        gipsyAvenger.setOrigin("Pab Pacific Defense Corps");
        gipsyAvenger.setHeight(81.8f);
        gipsyAvenger.setWeight(2.004f);

        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("USA");
        gipsyDanger.setHeight(79.2f);
        gipsyDanger.setWeight(1.98f);

        System.out.println(gipsyAvenger);
        System.out.println(gipsyDanger);

        gipsyDanger.drift();
        System.out.println(gipsyAvenger.scanKaiju());
        gipsyDanger.useWeapon();
        gipsyAvenger.move();
 
    }
        
}
