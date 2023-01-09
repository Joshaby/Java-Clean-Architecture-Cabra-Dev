package br.com.joshaby.RegistrationSystem.application.usecases.exportregistration;

public final class OutputBoundary {

    private String fullFileName;

    public OutputBoundary(String fullFileName) {
        this.fullFileName = fullFileName;
    }

    public String getFullFileName() {
        return fullFileName;
    }
}
