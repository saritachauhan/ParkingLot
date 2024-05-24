package repositories;

import java.util.Optional;

import models.Gate;

public class MySQLGateRepository implements IGateRepository {

    @Override
    public Optional<Gate> findGateById(Long gateId) {
        return Optional.empty();
    }
}