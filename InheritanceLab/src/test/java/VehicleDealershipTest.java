import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleDealershipTest {

    private VehicleDealership dealership;

    @BeforeEach
    public void setUp() {
        dealership = new VehicleDealership();
    }

    @Test
    public void testSell(){
        Car car = new Car(4,5,"Motor Engine","Petrol","Road",5,10000);
        int expected = 10000;
        int actual = car.price;
        assertThat(expected).isEqualTo(actual);
        VehicleDealership.balance = VehicleDealership.balance + car.getPrice();
        assertThat(VehicleDealership.balance).isEqualTo(10000);
    }

    }

