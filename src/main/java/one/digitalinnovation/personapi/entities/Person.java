package one.digitalinnovation.personapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity // a classe é uma entidade
@Data // adiciona getter e setter
@Builder
@NoArgsConstructor
@AllArgsConstructor // recebe os construtores
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // vai adicionar os ids automaticamente
    private Long id;

    // nullable = false (tem campo obrigatório)
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    // unique = true (tem o valor único)
    @Column(nullable = false, unique = true)
    private String cpf;

    private LocalDate birthDate;

    // fetch = FetchType.LAZY (obtém dados), o cascade vai aparecer no persist, merge e remove
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones = new ArrayList<>();
}
