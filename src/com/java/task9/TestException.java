package com.java.task9;

public class TestException {
    public static void start() {
        AssetTurnover assetTurnover = new AssetTurnover();
        try {
            assetTurnover.calculation();
        } catch (LowerRevenueException e) {
            System.err.println(e.getMessage());
        } catch (InputTypeIsIncorrectException | MathematicalException e) {
            System.err.println("Проверьте данные, которые Вы ввели");
        } finally {
            System.out.println(assetTurnover);
        }
    }
}
