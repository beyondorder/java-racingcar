package study.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.racingcar.domain.car.Car;
import study.racingcar.domain.car.CarName;
import study.racingcar.domain.car.CarSnapshot;
import study.racingcar.domain.car.CarSnapshotExporter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    @DisplayName("이동 성공")
    void test_move_success() {
        // Given
        Car car = initCar();

        // When
        car.move(new NewEngine());

        // Then
        assertEquals(car.getCurrentPosition(), 2);
    }

    @Test
    @DisplayName("이동 실패")
    void test_move_fail() {
        // Given
        Car car = initCar();

        // When
        car.move(new BrokenEngine());

        // Then
        assertEquals(car.getCurrentPosition(), 1);
    }

    @Test
    @DisplayName("CarSnapshot으로 Export")
    void test_export() {
        // Given
        Car car = initCar();
        car.move(new NewEngine());

        // When
        CarSnapshot carSnapshot = car.export(new CarSnapshotExporter());

        // Then
        assertEquals(carSnapshot.getCurrentPosition(), 1);
    }

    private Car initCar() {
        return new Car(new CarName("test"));
    }

}