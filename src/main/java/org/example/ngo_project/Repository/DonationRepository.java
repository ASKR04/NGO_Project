package org.example.ngo_project.Repository;

import com.example.NgoApplication.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DonationRepository extends JpaRepository<Donation, Long> {
}