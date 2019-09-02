import com.google.inject.AbstractModule;

public class VehicleShoppingModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(Vehicle.class).to(Car.class);
        }
    }
