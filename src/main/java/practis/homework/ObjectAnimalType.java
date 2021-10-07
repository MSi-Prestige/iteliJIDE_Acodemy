package practis.homework;

public class ObjectAnimalType {

    public static void main(String[] args) {


        Animal cat = new Animal(4,"Cat","Silver",6);
        Animal dog = new Animal(13,"DOG","PIRAT",20);
        Animal pig = new Animal(6,"PIG","ZOTJKA",50);
        Animal chicken = new Animal(3,"Chicken","Froska",6);
        Animal rat = new Animal(2,"Rat","Ratatue",1);
        Animal tiger = new Animal(10,"Tiger","Pumba",80);




        //Methods RUN:
        //DOG
        dog.animalInformation();
       // dog.setWalking(true);
        //dog.setWalking(true);
        //dog.setWalking(true);
        dog.setHangry(true);
        dog.setWalking(true);
        dog.setWalking(true);
        dog.setWalking(true);

        // dog.setHangry(false);
       // dog.setHangry(false);

        dog.animalInformation();


        System.out.println("-----------------------");
        //CAT


    }


}
