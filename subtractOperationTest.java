package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class addOperationTest {
private final addOperation addOperation = new addOperation();

@Test
public void testCalculerNombresPositifs() {
assertEquals(5.0, addOperation.calculer(2.0, 3.0), 0.0001);
}
}
