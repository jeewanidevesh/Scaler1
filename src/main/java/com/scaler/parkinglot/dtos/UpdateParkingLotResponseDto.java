package main.java.com.scaler.parkinglot.dtos;

import main.java.com.scaler.parkinglot.models.ParkingLot;

public class UpdateParkingLotResponseDto extends ResponseDto {
    private ParkingLot parkingLot;

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
