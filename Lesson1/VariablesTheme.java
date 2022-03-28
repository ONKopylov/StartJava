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

        System.out.println("1. Variable creation:");
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
        System.out.println("2. Output Discounted amount and discount");
        System.out.println("Discount: " + SumDisc);
        System.out.println("Discounted amount: " + SumIncludedDisc);

        //3. Output JAVA
        System.out.println("3. Output JAVA");
        System.out.println("   J    a  v     v  a" );
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");                 

        //4. Min & Max value of primitive type
        System.out.println("4. Min & Max value of primitive type");
        System.out.println("Maximum of Byte: " + Byte.MAX_VALUE);
        System.out.println("Minimum of Byte: " + Byte.MIN_VALUE);
        System.out.println("Maximum of Byte + 1: " + (Byte.MAX_VALUE + 1));
        System.out.println("Minimum of Byte - 1: " + (Byte.MIN_VALUE - 1));
        
        System.out.println("Maximum of Short: " + Short.MAX_VALUE);
        System.out.println("Minimum of Short: " + Short.MIN_VALUE);
        System.out.println("Maximum of Short + 1: " + (Short.MAX_VALUE + 1));
        System.out.println("Minimum of Short - 1: " + (Short.MIN_VALUE - 1));

        System.out.println("Maximum of int: " + Integer.MAX_VALUE);
        System.out.println("Minimum of int: " + Integer.MIN_VALUE);
        System.out.println("Maximum of int + 1: " + (Integer.MAX_VALUE + 1));
        System.out.println("Minimum of int - 1: " + (Integer.MIN_VALUE - 1));

        System.out.println("Maximum of long: " + Long.MAX_VALUE);
        System.out.println("Minimum of long: " + Long.MIN_VALUE);
        System.out.println("Maximum of long + 1: " + (Long.MAX_VALUE + 1));
        System.out.println("Minimum of long - 1: " + (Long.MIN_VALUE - 1));

        System.out.println("Maximum of Float: " + Float.MAX_VALUE);
        System.out.println("Minimum of Float: " + Float.MIN_VALUE);
        System.out.println("Maximum of Float + 1: " + (Float.MAX_VALUE + 1));
        System.out.println("Minimum of Float - 1: " + (Float.MIN_VALUE - 1));

        System.out.println("Maximum of Double: " + Double.MAX_VALUE);
        System.out.println("Minimum of Double: " + Double.MIN_VALUE);
        System.out.println("Maximum of Double + 1: " + (Double.MAX_VALUE + 1));
        System.out.println("Minimum of Double - 1: " + (Double.MIN_VALUE - 1));
 
        //5. Permutation of the values
        float pi = 3.141592653589793238462f;
        float e =  2.718281828459045235360f;
        float buffer;

        System.out.println("5. Permutation of the values");
        System.out.println("pi: " + pi);
        System.out.println("e: " + e);

        buffer = pi;
        pi = e;
        e = buffer;

        System.out.println("pi after permutation: " + pi);
        System.out.println("e after permetation: " + e);

        //6. Output symbols
        int code_35 = 35;
        int code_38 = 38;
        int code_64 = 64;
        int code_94 = 94;
        int code_95 = 95;

        System.out.println("6. Output symbols");
        System.out.println("Symbol with ASCII 35: " + (char)code_35);
        System.out.println("Symbol with ASCII 38: " + (char)code_38);
        System.out.println("Symbol with ASCII 64: " + (char)code_64);
        System.out.println("Symbol with ASCII 94: " + (char)code_94);
        System.out.println("Symbol with ASCII 95: " + (char)code_95);

        //7. Sum and product of numbers
        int s = 345;
        int hundreds = s/100;
        int tens = (s - 100*hundreds)/10;
        int units = (s - 100*hundreds - 10*tens);

        System.out.println("7. Sum and product of numbers");
        System.out.println(hundreds + tens + units);
        System.out.println(hundreds * tens * units);

        //8. Output ASCII-art
        char spaceBar = (char)32;
        char ch1 = (char)47;//"/"
        char ch2 = (char)92;//"\"
        char underline = (char)95;
        char openingBrace= (char)40;
        char closingBrace= (char)41;

        System.out.println("8. Output ASCII-art");
        System.out.println(String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(ch1) 
                            + String.valueOf(ch2) + String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(spaceBar));
        System.out.println(String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(ch1) + String.valueOf(spaceBar) 
                            + String.valueOf(spaceBar) + String.valueOf(ch2) + String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(spaceBar));
        System.out.println(String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(ch1) + String.valueOf(underline) + String.valueOf(openingBrace) 
                            + String.valueOf(spaceBar) + String.valueOf(closingBrace) + String.valueOf(ch2) + String.valueOf(spaceBar) + String.valueOf(spaceBar));
        System.out.println(String.valueOf(spaceBar) + String.valueOf(ch1) + String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(spaceBar) 
                            + String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(spaceBar) + String.valueOf(ch2) + String.valueOf(spaceBar));
        System.out.println(String.valueOf(ch1) + String.valueOf(underline) + String.valueOf(underline) + String.valueOf(underline) + String.valueOf(underline) 
                            + String.valueOf(ch1) + String.valueOf(ch2) + String.valueOf(underline) + String.valueOf(underline) + String.valueOf(ch2));

        //9. Output number of hundreds, tens and units
        int m = 123;
        int hundreds1 = m/100;
        int tens1 = (m - 100*hundreds1)/10;
        int units1 = (m - 100*hundreds1 - 10*tens1);

        System.out.println("9. Output number of hundreds, tens and units");
        System.out.println("Number of hundreds: " + hundreds1);
        System.out.println("Number of tens: " + tens1);
        System.out.println("Number of units: " + units1);

        //10. Seconds conversion
        int sec = 86399;
        int hh = 86399/3600;
        int mm = (86399%3600)/60;
        int ss = (86399%3600)%60;

        System.out.println("9. Output number of hundreds, tens and units");
        System.out.println("HH:MM:SS: " + hh + ":" + mm + ":" + ss);
    }
}