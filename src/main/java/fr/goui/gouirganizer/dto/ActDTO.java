package fr.goui.gouirganizer.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Data transfer object for an Act.
 */
@EqualsAndHashCode
public class ActDTO {

    @Getter
    @Setter
    @NotNull
    private String name;

    @Getter
    @Setter
    @NotNull
    private int duration;

    @Getter
    @Setter
    @NotNull
    private int price;
}
