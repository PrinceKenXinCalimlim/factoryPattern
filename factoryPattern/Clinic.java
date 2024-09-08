package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(true){

        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.print("\nSelect a pet by number: ");
        int userChoice = input.nextInt();

        PetRecord petRecord = new PetRecord();
        Pet pet;

        switch(userChoice){
            case 1:
                pet = new Dog();
                petRecord.setPetId("D01");
                petRecord.setPetName("Bantay");
                petRecord.setPet(pet);
                ((Dog) pet).setBreed("German Shepherd");

                System.out.println("Pet ID: " + petRecord.getPetId());
                System.out.println("Pet Name: " + petRecord.getPetName());
                System.out.println("Pet Type: " + petRecord.getPet().getClass().getSimpleName());
                System.out.println("Sound: " + petRecord.getPet().makeSound());
                System.out.println("Activity: " + petRecord.getPet().play());
                
                System.out.println("\nBreed: " + ((Dog) pet).getBreed());
                System.out.println();
                
                break;

            case 2:
                pet = new Cat();
                petRecord.setPetId("C01");
                petRecord.setPetName("Muning");
                petRecord.setPet(pet);
                ((Cat) pet).setNoOfLives(9);

                System.out.println("Pet ID: " + petRecord.getPetId());
                System.out.println("Pet Name: " + petRecord.getPetName());
                System.out.println("Pet Type: " + petRecord.getPet().getClass().getSimpleName());
                System.out.println("Sound: " + petRecord.getPet().makeSound());
                System.out.println("Activity: " + petRecord.getPet().play());

                System.out.println("\nLives Left: " + ((Cat) pet).getNoOfLives());
                System.out.println();

                break;
                
                
            case 3:
                System.out.println("Terminating the Program.");
                System.exit(0);
                break;

                

            default:
                System.out.println("Invalid choice, please select a valid option.");
                
        }
     
    }
}
}

