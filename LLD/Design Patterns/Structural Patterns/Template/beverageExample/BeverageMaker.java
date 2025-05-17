package beverageExample;

public abstract class BeverageMaker {
    public final void makeBeverage(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void  brew();
    protected abstract void addCondiments();

    private void boilWater(){
        System.out.println("Boiling Water");
    }


    private void pourInCup(){
        System.out.println("Pouring Into Cup");
    }

}
