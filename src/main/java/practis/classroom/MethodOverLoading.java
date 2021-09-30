package practis.classroom;

public class MethodOverLoading {

    public static void main(String[] args) {

        printInfo("ILJA");
        printInfo("Dima",6);
        printInfo("Tomas",4,5);

    }

    public static void printInfo(String name){
        System.out.println("Your name is : " + name );
    }

    public static void printInfo(String name, int age){
        System.out.println("Your name is : " + name );
        System.out.println("Your name is : " + name + " " + age );

    }
    public static void printInfo(String name, int age, int weight){
        System.out.println("Your name is : " + name );
        System.out.println("Your name is : " + name + " " + age + " " + weight);

    }

}
