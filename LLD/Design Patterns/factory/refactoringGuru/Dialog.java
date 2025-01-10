package factory.refactoringGuru;

public abstract class Dialog {

    void renderWindow(){
        Button okButton = createButton();
        okButton.onClick();
    }

    abstract Button createButton();
}
