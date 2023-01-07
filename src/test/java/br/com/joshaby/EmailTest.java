package br.com.joshaby;

import br.com.joshaby.domain.valueobjects.Email;
import br.com.joshaby.domain.valueobjects.exceptions.EmailException;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailTest {


    @Test
    public void emailValid() {
        Email email = new Email("josWERe234@gmail.com");
        assertEquals( "josWERe234@gmail.com", email.value());
    }

    @Test
    public void emailNotValid() {
        assertThrows(EmailException.class, () -> new Email("josegmail.com"));
    }
}
