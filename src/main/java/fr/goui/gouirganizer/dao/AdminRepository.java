package fr.goui.gouirganizer.dao;

import fr.goui.gouirganizer.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Data access object for the admin.
 */
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
