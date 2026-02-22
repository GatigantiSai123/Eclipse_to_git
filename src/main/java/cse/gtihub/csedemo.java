package cse.gtihub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class csedemo {

    // Add method is missing in your code → So we add it
    public int add(int a, int b) {
        return a + b;
    }

    @Test
    void test1() {
        csedemo cal = new csedemo();
        int result = cal.add(2, 3);
        assertEquals(5, result);
    }
}