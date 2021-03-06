package racinggame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racinggame.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    Car car;
    Car car2;

    @BeforeEach
    void setUp() {
        car = new Car("bongjin");
        car2 = new Car("sloth", 3);
    }

    @Test
    void 자동차_이름_확인() {
        String result = car.getName();
        assertThat(result).isEqualTo("bongjin");
    }

    @Test
    void 자동차_이동_거리_출력_확인() {
        car.move(4);
        String result = car.toString();
        assertThat(result).isEqualTo("bongjin : -");
    }

    @Test
    void 자동차_이동_거리_출력_확인_생성자_이용() {
        String result = car2.toString();
        assertThat(result).isEqualTo("sloth : ---");
    }

    @Test
    void 자동차_이동_확인() {
        car.move(4);
        boolean result = car.isMatch(1);
        assertThat(result).isEqualTo(true);
    }

    @Test
    void 자동차_정지_확인() {
        car.move(3);
        boolean result = car.isMatch(0);
        assertThat(result).isEqualTo(true);
    }
}
