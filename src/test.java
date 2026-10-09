import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {

    @Test
    public void testwordCount(){
        conunter conunter = new conunter();
        conunter.add("hej jag heter fanny");
        int actual = conunter.getList();
        assertEquals(4, actual);
    }
    @Test
    public void testRowCount(){
        conunter conunter = new conunter();
        conunter.add("hej jag heter fanny");
        int actual = conunter.getRow();
        assertEquals(1, actual);
    }
}
