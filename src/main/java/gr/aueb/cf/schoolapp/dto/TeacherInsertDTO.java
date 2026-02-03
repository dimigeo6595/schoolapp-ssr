package gr.aueb.cf.schoolapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record TeacherInsertDTO(

        @Size(min=2, message = "First name must be at least 2 characters")
        @NotNull(message = "First name is required")
        String firstname,

        @Size(min=2, message = "Last name must be at least 2 characters")
        @NotNull(message = "Last name is required")
        String lastname,

        @Pattern(regexp = "\\d{9,}", message = "VAT must be 9 digits")
        String vat,

        @NotNull(message = "Region is required")
        Long regionId

) {

public static TeacherInsertDTO empty(){
    return new TeacherInsertDTO("", "", "", 0L);
}

}
