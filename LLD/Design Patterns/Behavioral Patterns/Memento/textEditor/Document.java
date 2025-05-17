package textEditor;

public class Document {
    private String text;

    Document(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("Updated Document Text: " + text);
    }

    public DocumentMomento takeSnapShot(){
        return new DocumentMomento(this.text);
    }

    public void restoreMomento(DocumentMomento documentMomento){
        System.out.println("Resetting Momento Text");
        setText(documentMomento.getText());
    }
}
