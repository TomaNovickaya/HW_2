package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class ComponentPatternTest {

    @Test
    public void oneBoxTest() {
        //given
        Box box = new Box();
        box.add(new Count(10));
        box.add(new Count(3));
        box.add(new Count(2));
        //when
        int res = box.getQuantity();
        //then
        Assertions.assertEquals(15, res);
    }

    @Test
    public void complexBoxTest() {
        //given
        Box boxFirstLevel = new Box();
        Box boxNextLevelOne = new Box();
        Box boxNextLevelTwo = new Box();

        boxFirstLevel.add(boxNextLevelOne);
        boxFirstLevel.add(boxNextLevelTwo);

        boxNextLevelOne.add(new Count(1));
        boxNextLevelOne.add(new Count(1));
        boxNextLevelOne.add(new Count(1));

        boxNextLevelTwo.add(new Count(8));
        boxNextLevelTwo.add(new Count(5));
        boxNextLevelTwo.add(new Count(4));
        //when
        int res = boxFirstLevel.getQuantity();
        //then
        Assertions.assertEquals(20, res);
    }

}
