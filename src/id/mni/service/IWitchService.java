package id.mni.service;

import id.mni.model.Person;

public interface IWitchService {
    int killVillager(int year);
    int villagerBornOnYear(Person person);
    float averageKill(int numberOfKillA, int numberOfKillB);
}
