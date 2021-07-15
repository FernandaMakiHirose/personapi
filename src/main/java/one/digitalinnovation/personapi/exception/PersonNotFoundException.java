package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// caso não encontre a pessoa com o id
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception {
    // irá aparecer essa mensagem
    public PersonNotFoundException(Long id) {
        super(String.format("Person with ID %s not found!", id));
    }
}
