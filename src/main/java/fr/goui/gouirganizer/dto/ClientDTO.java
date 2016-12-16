package fr.goui.gouirganizer.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Data transfer object for a Client.
 */
@EqualsAndHashCode
public class ClientDTO {

    @Getter
    @Setter
    @NotNull
    private String login;

    @Getter
    @Setter
    @NotNull
    private String password;
}
