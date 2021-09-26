package practis.classroom;

public class LoopPractice {
    public static void main(String[] args) {
        int sum = 5;

        for (int i = 0; i < sum; i++) {
            System.out.println(i);
        }
        int[] number = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < number.length; i++) {
            if(number[i] > 3) {
                System.out.println(number[i]);
            }else {
                System.out.println("Number is less then 4: " + number[i]);
            }
        }

        String[] names = {"ilja", "sasa", "dima", "masa"};

        for (int i = 0; i < names.length; i++) {
            if(names[i].equals("sasa") || (names[i].equals("ilja"))) {
                System.out.println("I found sasa i ilja");
            }
           // System.out.println(names[i]);
        }
        
    }

}
