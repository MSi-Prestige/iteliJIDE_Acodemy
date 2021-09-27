package practis.homework;

public class Discount {

    public void discountAge(int age) {
        //TASK 1.
        int sumFirstIssue = 10;
        System.out.println("Integer value is " + sumFirstIssue);
        //TASK 2.
        if (age < 17) {
            System.out.println("You are very young");
        }
        if (age >= 18 && age <= 21) {
            System.out.println("Hello you are 18-21 y.old - yours discount is 10% Happy nice day");
        }
        if (age >= 22 && age <= 40) {
            System.out.println("Hello you are 22-40 y.old - yours discount is 20% Happy nice day");
        }
        if (age >= 41 && age <= 65) {
            System.out.println("Hello you are 41-65 y.old - yours discount is 30% Happy nice day");
        } else {
            System.out.println("You are very OLD - yours discount = 50% ");
        }
    }

    // TASK 3.
    public void arrayAnimal(String animalName) {
        String[] animal = {"cat", "dog", "snake", "crocodile", "lion", "monekey", "mouse", "wolf"};

        for (int i = 0; i < animal.length; i++) {
            if (animal[i].equals(animalName)) {
                System.out.println("It's a right choice  - " + animal[i]);
            }
        }
    }

    public void arrayNumber() {
        int[] evenNumber = {1, 3, 4, 5, 7, 9, 20, 22, 30, 33, 40};
        for (int i = 0; i < evenNumber.length; i++) {
            if (evenNumber[i] == 0) {
            } else if (evenNumber[i] % 2 == 0) {
                System.out.println(evenNumber[i] + " Even number ");
            }
        }
    }

    public void transportChosen(int num) {

        switch (num) {
            case 1:
                System.out.println("By car");
                break;
            case 2:
                System.out.println("By tram");
                break;
            case 3:
                System.out.println("You go by train");
                break;
            case 4:
                System.out.println("You go by bus");
                break;
        }
    }
    public void oneHundredNum(){
        for (int i = 0; i <= 100; i++) {
            System.out.print("i = " + i + ". ");
        }
        System.out.println("next 50 num");
    }
    public void fifteeNumbers(){
        for (int i = 50; i >= 0; i--) {
            System.out.print("i = " + i + ". ");
        }
        System.out.println("");
        System.out.println("");
    }

    public void table(){
        for(int i = 1; i < 10; i++){
            for(int k = 1; k < 10; k++){
                System.out.print(k * i + "  ");
            }
            System.out.println("");
        }
    }
}
