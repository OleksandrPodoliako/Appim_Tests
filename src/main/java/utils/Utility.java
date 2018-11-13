package utils;

import java.util.concurrent.ThreadLocalRandom;

public final class Utility {

    public static int transformNumberToButtonIndex(int number) {
        int buttonIndex;
        switch (number) {
            case 1:
                buttonIndex = 6;
                break;
            case 2:
                buttonIndex = 7;
                break;
            case 3:
                buttonIndex = 8;
                break;
            case 4:
                buttonIndex = 3;
                break;
            case 5:
                buttonIndex = 4;
                break;
            case 6:
                buttonIndex = 5;
                break;
            case 7:
                buttonIndex = 0;
                break;
            case 8:
                buttonIndex = 1;
                break;
            case 9:
                buttonIndex = 2;
                break;
            case 0:
                buttonIndex = 9;
                break;
            default:
                buttonIndex = 10;
                break;
        }
        return buttonIndex;
    }

    public static int randomNumber(){
        return ThreadLocalRandom.current().nextInt(1, 9 + 1);
    }
}
