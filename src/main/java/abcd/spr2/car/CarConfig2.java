package abcd.spr2.car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig2 {
    @Bean
    public Person pers2()
    {
        return new Person("Petya");
    }

    @Bean
    public Car car4(){
        Car car = new Car("Лада", 160);
        car.setDriver(pers2());
        return car;
    }
}
