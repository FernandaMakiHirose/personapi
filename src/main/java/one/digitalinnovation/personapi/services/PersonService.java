package one.digitalinnovation.personapi.services;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.dto.mapper.PersonMapper;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entities.Person;
import one.digitalinnovation.personapi.exception.PersonNotFoundException;
import one.digitalinnovation.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service // gerencia as regras de negócio
// cria um construtor em tempo de compilação
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    // injeta o repository
    private final PersonRepository personRepository;

    // injeta o mapper
    private final PersonMapper personMapper;

    public MessageResponseDTO create(PersonDTO personDTO) {
        Person person = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(person);

        MessageResponseDTO messageResponse = createMessageResponse("Person successfully created with ID ", savedPerson.getId());

        return messageResponse;
    }

    // vai fazer a requisição de uma pessoa pelo id
    // PersonNotFoundException (é uma mensagem de exceção)
    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = personRepository.findById(id)
                // caso não ache a pessoa vai lançar a exceção
                .orElseThrow(() -> new PersonNotFoundException(id));

        // converte do mapper para dto
        return personMapper.toDTO(person);
    }

    // vai listar todos os usuários
    public List<PersonDTO> listAll() {
        List<Person> people = personRepository.findAll();
        // stream() (menipula dados de conversão)
        return people.stream()
                // converte para DTO
                .map(personMapper::toDTO)
                // retorna a lista
                .collect(Collectors.toList());
    }

    public MessageResponseDTO update(Long id, PersonDTO personDTO) throws PersonNotFoundException {
        personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));

        Person updatedPerson = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(updatedPerson);

        MessageResponseDTO messageResponse = createMessageResponse("Person successfully updated with ID ", savedPerson.getId());

        return messageResponse;
    }

    public void delete(Long id) throws PersonNotFoundException {
        // tenta achar a pessoa por id
        personRepository.findById(id)
                // se não achar lança a exceção
                .orElseThrow(() -> new PersonNotFoundException(id));

        personRepository.deleteById(id);
    }

    private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }
}
