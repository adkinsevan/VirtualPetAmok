package PetShelter;

import java.util.Collection;
import java.util.Scanner;

public class PetShelterApp {
    public static void main(String[] args) {

        System.out.println("Things are getting crazy at Barely Used Pets. We need your help");

        PetShelter myShelter = new PetShelter();


        Scanner input = new Scanner(System.in);

        int randomHealth = (int) (Math.random() * 8) + 2;
        myShelter.addPet("Maya", new Dog("Maya", "The little dog with big attitude"));
        myShelter.addPet("Singer", new Cat("Singer", "The vocal cat who will not stop asking you for food"));
        myShelter.addPet("Q", new RoboDog("Q", "A mysterious metallic dog, he doesn't bark, just grunts"));
        myShelter.addPet("Tyson", new RoboCat("Tyson", "He's been rebuilt. A robotic cat. He's stronger, ans somehow, heavier"));


        System.out.println("Here are the pets in the shelter");
        System.out.println();

        Collection<PetShelterAnimals> petList = myShelter.getAllAnimals();
        for (PetShelterAnimals pet : petList) {
            System.out.println((pet.getName()) + ":" + "\n" + pet.getDescription() + "\n");
        }
        System.out.println("What would you like to work on today?" + "\n");
        System.out.println("1: Check the status of your pets");
        System.out.println("2: Give the organic animals some water");
        System.out.println("3: Give the organic animals some food");
        System.out.println("4: Clean up after the Organic Pets");
        System.out.println("5: Oil and maintain the robotic pets");
        System.out.println("6: Play with a pet");
        System.out.println("7: Take the Dogs for a walk");
        System.out.println("8: Take in new Pets");
        System.out.println("9: Help a pet get adopted");
        System.out.println("10: Go home for the day");
        String mainMenuOption = input.nextLine();
        while (!mainMenuOption.equals(10)) {
            if (mainMenuOption.equals(1)) {
                for (PetShelterAnimals pet : petList) {
                    System.out.println((pet.getName()) + " : " + pet.getHealth());
                }
            }
        }
    }
}


