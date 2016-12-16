package fr.goui.gouirganizer.dto;

import fr.goui.gouirganizer.entity.Employee;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Data transfer object for a Store whithout critical info.
 */
@EqualsAndHashCode
public class StoreInfoDTO {

    @Getter
    @Setter
    @NotNull
    private String name;

    @Getter
    @Setter
    @NotNull
    private List<Employee> employees;
}
