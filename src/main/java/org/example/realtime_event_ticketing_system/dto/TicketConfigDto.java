package org.example.realtime_event_ticketing_system.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketConfigDto {
    @NotNull(message = "Total tickets is required")
    @Min(value = 1, message = "Total tickets must be at least 1")
    private Integer totalTickets;

    @NotNull(message = "Ticket release rate is required")
    @Min(value = 1, message = "Ticket release rate must be at least 1")
    private Integer ticketReleaseRate;

    @NotNull(message = "Customer retrieval rate is required")
    @Min(value = 1, message = "Customer retrieval rate must be at least 1")
    private Integer customerRetrievalRate;

    @NotNull(message = "Max ticket capacity is required")
    @Min(value = 1, message = "Max ticket capacity must be at least 1")
    private Integer maxTicketCapacity;

    private Integer availableTickets;
    private Integer soldTickets;

}