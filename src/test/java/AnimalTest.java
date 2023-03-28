import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    @Test
    public void getFoodHerbivore() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Травоядное");
        List<String>  expectedResult = List.of("Трава", "Различные растения");
        List<String>  actualResult = animal.getFood("Травоядное");
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getFoodPredator() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Хищник");
        List<String>  expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String>  actualResult = animal.getFood("Хищник");
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getFoodException() throws Exception {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("Засранец");
        });
        String expectedResult = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        assertEquals(expectedResult, exception.getMessage());

    }
    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expectedResult, animal.getFamily());
    }

}
