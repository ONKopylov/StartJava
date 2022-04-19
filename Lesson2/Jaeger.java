public class Jaeger {
    
    private String modelName = "Bracer Phoenix";
    String mark = "Mark-5";
    String origin = "USA";
    float height = 70.7f;
    float weight = 2.1f;
    int speed = 3;
    int strength = 8;
    int armor = 9;

    public String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Empty string!!!");
        } else {
            this.modelName = modelName;
        }
    }

    public boolean drift() {
        System.out.println("You are in drift!");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов!");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {

    }
}
