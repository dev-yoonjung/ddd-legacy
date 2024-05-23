package kitchenpos.support.util.random;

public class RandomQuantityUtil {

    public static Long 랜덤한_5개_이하의_수량을_생성한다() {
        return 랜덤_수량을_생성한다(0, 5);
    }

    public static Long 랜덤한_마이너스_5개_이하의_수량을_생성한다() {
        return 랜덤_수량을_생성한다(-5, -1);
    }

    public static Long 랜덤_수량을_생성한다(int min, int max) {
        var random = Math.random();
        var value = (random * (max - min + 1)) + min;

        return Double.valueOf(value).longValue();
    }

}