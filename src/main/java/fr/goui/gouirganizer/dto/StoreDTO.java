package fr.goui.gouirganizer.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Data transfer object for a Store.
 */
@EqualsAndHashCode
public class StoreDTO {

    @Getter
    @Setter
    @NotNull
    private String login;

    @Getter
    @Setter
    @NotNull
    private String password;

    @Getter
    @Setter
    @NotNull
    private List<EmployeeDTO> employees;
}
