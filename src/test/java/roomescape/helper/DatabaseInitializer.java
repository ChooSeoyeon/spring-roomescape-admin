package roomescape.helper;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import roomescape.domain.Reservation;
import roomescape.domain.Time;

@Component
public class DatabaseInitializer {
    private final JdbcTemplate jdbcTemplate;
    private Reservation reservation;
    private Time time;

    public DatabaseInitializer(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void execute() {
        time = createInitTime();
        reservation = createInitReservation(time);
    }

    public Long getReservationId() {
        return reservation.getId();
    }

    public Long getTimeId() {
        return time.getId();
    }

    private Time createInitTime() {
        jdbcTemplate.update("INSERT INTO reservation_time (start_at) VALUES (?)", "10:00");
        return new Time(1L, LocalTime.of(10, 0));
    }

    private Reservation createInitReservation(Time time) {
        jdbcTemplate.update("INSERT INTO reservation (name, date, time_id) VALUES (?, ?, ?)",
                "브라운", "2023-08-05", "1");
        return new Reservation(1L, "브라운", LocalDate.of(2023, 8, 5), time);
    }
}