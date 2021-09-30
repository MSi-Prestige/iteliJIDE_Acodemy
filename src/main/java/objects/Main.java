package objects;

public class Main {

    public static void main(String[] args) {

        Person john = new Person("Ljuda","ljubina");
        john.setAge(33);
        john.setWeight(70.4);
        john.setHetero(true);


        Person ilja = new Person("dima","lambada");
        ilja.setAge(33);
        ilja.setWeight(70.4);
        ilja.setHetero(true);

        Person sasa = new Person("sasa", "dubov");
        sasa.setAge(33);
        sasa.setWeight(70.4);
        sasa.setHetero(true);

        john.retrieveInformation();
        ilja.retrieveInformation();
        sasa.retrieveInformation();
        System.out.println(ilja);
    }


}