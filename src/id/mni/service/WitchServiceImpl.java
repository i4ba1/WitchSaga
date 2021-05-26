package id.mni.service;

import id.mni.model.Person;

public class WitchServiceImpl implements IWitchService {
    @Override
    public int killVillager(int year) {
        int sum = 0;
        int peopleKill = 1;
        int number1 = 1;
        int number2 = 1;
        if (year <= 1){
            return 1;
        }

        for (int i = 1; i < year; i++) {
            sum = number1 + number2;
            peopleKill = peopleKill+number2;
            number1 = number2;
            number2 = sum;
        }
        return peopleKill;
    }

    @Override
    public int villagerBornOnYear(Person person) {
        if (person.getYearOfDeath() < 0 || person.getAgeOfDeath()< 0) {
            return -1;
        }
        return person.getYearOfDeath() - person.getAgeOfDeath();
    }

    @Override
    public float averageKill(int numberOfKillA, int numberOfKillB) {
        return (float)(numberOfKillA+numberOfKillB)/2;
    }
}
