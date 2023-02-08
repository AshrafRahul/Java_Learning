public class Number_conversion {
    public static void main(String[] args) {

        //binary to decimal
        String binary = "1010101010101010101010101010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);

        //octal to deciaml
        String octal = "5471424567";
        Integer decimal2 = Integer.parseInt(octal, 8);
        System.out.println(decimal2);
        

        //Hexadecimal to decimal
        String hexa = "58978747";
        Integer decimal3 = Integer.parseInt(hexa, 16);
        System.out.println(decimal3);
        

        //decimal to binary
        int decimal_1 = 2541;
        String binary_1 = Integer.toBinaryString(decimal_1);
        System.out.println(binary_1);

        //decimal to octal
        int decimal_2 = 2541;
        String octal_1 = Integer.toOctalString(decimal_2);
        System.out.println(octal_1);

        //decimal to Hexadecimal
        int decimal_3 = 2541;
        String hexa_1 = Integer.toHexString(decimal_3);
        System.out.println(hexa_1);

        
    }
}
