package beverageExample;

public class TeaMaker extends beverageExample.BeverageMaker {
    @Override
    public void brew() {
        System.out.println("Stepping the Tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
