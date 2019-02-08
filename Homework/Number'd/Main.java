import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList numbers=new ArrayList();
        numbers.add("0");
        numbers.add("1");
        numbers.add("63");
        numbers.add("127");
        numbers.add("255");
        numbers.add("256");

        String num1=numbers.get(0).toString();
        String num2=numbers.get(1).toString();
        String num3=numbers.get(2).toString();
        String num4=numbers.get(3).toString();
        String num5=numbers.get(4).toString();
        String num6=numbers.get(5).toString();

        int number1=Integer.parseInt(num1);
        int number2=Integer.parseInt(num2);
        int number3=Integer.parseInt(num3);
        int number4=Integer.parseInt(num4);
        int number5=Integer.parseInt(num5);
        int number6=Integer.parseInt(num6);

        System.out.println(0+": (Binary) " + toBinary(number1) + " (Octal) "+ toOctal(number1)+ " (Hex) " + toHex(number1));
        System.out.println(1+": (Binary) " + toBinary(number2) + " (Octal) "+ toOctal(number2)+ " (Hex) " + toHex(number2));
        System.out.println(63+": (Binary) " + toBinary(number3) + " (Octal) "+ toOctal(number3)+ " (Hex) " + toHex(number3));
        System.out.println(127+": (Binary) " + toBinary(number4) + " (Octal) "+ toOctal(number4)+ " (Hex) " + toHex(number4));
        System.out.println(255+": (Binary) " + toBinary(number5) + " (Octal) "+ toOctal(number5)+ " (Hex) " + toHex(number5));
        System.out.println(256+": (Binary) " + toBinary(number6) + " (Octal) "+ toOctal(number6)+ " (Hex) " + toHex(number6));
    }

    public static String toBinary(int dec) {
        String binary="";

        for (int i=8; i>=0; i--) {
            if (dec-Math.pow(2,i)>=0) {
                binary+="1";
                dec=dec-(int)Math.pow(2,i);
            }
            else {
                binary+=0;
            }
        }
        return binary;
    }

    public static String toOctal(int dec) {
        String octal="";

        for (int i=8; i>=0; i--) {
            if (dec/(int)Math.pow(8,i)>0) {
                octal+=dec/(int)Math.pow(8,i);
                dec-=(int)Math.pow(8,i)*dec/(int)Math.pow(8,i);
            }
            else {
                octal+=0;
            }
        }
        return octal;
    }

    public static String toHex(int dec) {
        String hex="";

        for (int i=8; i>=0; i--) {
            if (dec/(int)Math.pow(16,i)>0) {
                hex+=dec/(int)Math.pow(16,i);
                dec-=(int)Math.pow(16,i)*dec/(int)Math.pow(16,i);
            }
            else {
                hex+=0;
            }
        }
        return hex;
    }
}
