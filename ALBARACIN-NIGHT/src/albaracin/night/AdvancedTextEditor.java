
package albaracin.night;

class AdvancedTextEditor extends TextEditor {
    private String previousText;

    public AdvancedTextEditor(String text) {
        super(text);
        previousText = text;
    }

    @Override
    public void append(String str) {
        super.append(str);
        previousText = text;
    }

    @Override
    public void delete(int index) {
        super.delete(index);
        previousText = text;
    }

    public void undo() {
        text = previousText;
    }
}