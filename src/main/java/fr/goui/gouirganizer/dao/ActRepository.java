package fr.goui.gouirganizer.dao;

import fr.goui.gouirganizer.entity.Act;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Data access object for the acts.
 */
public interface ActRepository extends JpaRepository<Act, Long> {
}
