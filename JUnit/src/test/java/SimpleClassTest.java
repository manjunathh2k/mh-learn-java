import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleClassTest {

    SimpleClass sclass = new SimpleClass();

    @Test
    void checkSimpleClassObj()
    {
        assertNotNull(sclass);
    }

    @Test
    void SimpleClass()
    {
      assertEquals(sclass.i,10);
      assertEquals(sclass.j,20);
    }

    @Test
    void getI() {
        assertEquals(sclass.getI(),10);
    }

    @Test
    void getJ() {
        assertEquals(sclass.getJ(),20   );
    }
}