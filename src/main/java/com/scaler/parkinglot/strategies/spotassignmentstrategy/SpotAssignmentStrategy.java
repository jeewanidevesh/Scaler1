package main.java.com.scaler.parkinglot.strategies.spotassignmentstrategy;

import main.java.com.scaler.parkinglot.models.EntryGate;
import main.java.com.scaler.parkinglot.models.ParkingLot;
import main.java.com.scaler.parkinglot.models.ParkingSpot;
import main.java.com.scaler.parkinglot.models.SpotType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot, SpotType spotType, EntryGate entryGate);
}
