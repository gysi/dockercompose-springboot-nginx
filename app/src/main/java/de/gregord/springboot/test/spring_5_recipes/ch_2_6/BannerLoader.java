package de.gregord.springboot.test.spring_5_recipes.ch_2_6;

import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BannerLoader {

    private Resource banner;

    void setBanner(Resource banner){
        this.banner = banner;
    }

    @PostConstruct
    public void showBanner() throws IOException {
        InputStream in = banner.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        while(true){
            String line = reader.readLine();
            if(line == null){
                break;
            }
            System.out.println(line);
        }
        reader.close();
    }
}
