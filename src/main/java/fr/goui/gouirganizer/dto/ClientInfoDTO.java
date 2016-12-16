package fr.goui.gouirganizer.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Data transfer object for a Client without critical info.
 */
@EqualsAndHashCode
public class ClientInfoDTO {

    @Getter
    @Setter
    @NotNull
    private long id;

    @Getter
    @Setter
    @NotNull
    private String name;
}
