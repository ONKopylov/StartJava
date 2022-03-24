public class VariablesTheme  {	
    public static void main(String[] args) {
        //System.out.println("Write once, run anywhere");
        int num = 12;
        float num2 = 23.45f;
        double num3 = 23.456677777777777d;
        boolean IsTrue = true;
        char Sym = 'a';
        String Str = "Hello, world!";
        //System.out.println(Str);

        //2. Вывод итоговой суммы товара со скидкой и суммы скидки
        float price1 = 100f;
        float price2 = 200f;
        int discount = 11;
        float SumIncludedDisc;
        float SumDisc;
        SumDisc = (price1 + price2)*discount/100;
        SumIncludedDisc = (price1 + price2) - SumDisc;
         System.out.println("Discount: " + SumDisc);
         System.out.println("Discounted amount: " + SumIncludedDisc);

        //3.
       // System.out.println("   J    a  v     v  a" );
        //System.out.println("   J   a a  v   v  a a");
        //System.out.println("J  J  aaaaa  V V  aaaaa");
        //System.out.println(" JJ  a     a  V  a     a");                 

    }
}