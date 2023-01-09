package br.com.joshaby.RegistrationSystem.application.contracts;

import java.io.IOException;

public interface Storage {

    void store(String filename, String path, String content) throws IOException;
}
