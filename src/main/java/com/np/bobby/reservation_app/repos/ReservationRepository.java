package com.np.bobby.reservation_app.repos;

import com.np.bobby.reservation_app.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
