package az.turingacademy.module01.lesson06;

public class StringApp {
    public static void main(String[] args){

    String name1 = "Turing";
    String name2 = "TURİNG";
    String name3 = new String("TURİNG");
    String name4 = new String("Turing");
    StringBuilder stringBuilder = new StringBuilder("Turing");
    StringBuffer stringBuffer = new StringBuffer("Turing");
    name1.toUpperCase();
    /*System.out.println(name1.equals(name3));
    System.out.println(name1==(name3));
    System.out.println(name1.equalsIgnoreCase(name3));
    name1.toUpperCase();
    System.out.println(name1==name2);*/
    System.out.println(stringBuilder.equals(stringBuffer));
    System.out.println(stringBuffer.equals(stringBuffer));
    }
}
