package org.example.ngo_project.Repository;

import org.example.ngo_project.model.DonationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationTypeRepository extends JpaRepository<DonationType, Long> {
}
