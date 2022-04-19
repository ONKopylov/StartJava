public class JaegerTest {
    public static void main(String[] args) {
        //Jaeger jaegerOne;
        Jaeger jaegerOne = new Jaeger();
        System.out.println("modelName = " + jaegerOne.getModelName());
        jaegerOne.setModelName("Java");
        System.out.println("modelName = " + jaegerOne.getModelName());
        /*System.out.println("mark = " + jaegerOne.mark);
        System.out.println("speed = " + jaegerOne.speed);
        System.out.println(jaegerOne.drift());*/
    }
        
}
