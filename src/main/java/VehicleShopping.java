import com.google.inject.Inject;

public class VehicleShopping {

    private Vehicle vehicle;

    @Inject
    public VehicleShopping(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void testDrive() {
        vehicle.drive();
    }
}

