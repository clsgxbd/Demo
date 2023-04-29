/**
 * vip奖励
 */
public enum VpiRewardEnum {

    /**
     * 来音钢琴 基础奖励    15天vip   发小红书
     */
    PIANO_BASIC_REWARD("15天vip", 0, 15, 0, 0),

    /**
     * 来音钢琴 进阶奖励1   2个月vip   点赞量>100
     */
    PIANO_ADVANCED_REWARD_ONE("2个月vip", 100, 0, 2, 0),
    
    /**
     * 来音钢琴 进阶奖励2   3个月vip   点赞量>300
     */
    PIANO_ADVANCED_REWARD_TWO("3个月vip", 300, 0, 3, 0),

    /**
     * 来音钢琴 进阶奖励3   1年vip    点赞量>1000
     */
    PIANO_ADVANCED_REWARD_THREE("1年vip", 1000, 0, 0, 1),

    /**
     * 来音吉他
     */

    /**
     * 智能陪练
     */

    /**
     * 时刻守护
     */

    ;

    /**
     * 奖励名称
     */
    String rewardMsg;

    /**
     * 需要的点赞数
     */
    private long needLikeCount;

    /**
     * vip 天数
     */
    private int vipDay;

    /**
     * vip 月数
     */
    private int vipMonth;

    /**
     * vip 年数
     */
    private int vipYear;

    VpiRewardEnum(String rewardMsg, long needLikeCount, int vipDay, int vipMonth, int vipYear) {
        this.rewardMsg = rewardMsg;
        this.needLikeCount = needLikeCount;
        this.vipDay = vipDay;
        this.vipMonth = vipMonth;
        this.vipYear = vipYear;
    }

    public String getRewardMsg() {
        return rewardMsg;
    }

    public long getNeedLikeCount() {
        return needLikeCount;
    }


    public int getVipDay() {
        return vipDay;
    }

    public int getVipMonth() {
        return vipMonth;
    }

    public int getVipYear() {
        return vipYear;
    }
}