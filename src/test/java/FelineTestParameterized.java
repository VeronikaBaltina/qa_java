import com.example.Feline;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineTestParameterized {
    private final int expectedResult;
    private final int actualResult;
    Feline feline = new Feline();

    public FelineTestParameterized (int expectedResult, int numberOfKittens) {
        this.expectedResult = expectedResult;
        actualResult = numberOfKittens;
    }
    @Parameterized.Parameters  (name = "Тестовые данные: {0}, {1}")
    public static Object[][] testValues() {
        return new Object[][]{
                {1, 1},
                {2, 2},
                {100, 100},
        };
    }
    @Test
    public void testGetKittens () {
        assertEquals("Количество котят не совпадает",
                expectedResult, feline.getKittens(actualResult));
    }
}