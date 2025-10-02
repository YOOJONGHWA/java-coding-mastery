package general.chapter1_2_avoid_negations.solution;

import general.Microscope;
import general.Result;
import general.Sample;

/*
*   긍정 표현식은 부정 표현식보다 이해하기 더 쉽다.
*   부정적 메서드는 모두 제거하는 것이 가장 좋다.
*   비슷한 메서드 두개를 굳이 유지하지 않아도 됨.
* */
public class Laboratory {

    Microscope microscope;

    Result analyze(Sample sample) {
        if (microscope.isOrganic(sample)) { // isInorganic을 사용하지 않음
            return analyzeOrganic(sample);
        }else {
            return Result.INORGANIC;
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (microscope.isHumanoid(sample)) {
            return Result.HUMANOID;
        }
        else {
            return Result.ALIEN;
        }
    }
}
