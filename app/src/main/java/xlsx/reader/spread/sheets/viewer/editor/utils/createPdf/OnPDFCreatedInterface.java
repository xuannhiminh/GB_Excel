package xlsx.reader.spread.sheets.viewer.editor.utils.createPdf;

public interface OnPDFCreatedInterface {
    void onPDFCreationStarted();
    void onPDFCreated(boolean success, String path);
}
