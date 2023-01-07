package br.com.joshaby.application.usecases.exportregistration;

import java.util.Map;

public final class OutputBoundary {

    private String fullFileName;

    public OutputBoundary(String fullFileName) {
        this.fullFileName = fullFileName;
    }

    public String getFullFileName() {
        return fullFileName;
    }
}
