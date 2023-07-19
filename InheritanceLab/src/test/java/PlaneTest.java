import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {

    Plane plane;

    @BeforeEach

    void Setup(){
         plane = new Plane(16,500,"Jet engine","Kerosene","Air",10000000,30000,500);
    }

    @Test
    void canMove(){
        assertThat(plane.canMove()).isEqualTo("In Air");
    }

    @Test
    void canStart(){
        assertThat(plane.canStart()).isEqualTo("Doesn't need a key!");
    }

    @Test
    public void testAltitude(){
        int expected = 40000;
        int actual = plane.altitude;
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void testAirspeed(){
        int expected = 500;
        int actual = plane.airspeed;
        assertThat(expected).isEqualTo(actual);
    }




}
