package SpotAssignmentStrategy;

import java.util.Optional;

import models.Gate;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import models.SpotStatus;
import models.VehicleType;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {
	

	 @Override
	    public Optional<ParkingSpot> findSpot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate) {
	        for (ParkingFloor parkingFloor: parkingLot.getParkingFloors()) {
	            for (ParkingSpot parkingSpot: parkingFloor.getParkingSpots()) {
	                if (parkingSpot.getSpotStatus().equals(SpotStatus.AVAILABLE) &&
	                parkingSpot.getSupportedVehicles().contains(vehicleType)) {
	                    return Optional.of(parkingSpot);
	                }
	            }
	        }

	        return Optional.empty();
	    }

}