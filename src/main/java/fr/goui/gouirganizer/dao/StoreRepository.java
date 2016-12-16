package fr.goui.gouirganizer.dao;

import fr.goui.gouirganizer.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Data access object for the stores.
 */
public interface StoreRepository extends JpaRepository<Store, Long> {
}
