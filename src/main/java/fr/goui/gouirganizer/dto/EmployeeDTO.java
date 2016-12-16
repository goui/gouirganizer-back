package fr.goui.gouirganizer.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Data transfer object for an Employee.
 */
@EqualsAndHashCode
public class EmployeeDTO {

    @Getter
    @Setter
    @NotNull
    private String name;

    @Getter
    @Setter
    @NotNull
    private boolean isAManager;

    @Getter
    @Setter
    @NotNull
    private List<AppointmentDTO> appointments;
}
