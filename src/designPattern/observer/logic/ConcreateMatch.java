package designPattern.observer.logic;

import java.util.Random;

public class ConcreateMatch extends AbstractSubjectDbd {

    int hatudenki, survivorCount;
    @Override
    public int getHatsudenki() {
        return hatudenki;
    }

    @Override
    public int getSurvivorCount() {
        return survivorCount;
    }

    @Override
    public void execute() {
        hatudenki = 4;
        survivorCount = 4;
        Random rand1 = new Random();
        Random rand2 = new Random();
        while (hatudenki != 0 && survivorCount != 0) {
            int hatuden = rand1.nextInt(hatudenki);
            int survivorKill = rand1.nextInt(survivorCount);
            if (hatuden == 0) hatuden = 1;
            if (survivorKill == 0) survivorKill = 1;
            hatudenki = hatudenki - hatuden;
            survivorCount = survivorCount - survivorKill;
            super.notifyObservers();
        }
    }
}
