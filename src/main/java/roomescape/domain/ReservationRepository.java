package roomescape.domain;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository {
    List<Reservation> findAll();

    Optional<Reservation> findById(Long id);

    void save(Reservation reservation);

    void delete(Reservation reservation);
}
