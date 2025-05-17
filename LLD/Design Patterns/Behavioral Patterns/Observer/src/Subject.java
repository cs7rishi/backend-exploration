package src;
public interface Subject {
    void addListener(Observer observer);
    void removeListener(Observer observer);
    void notifyListeners();
}
