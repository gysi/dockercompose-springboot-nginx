package de.gregord.springboot.test.spring_5_recipes.ch_2_8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import java.util.Date;

@Component("cashier_component")
public class CashierComponent {
    private static final Logger log = LoggerFactory.getLogger(CashierComponent.class);

    private String fileName;
    private String path;
    private BufferedWriter writer;

    public CashierComponent(){
        this.fileName = "checkout_component";
        this.path = System.getProperty("java.io.tmpdir") + "/cashier";
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @PostConstruct
    public void openFile() throws IOException {
        log.info("openFile()");

        File targetDir = new File(path);
        if (!targetDir.exists()) {
            targetDir.mkdir();
        }

        File checkoutFile = new File(path, fileName + ".txt");
        if (!checkoutFile.exists()) {
            checkoutFile.createNewFile();
        }

        writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(checkoutFile, true)
        ));
    }

    public void checkout(ShoppingCart cart) throws IOException {
        writer.write(new Date() + "\t" + cart.getItems() + "\r\n");
        writer.flush();
    }

    @PreDestroy
    public void closeFile() throws IOException{
        log.info("closeFile()");
        writer.close();
    }
}
