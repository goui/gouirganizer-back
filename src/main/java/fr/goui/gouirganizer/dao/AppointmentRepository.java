package fr.goui.gouirganizer.dao;

import fr.goui.gouirganizer.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Data access object for the appointments.
 */
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
