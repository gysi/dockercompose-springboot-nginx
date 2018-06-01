package de.gregord.springboot.test.spring_5_recipes.ch_2_8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {
        Main_ch_2_8.class
})
public class ShopConfiguration {

    @Bean(
            name = "cashier_bean",
            initMethod = "openFile",
            destroyMethod = "closeFile")
    public Cashier cashier(){
        String path = System.getProperty("java.io.tmpdir") + "/cashier";
        Cashier c1 = new Cashier();
        c1.setFileName("checkout");
        c1.setPath(path);
        return c1;
    }
}
