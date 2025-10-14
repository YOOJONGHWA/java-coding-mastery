package general.chapter2_1_replace_magic_numbers_with_constant.problem;

public class CruiseControl {

    private double targetSpeedKmh;

    void setPreset(int speedPreset) {
        if (speedPreset == 2) {
            setTargetSpeedKmh(16944);
        } else if (speedPreset == 1) {
            setTargetSpeedKmh(7667);
        } else if (speedPreset == 0 ) {
            setTargetSpeedKmh(0);
        }
    }

    private void setTargetSpeedKmh(double speed) {
        targetSpeedKmh = speed;
    }
}
