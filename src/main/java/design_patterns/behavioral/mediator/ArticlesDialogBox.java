package design_patterns.behavioral.mediator;

public class ArticlesDialogBox extends DialogBox {

    private final ListBox articlesListBox = new ListBox(this);
    private final TextBox titleTextBox = new TextBox(this);
    private final Button saveButton = new Button(this);

    @Override
    public void changed(UIControl control) {
        if (control == articlesListBox) articleSelected();
        else if (control == titleTextBox) titleChanged();
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        String content = titleTextBox.getContent();
        boolean isEmpty = content == null || content.isEmpty();
        saveButton.setEnabled(!isEmpty);
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }
}
