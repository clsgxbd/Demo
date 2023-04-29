import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author damu
 * @date 2023/4/27
 */
public class Test {

    static List<VpiRewardEnum> vpiRewardList =  new ArrayList<>(Arrays.asList(VpiRewardEnum.values()));


    public static void main(String[] args) {

        System.out.println("vpiRewardList = " + vpiRewardList);
        vpiRewardList.sort((o2, o1) -> (int) (o1.getNeedLikeCount() - o2.getNeedLikeCount()));
        System.out.println("vpiRewardList = " + vpiRewardList);

    }
}
