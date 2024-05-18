package com.hmzadev.projetlocation;

import com.hmzadev.projetlocation.dao.Entities.Category;
import com.hmzadev.projetlocation.dao.Entities.Property;
import com.hmzadev.projetlocation.dao.Entities.PropertyOwner;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

@SpringBootApplication
public class ProjetLocationApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjetLocationApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        List<Property> property0 = new ArrayList<> ();
        Property property = new Property(null, null, null,"Studio", "Casablanca", "80m", "no", null, null);
        property0.add(property);
        PropertyOwner propertyOwner0 = new PropertyOwner(null, "Hamza","Ben", property0);
        property.setOwner(propertyOwner0);
    }


}
