import com.languang.redis.RedisClient;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by 郭宁 on 2014/9/18.
 */
public class RedisTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Test
    public void test() {
        System.out.println(RedisClient.getClient().set("key","123456"));
        System.out.println(RedisClient.getClient().get("key"));
    }
}
