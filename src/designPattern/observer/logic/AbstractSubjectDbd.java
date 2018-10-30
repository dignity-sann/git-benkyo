package designPattern.observer.logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

public abstract class AbstractSubjectDbd {
    private ArrayList<IObserver> observers = new ArrayList<IObserver>();
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        Iterator<IObserver> iterator = observers.iterator();
        while (iterator.hasNext()) {
            IObserver obserber = (IObserver)iterator.next();
            obserber.update(this);
        }
    }
    public abstract int getHatsudenki();
    public abstract int getSurvivorCount();
    public abstract void execute();
}
