public class HelloWorld {
    public static void main(String[] args) {
        printWords();
        int age = 33;
        String name = "Ilja";
        //System.out.println("HelloWorld" + " " + name + " Age = " + age);

    }

    public static void printWords() {
        System.out.println("acodemy cours");

        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println(doubleMaxValue);
        double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMinValue);
        int numOne = 6;
        int numTwo = 10;
        int sumNumber = Integer.compare(numOne,numTwo);
        System.out.println(sumNumber);
    }
}
