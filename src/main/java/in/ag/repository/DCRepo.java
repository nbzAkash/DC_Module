package in.ag.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ag.binding.CitizenCaseDtls;

public interface DCRepo extends JpaRepository<CitizenCaseDtls, Serializable> {
	
	@Query("select distinct planName from PLAN_DTLS")
	public List<String> getPlanName();

}
