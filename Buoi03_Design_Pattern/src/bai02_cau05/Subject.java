package bai02_cau05;

public interface Subject {
	void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
