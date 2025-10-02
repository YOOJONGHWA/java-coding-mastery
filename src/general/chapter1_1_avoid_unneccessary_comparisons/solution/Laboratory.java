package general.chapter1_1_avoid_unneccessary_comparisons.solution;

import general.Microscope;
import general.Result;
import general.Sample;

/*
*   불린 표현식은 비교하지 않아도 된다.
*   비교는 코드 가독성이 좋지 않음.
*
* */
public class Laboratory {

    Microscope microscope;

    Result analyze(Sample sample) {
        if (microscope.isInorganic(sample)) {
            return Result.INORGANIC;
        }else {
            return analyzeOrganic(sample);
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (!microscope.isHumanoid(sample)) {
            return Result.ALIEN;
        }
        else {
            return Result.HUMANOID;
        }
    }
}
