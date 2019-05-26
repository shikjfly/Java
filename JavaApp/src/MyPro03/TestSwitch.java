package MyPro03;

/**
 * 测试switch语句
 * 遇到多值判断的时候，使用switch，当然，switch完全可以用ifelseifelse代替
 * @author 施克箭
 */
public class TestSwitch {
    public static void main(String[] args) {
        int month = (int)(1+12*Math.random());
        System.out.println("月份：" + month);
        
        switch(month){
            case 1:
            case 2:
            case 3:
                System.out.println("这是春天");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("这是夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("这是秋天");
                break;
            default:
                System.out.println("这是冬天");
                break;
        }
        System.out.println("################");
        char c = 'a';
        int rand = (int)(26 * Math.random());
        char c2 = (char)(c + rand);
        System.out.println(c2);
        switch(c2){
            case 'a':
            case 'o':
            case 'e':
            case 'i':
            case 'u':
                System.out.println("元音");
                break;
            case 'y':
            case 'w':
                System.out.println("半元音");
                break;
            default:
                System.out.println("辅音");
        }
    }
}
