http://junit.sourceforge.net/doc/testinfected/testing.htm

public class MoneyTest extends TestCase {
    private Money f12CHF;
    private Money f14CHF;   

    protected void setUp() {
        f12CHF= new Money(12, "CHF");
        f14CHF= new Money(14, "CHF");
    }
}
We can rewrite the two test case methods, removing the common setup code:
public void testEquals() {
    Assert.assertTrue(!f12CHF.equals(null));
    Assert.assertEquals(f12CHF, f12CHF);
    Assert.assertEquals(f12CHF, new Money(12, "CHF"));
    Assert.assertTrue(!f12CHF.equals(f14CHF));
}
