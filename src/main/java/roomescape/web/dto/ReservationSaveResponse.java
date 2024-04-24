package roomescape.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import roomescape.domain.Reservation;
import roomescape.domain.Time;

public record ReservationSaveResponse(
        Long id,
        String name,
        LocalDate date,
        TimeDto time) {
    public static ReservationSaveResponse from(Reservation reservation) {
        return new ReservationSaveResponse(
                reservation.getId(),
                reservation.getName(),
                reservation.getDate(),
                TimeDto.from(reservation.getTime())
        );
    }

    private record TimeDto(Long id, @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm") LocalTime startAt) {
        private static TimeDto from(Time time) {
            return new TimeDto(
                    time.getId(),
                    time.getStartAt()
            );
        }
    }
}
