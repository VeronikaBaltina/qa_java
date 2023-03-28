import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    @Mock
    Feline feline;
    @Test
    public void getHasManeTrue() throws Exception {
        Lion lion = new Lion("Самец",feline);
        boolean expectedHasMane = true;
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane,actualHasMane);
    }

    @Test
    public void getHasManeFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expectedHasMane = false;
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane,actualHasMane);
    }

    @Test
    public void getHasManeException() throws Exception {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Борода", feline);
        });
        String expectedResult = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expectedResult, exception.getMessage());
    }
    @Test
    public void getKittensMock() throws Exception{
        feline.getKittens(3);
        Mockito.verify(feline).getKittens(3);

    }
    @Test
   public void getKittensTest() throws Exception{
        Lion lion = new Lion("Самец", new Feline());
        int expectedResult = 1;
        assertEquals(expectedResult, lion.getKittens());
   }

    @Test
    public void getFoodMock() throws Exception {
        feline.getFood("Хищник");
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, lion.getFood());
    }

}
