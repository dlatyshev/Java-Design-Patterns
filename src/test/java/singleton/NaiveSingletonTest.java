package singleton;

import org.dmytroqa.singleton.naive.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class NaiveSingletonTest {

    @Test
    public void testUserCanCreateNaiveSingleton() {
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();

        Assert.assertSame(singletonA, singletonB);

    }
}
