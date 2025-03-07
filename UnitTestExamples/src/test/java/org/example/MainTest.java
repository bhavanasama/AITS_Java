package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {
        @Test
        void twoPlusTwoShouldEqualFour(){
            Main m = new Main();
            assertEquals(4 , m.add(2,2));

        }
    @Test
       void threePlusSevenShouldEqualTen(){
       Main m = new Main();
       assertEquals(10 , m.add(3,7));

   }


}