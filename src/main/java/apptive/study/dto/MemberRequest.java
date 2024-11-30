package apptive.study.dto;

import jakarta.validation.constraints.NotBlank;

public record MemberRequest (
        @NotBlank
        String name,
        @NotBlank
        int price,
        @NotBlank
        int amount
)
{}
