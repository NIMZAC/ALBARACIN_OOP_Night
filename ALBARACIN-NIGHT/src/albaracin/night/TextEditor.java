
package albaracin.night;

class TextEditor {
    protected String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public void append(String str) {
        text += str;
    }

    public void delete(int index) {
        if (index >= 0 && index < text.length()) {
            text = text.substring(0, index);
        }
    }

    public String getText() {
        return text;
    }
}
