package id.mni;

import id.mni.model.Person;
import id.mni.service.IWitchService;
import id.mni.service.WitchServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IWitchService iWitchService = new WitchServiceImpl();
        Scanner in = new Scanner(System.in);

        System.out.print("Person A: Age of death = ");
        int personAageOfDeath = in.nextInt();
        System.out.print(", Year of death = ");
        int personAyearOfDeath = in.nextInt();

        Person personA = new Person(personAageOfDeath, personAyearOfDeath);
        int personAbornOnYear = iWitchService.villagerBornOnYear(personA) ;
        personA.setBornOnYear(personAbornOnYear);

        System.out.println("");
        System.out.print("Person B: Age of death = ");
        int personBageOfDeath = in.nextInt();
        System.out.print(", Year of death = ");
        int personByearOfDeath = in.nextInt();

        Person personB = new Person(personBageOfDeath, personByearOfDeath);
        int personBbornOnYear = iWitchService.villagerBornOnYear(personB) ;
        personB.setBornOnYear(personBbornOnYear);

        int numberKillPeopleA = iWitchService.killVillager(personA.getBornOnYear());
        int numberKillPeopleB = iWitchService.killVillager(personB.getBornOnYear());

        System.out.println("Person A born on Year= "+personAbornOnYear+" number of people killed on year "+personAbornOnYear+" is "+numberKillPeopleA);
        System.out.println("Person B born on Year= "+personBbornOnYear+" number of people killed on year "+personBbornOnYear+" is "+numberKillPeopleB);
        System.out.println("So the average is = "+iWitchService.averageKill(numberKillPeopleA, numberKillPeopleB));
    }
}
