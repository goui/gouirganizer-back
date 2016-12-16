package fr.goui.gouirganizer.dto;

import fr.goui.gouirganizer.entity.Act;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

/**
 * Data transfer object for an Appointment.
 */
@EqualsAndHashCode
public class AppointmentDTO {

    @Getter
    @Setter
    @NotNull
    private ZonedDateTime beginDate;

    @Getter
    @Setter
    @NotNull
    private ActDTO act;

    @Getter
    @Setter
    @NotNull
    private ClientDTO client;
}
