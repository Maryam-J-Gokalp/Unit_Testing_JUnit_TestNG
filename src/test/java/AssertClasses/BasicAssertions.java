package AssertClasses;

import org.junit.Assert;
import org.junit.Test;
import test.Addition;
import test.Conversion;
import test.Reversion;

public class BasicAssertions {

    @Test
    public void conversionTest(){

        Conversion testObj = new Conversion();

        double temperature = 80.0;
        String unit = "";
        double result = testObj.tempConversion(temperature,unit);

        Assert.assertTrue(result == 176.0);

    }

    @Test
    public void additionTest(){
        //Given
        Addition add = new Addition();

        //When
        int first_number =12;
        int second_number=3;
        int result = add.addition(first_number,second_number);

        //Then
        Assert.assertEquals(result,15);
    }

    @Test
    public void reverseStringTest(){

        //Given
        Reversion revert = new Reversion();

        //when
        String str = "Yasin DEĞER ters döndü";
        String result = revert.reverseString(str);

        Assert.assertEquals(result,"üdnöd sret REĞED nisaY");


    }


}
