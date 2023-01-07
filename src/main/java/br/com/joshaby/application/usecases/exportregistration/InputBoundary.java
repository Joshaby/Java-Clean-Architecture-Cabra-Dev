package br.com.joshaby.application.usecases.exportregistration;

public final class InputBoundary {

    private String registrationNumber;

    private String pdfFileName;

    private String path;

    public InputBoundary(String registrationNumber, String pdfFileName, String path) {
        this.registrationNumber = registrationNumber;
        this.pdfFileName = pdfFileName;
        this.path = path;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getPdfFileName() {
        return pdfFileName;
    }

    public String getPath() {
        return path;
    }
}
