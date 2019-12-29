
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;
import org.junit.Assert;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestClass {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();


    @Test
    public void testAppendZeros(){

        String output = StringAppendZeros.giveAppendedString("34", 10);

        Assert.assertEquals(output,"0000000034");

    }

    @Test
    public void testHexToDecimalConversion(){
        byte hexValue = 0x1F;
        String output = StringAppendZeros.convertHexToDecimal(String.valueOf(hexValue));
        Assert.assertEquals(output,"31");
    }



    @Test
    public void testHexToDecimalException() throws Exception{



        expectedEx.expect(NumberFormatException.class);
        String output = StringAppendZeros.convertHexToDecimal("xxxxx");

    }
}
