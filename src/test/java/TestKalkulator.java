import org.testng.annotations.BeforeClass;

@log

public class TestKalkulator {
    private static Kalkulator obiektTestowany;

    @BeforeClass
    public static void beforeClass() throws Exception {
        obiektTestowany = new Kalkulator();
    }

    @Test
    public void test_dodaj_2_2() {
        // act / działanie
        int result = obiektTestowany.dodaj(5, 2);

        // weryfikacja / assertion
        Assert.assertEquals(7, result);
    }

    @Test
    public void test_dodaj_maxInt_2() {
        // act / działanie
        int result = obiektTestowany.dodaj(2147483647, 2);

        // weryfikacja / assertion
        Assert.assertEquals(-2147483647, result);
    }
}

