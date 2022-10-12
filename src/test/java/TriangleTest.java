
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleTest {


    @DataProvider
    public Object[][] checkNumSides(){
        return new Object[][]{
                {TriangleDefineMethods.checkNumSides(3,4,5), TypeOfResults.VNS},
                {TriangleDefineMethods.checkNumSides(10,20,30), TypeOfResults.VNS},
                {TriangleDefineMethods.checkNumSides(3100,45000,9000), TypeOfResults.VNS},
                {TriangleDefineMethods.checkNumSides(500,77,1), TypeOfResults.VNS},
                {TriangleDefineMethods.checkNumSides(12,888,67), TypeOfResults.VNS},
                {TriangleDefineMethods.checkNumSides(0,0,0), TypeOfResults.NVN},
                {TriangleDefineMethods.checkNumSides(3,-4,5), TypeOfResults.NVN},
                {TriangleDefineMethods.checkNumSides(-100,0,223), TypeOfResults.NVN},
                {TriangleDefineMethods.checkNumSides(-10,-5,0), TypeOfResults.NVN},
                {TriangleDefineMethods.checkNumSides(0,-578,-7), TypeOfResults.NVN}
        };
    }

    @DataProvider
    public Object[][] isTriangleExists(){
        return new Object[][]{
                {TriangleDefineMethods.isTriangleExists(3,5,7), TypeOfResults.TE},
                {TriangleDefineMethods.isTriangleExists(55,77,33), TypeOfResults.TE},
                {TriangleDefineMethods.isTriangleExists(600,400,222), TypeOfResults.TE},
                {TriangleDefineMethods.isTriangleExists(0,-578,-7), TypeOfResults.TDNE},
                {TriangleDefineMethods.isTriangleExists(3,0,7), TypeOfResults.TDNE},
                {TriangleDefineMethods.isTriangleExists(5,-3,0), TypeOfResults.TDNE},
                {TriangleDefineMethods.isTriangleExists(0,0,0), TypeOfResults.TDNE},
                {TriangleDefineMethods.isTriangleExists(-1,-1,-1), TypeOfResults.TDNE},
                {TriangleDefineMethods.isTriangleExists(1,1,2), TypeOfResults.TDNE},
                {TriangleDefineMethods.isTriangleExists(1,3,4), TypeOfResults.TDNE},
                {TriangleDefineMethods.isTriangleExists(4,3,1), TypeOfResults.TDNE}
        };
    }

    @DataProvider
    public Object[][] kindOfTriangle(){
        return new Object[][]{
                {TriangleDefineMethods.kindOfTriangle(1,1,1), TypeOfResults.EQUT},
                {TriangleDefineMethods.kindOfTriangle(500,500,500), TypeOfResults.EQUT},
                {TriangleDefineMethods.kindOfTriangle(1000,1000,1000), TypeOfResults.EQUT},
                {TriangleDefineMethods.kindOfTriangle(2,2,3), TypeOfResults.ISOT},
                {TriangleDefineMethods.kindOfTriangle(357,713,357), TypeOfResults.ISOT},
                {TriangleDefineMethods.kindOfTriangle(1000,505,505), TypeOfResults.ISOT},
                {TriangleDefineMethods.kindOfTriangle(4,5,8), TypeOfResults.SCAT},
                {TriangleDefineMethods.kindOfTriangle(314,505,215),TypeOfResults.SCAT},
                {TriangleDefineMethods.kindOfTriangle(1000,900,750), TypeOfResults.SCAT},
                {TriangleDefineMethods.kindOfTriangle(1,3,4),TypeOfResults.NOTEX},
                {TriangleDefineMethods.kindOfTriangle(2,1,1), TypeOfResults.NOTEX},
                {TriangleDefineMethods.kindOfTriangle(0,-4,0), TypeOfResults.NOTEX}
        };
    }

    @DataProvider
    public Object[][] comboTest(){
        return new Object[][]{
                {TriangleDefineMethods.checkNumSides(10,20,30), TypeOfResults.VNS},
                {TriangleDefineMethods.checkNumSides(-1,0,-5), TypeOfResults.NVN},
                {TriangleDefineMethods.isTriangleExists(3,4,5), TypeOfResults.TE},
                {TriangleDefineMethods.isTriangleExists(-100,0,0), TypeOfResults.TDNE},
                {TriangleDefineMethods.kindOfTriangle(8000,8000,8000), TypeOfResults.EQUT},
                {TriangleDefineMethods.kindOfTriangle(300,500,300), TypeOfResults.ISOT},
                {TriangleDefineMethods.kindOfTriangle(900,800,652), TypeOfResults.SCAT},
                {TriangleDefineMethods.kindOfTriangle(0,0,-1), TypeOfResults.NOTEX}
        };
    }




    @Test(dataProvider = "checkNumSides")
    public void validCheckSideNums(String expectedResult, String actualResult){
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "isTriangleExists")
    public void validIsTriangleExists(String expectedResult, String actualResult){
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "kindOfTriangle")
    public void validKindOfTriangle(String expectedResult, String actualResult){
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "comboTest")
    public void comboTest(String expectedResult, String actualResult){
        Assert.assertEquals(actualResult, expectedResult);
    }

}
