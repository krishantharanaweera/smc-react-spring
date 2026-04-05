package com.smartcampus.backend.dto;


import com.smartcampus.backend.model.Ticket.TicketCategory;
import com.smartcampus.backend.model.Ticket.TicketPriority;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketRequestDTO {

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Description is required")
    private String description;

    @NotNull(message = "Category is required")
    private TicketCategory category;

    private TicketPriority priority = TicketPriority.MEDIUM;

    @NotNull(message = "User ID is required")
    private Long userId;
}
