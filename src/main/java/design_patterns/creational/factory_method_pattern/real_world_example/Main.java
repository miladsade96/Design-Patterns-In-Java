package design_patterns.creational.factory_method_pattern.real_world_example;

public class Main {
    public static void main(String[] args) {
        // Creating a pdf document
        DocumentCreator pdfCreator = new PDFDocumentCreator();
        pdfCreator.openDocument();

        // Creating a Word document
        DocumentCreator wordCreator = new WordDocumentCreator();
        wordCreator.openDocument();

        // Creating an excel document
        DocumentCreator excelCreator = new ExcelDocumentCreator();
        excelCreator.openDocument();
    }
}
