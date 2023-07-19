import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public
class CarTest {

    Car car;

    @BeforeEach
    void setUp(){
        car = new Car(4,5,"Motor Engine","Petrol","Road",5,10000);
    }

    @Test
    void canMove(){
        assertThat(car.canMove()).isEqualTo("On road");
    }

    @Test
    void canStart(){
        assertThat(car.canStart()).isEqualTo("with key");
    }

    @Test
    public void testDoors(){
        int expected = 5;
        int actual = car.numberOfDoors;
        assertThat(expected).isEqualTo(actual);

    }



}
