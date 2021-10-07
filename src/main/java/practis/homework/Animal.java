package practis.homework;

public class Animal {

    public int animalAge;
    public int weight;
    public String animalType;
    public String name;
    private boolean isSleep;
    private boolean isWalking;
    private boolean isHangry;
    private boolean isBark;
    private int chargeStamina = 10;


    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public Animal(int animalAge, String animalType, String name, int weight) {
        this.animalAge = animalAge;
        this.animalType = animalType;
        this.name = name;
        this.weight = weight;
    }

    public Animal(int animalAge, int weight, String animalType, String name, boolean isSleep, boolean isWalking, boolean isHangry, boolean isBark, int chargeStamina) {
        this.animalAge = animalAge;
        this.weight = weight;
        this.animalType = animalType;
        this.name = name;
        this.isSleep = isSleep;
        this.isWalking = isWalking;
        this.isHangry = isHangry;
        this.isBark = isBark;
        this.chargeStamina = chargeStamina;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setSleep(boolean sleep) {
        if(sleep) {
            System.out.println("I am sleep");
            chargeStamina = chargeStamina + 3;
        }else System.out.println("FALSE = I don't sleep :) ");
        isSleep = sleep;
    }


    public void setWalking(boolean walking) {
        if (walking && chargeStamina > 2) {
            System.out.println("I am walking now and lose my energy - 2");
            chargeStamina = chargeStamina - 2;
        }
        else if (walking && chargeStamina <= 2) {
             System.out.println("I need REST Enery is to low " + chargeStamina);
         }
        if (!walking) {
            System.out.println("I am not WALKING - I at home F");
        }
        isWalking = walking;
    }

    public void setHangry(boolean hangry) {
        if (hangry && chargeStamina > 5) {
            System.out.println("I am very hangry -  I lose 5 energy");
            chargeStamina = chargeStamina - 5;
        }
         else if (hangry && chargeStamina <= 5) {
                System.out.println("My energy is to LOW " + chargeStamina);
            }
            if (!hangry) {
                System.out.println("I an not HANGRY! F");
            }
            isHangry = hangry;

    }


    public void setBark(boolean bark) {
        if (bark) {
            System.out.println("I can BARK GaV GaV :D");
        }else
            System.out.println("FALSE I can't BARK :P AND  - Energy - 1 " );
        chargeStamina = chargeStamina - 1;
        isBark = bark;
    }


    public void setChargeStamina(int chargeStamina) {
        if (chargeStamina < 3) {
            System.out.println("I need sleep and eat");
        } else System.out.println("I am ok - a Have -- " + chargeStamina + " Energy");
        this.chargeStamina = chargeStamina;
    }

    public void animalInformation() {

      //  log.info("Name is: {} Surname is: {}", name , surname);
        System.out.println("Animal Type = " + animalType +  "// Name = " + name + " // Age =  " + animalAge +
                " // Weight = " + weight + " // chargeStamina = " + chargeStamina);
    }

}
