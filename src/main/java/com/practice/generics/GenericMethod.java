package src.main.java.com.practice.generics;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * @author Heena Hussain
 *
 */
public class GenericMethod
{
	/**
	 * Method to convert Integer array to Array list
	 * @param arr
	 */
  private List<Integer> fromArrayToList(Integer[] arr)
  {
  		List<Integer> arrList = Arrays.stream(arr).collect(Collectors.toList());
  		return arrList;
  }

  private <T> List<T> fromArrayToList(T[] arr)
  {
		return Arrays.stream(arr).collect(Collectors.toList());
  }

	/**
	 * One without return - void return
	 * @param arr
	 * @param <T>
	 */
  private <T> void fromArrayToListWithVoid(T[] arr)
  {
    System.out.println("");
  }

  public  <T, R> List<R> fromIntegerArrayToStringList(T[] arr, Function<T, R> mapperFunc)
  {
	return Arrays.stream(arr).map(mapperFunc).collect(Collectors.toList());
  }

  public <T extends Number> void boundTypeMethod(T[] arr)
  {
  		System.out.println("test:" + Arrays.stream(arr).collect(Collectors.toList()));
  }
}
