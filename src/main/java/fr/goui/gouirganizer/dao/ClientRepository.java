package fr.goui.gouirganizer.dao;

import fr.goui.gouirganizer.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Data access object for the clients.
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
}
