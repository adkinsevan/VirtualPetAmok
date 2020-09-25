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
        while (!mainMenuOption.equals("10")) {
            if (mainMenuOption.equals("1")) {
                    for (PetShelterAnimals pet : petList) {
                        System.out.println((pet.getName()) + " : " + pet.getHealth());
                    }
//                System.out.println("To go back type (Go Back) to go back or type a pets name to get their full stats");
//                    String healthChoice = input.nextLine();
//                    while (!healthChoice.equalsIgnoreCase("Go Back")){
//                        for (PetShelterAnimals pet: petList){
//                            System.out.println(pet.findPet(healthChoice) + ": "  )
//                        }
//                    }
            }
            else if (mainMenuOption.equals("2")) {
                for (PetShelterAnimals organic : petList) {
                    if (organic instanceof OrganicPet) {
                        organic.giveWater();
                    }
                    myShelter.tick();
                }
            }
            else if (mainMenuOption.equals("3")){
                for (PetShelterAnimals organic : petList){
                    if (organic instanceof OrganicPet){
                        organic.feed();
                    }
                    myShelter.tick();
                }
            }
            else if (mainMenuOption.equals("4")){
                System.out.println("Would you like to clean the dog cages or the cat litter-box?" + "\n");
                System.out.println("1: Cat Litter-Box");
                System.out.println("2: Dog Cage");
                System.out.println("3 Go Back");
                String cleanMenuOption = input.nextLine();
                while (!cleanMenuOption.equals("3")) {
                    if (cleanMenuOption.equals("1")) {
//                        for (PetShelterAnimals cats : petList) {
//                            if (cats instanceof Cat) {
//                                cats.cleanLiterBox();
//                                myShelter.tick();
//                            }
//                        }
                    } else if (cleanMenuOption.equals("2")) {
//                        System.out.println("Which dog's cage would you like to clean?");
//                        for (PetShelterAnimals dogs : petList) {
//                            if (dogs instanceof Dogs) {
//                                System.out.println(dogs.getName() + "\n");
//                                String dogCleanCageOption = input.nextLine();
//                                PetShelterAnimals cleanCage = dogs.findPet(dogCleanCageOption);
//                                cleanCage.cleanCage();
//                                myShelter.tick();
//                            }
//                        }
                    } else {
                        System.out.println("Would you like to clean the dog cages or the cat litter-box?" + "\n");
                        System.out.println("1: Cat Litter-Box");
                        System.out.println("2: Dog Cage");
                        cleanMenuOption = input.nextLine();
                        }
                    }
                }
            else if(mainMenuOption.equals("5")) {
//                for (PetShelterAnimals robotic : petList){
//                    myShelter.oilAndMaintain();
//                    myShelter.tick();
//                }
                }
            else if(mainMenuOption.equals("6")){
                System.out.println("Which pet would you like to play with?");
                for(PetShelterAnimals pet : petList){
                    System.out.println(pet.getName() +"\n");
                }
                String petPlayOption = input.nextLine();
                myShelter.playWith(petPlayOption);
                System.out.println("You play with " + petPlayOption);
                myShelter.tick();
            }
        else if(mainMenuOption.equals("7")) {
//            for (PetShelterAnimals dogs : petList){
//                myShelter.walkAllDogs();
//                myShelter.tick();
//            }
            }
        else if(mainMenuOption.equals("8")){
                System.out.println("Which type of pet would you like to adopt?");
                System.out.println("1: Dog");
                System.out.println("2: Cat");
                System.out.println("3: Robot Dog");
                System.out.println("4: Robot Cat");
                System.out.println("5: Go Back");
                String petMenuChoice = input.nextLine();
                System.out.println("Please name our new pet");
                String petNameChoice = input.nextLine();
                System.out.println("Please give your pet a description");
                String petDescriptionChoice = input.nextLine();
                while (!petMenuChoice.equals("5")){
                    if (petMenuChoice.equals("1")){
                        myShelter.addPet(petNameChoice, new Dog(petNameChoice, petDescriptionChoice));
                        myShelter.tick();
                    }
                    else if (petMenuChoice.equals("2")){
                        myShelter.addPet(petNameChoice, new Cat(petNameChoice, petDescriptionChoice));
                        myShelter.tick();
                    }
                    else if (petMenuChoice.equals("3")){
                        myShelter.addPet(petNameChoice, new RoboDog(petNameChoice, petDescriptionChoice));
                        myShelter.tick();
                    }
                    else if (petMenuChoice.equals("4")){
                        myShelter.addPet(petNameChoice, new RoboCat(petNameChoice, petDescriptionChoice));
                        myShelter.tick();
                    }
                    else {
                        System.out.println("Which type of pet would you like to adopt?");
                        System.out.println("1: Dog");
                        System.out.println("2: Cat");
                        System.out.println("3: Robot Dog");
                        System.out.println("4: Robot Cat");
                        System.out.println("5: Go Back");
                        petMenuChoice = input.nextLine();
                        System.out.println("Please name our new pet");
                        petNameChoice = input.nextLine();
                        System.out.println("Please give your pet a description");
                    }
                }
            }
                else if(mainMenuOption.equals("9")){
                System.out.println("Which pet would you like to remove?");
                for (PetShelterAnimals pet : petList) {
                    System.out.println((pet.getName()) + ":" + "\n" + pet.getDescription() + "\n");
                }
                String removeOption = input.nextLine();
                myShelter.remove(removeOption);
                myShelter.tick();
            }
            System.out.println("Pleas come again soon!");
        }
    }
}


