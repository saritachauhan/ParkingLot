package repositories;

import java.util.Optional;

import models.Gate;

public interface IGateRepository {
	 Optional<Gate> findGateById(Long gateId);
}
