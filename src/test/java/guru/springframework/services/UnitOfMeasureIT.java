package guru.springframework.services;

import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.UnitOfMeasureRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureIT {

    @Autowired
    UnitOfMeasureRespository respository;

    @Test
    public void findByDescription(){
        Optional<UnitOfMeasure> unit = respository.findByDescription("Teaspoon");
        assertEquals(unit.get().getDescription(),"Teaspoon");
    }

    @Test
    public void findByDescriptionCup(){
        Optional<UnitOfMeasure> unit = respository.findByDescription("Cup");
        assertEquals(unit.get().getDescription(),"Cup");
    }
}
