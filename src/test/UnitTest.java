package src.test;
import java.util.List;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.junit.matchers.JUnitMatchers.hasItems;
import src.main.java.com.practice.generics.GenericMethod;
/**
 * @author Heena Hussain
 *
 */
public class UnitTest
{
	GenericMethod gm = new GenericMethod();
	@Test
	public void testArrayToList()
	{
		Integer[] arr  = {1,2,3};
		List<String> strList = gm.fromIntegerArrayToStringList(arr, Object::toString);
		assertThat(strList, hasItems("1", "2", "3"));

		String[] str = {"a", "b", "c"};
		List<String> stringList = gm.fromIntegerArrayToStringList(str,Object::toString);
		assertThat(stringList, hasItems("a", "b", "c"));
	}

	@Test
	public void testBoundTypeMethod()
	{
		Double[] drr  = {1.1,2.2,3.1};
		gm.boundTypeMethod(drr);

		Integer[] irr  = {1,2,3};
		gm.boundTypeMethod(irr);
	}
}
