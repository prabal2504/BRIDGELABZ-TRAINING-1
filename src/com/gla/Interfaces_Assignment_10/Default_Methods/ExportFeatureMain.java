package com.gla.Interfaces_Assignment_10.Default_Methods;

interface DataExporter {

    void exportCSV();
    void exportPDF();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON");
    }
}

class Report implements DataExporter {

    public void exportCSV() {
        System.out.println("Export CSV");
    }

    public void exportPDF() {
        System.out.println("Export PDF");
    }
}

public class ExportFeatureMain {
    public static void main(String[] args) {
        Report r = new Report();
        r.exportCSV();
        r.exportPDF();
        r.exportToJSON();
    }
}