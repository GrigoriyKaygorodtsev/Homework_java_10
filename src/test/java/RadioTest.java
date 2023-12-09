import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumePlus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.increaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.reduceVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
