package de.gregord.springboot.test.spring_5_recipes.ch_2_6;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;


@Configuration
@PropertySource("classpath:ch_2_6/discounts.properties")
public class ShopConfiguration {

    @Value("${endofyear.discount:0}")
    private double specialEndofyearDiscountField;

    @Value("classpath:ch_2_6/banner.txt")
    private Resource banner;

    @Bean
    public Product dvdrw(){
        Disc dvdrw = new Disc("DVDRW", 1.0, 1000);
        dvdrw.setPrice(
                dvdrw.getPrice() + (dvdrw.getPrice() * specialEndofyearDiscountField)
        );
        return dvdrw;
    }

    @Bean
    public BannerLoader bannerloader(){
        BannerLoader bl = new BannerLoader();
        bl.setBanner(banner);
        return bl;
    }
}
