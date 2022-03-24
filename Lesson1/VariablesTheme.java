public class VariablesTheme  {	
    public static void main(String[] args) {
        
        //1. Variable creation
        byte diskCapacity_Tb = 1;
        short diskCapacity_Gb = 1000;
        int diskCapacity_Mb = 1000000;
        long diskCapacity_Kb = 1000000000;
        float memory_Gb = 47.9f;
        double procFrequency_Ghz = 3.2d;
        char systemDisk = 'C';
        boolean pcForGame = false;
        //string Str = "Hello, world!";

        System.out.println(diskCapacity_Tb);
        System.out.println(diskCapacity_Gb);
        System.out.println(diskCapacity_Mb);
        System.out.println(diskCapacity_Kb);
        System.out.println(memory_Gb);
        System.out.println(procFrequency_Ghz);
        System.out.println(systemDisk);
        System.out.println(pcForGame);

        //2. Output Discounted amount and discount
        float price1 = 100f;
        float price2 = 200f;
        int discount = 11;
        float SumIncludedDisc;
        float SumDisc;
        SumDisc = (price1 + price2)*discount/100;
        SumIncludedDisc = (price1 + price2) - SumDisc;
         System.out.println("Discount: " + SumDisc);
         System.out.println("Discounted amount: " + SumIncludedDisc);

        //3. Output JAVA
        System.out.println("   J    a  v     v  a" );
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");                 

    }
}