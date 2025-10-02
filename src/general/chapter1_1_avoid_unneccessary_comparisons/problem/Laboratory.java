package general.chapter1_1_avoid_unneccessary_comparisons.problem;

import general.Microscope;
import general.Result;
import general.Sample;

public class Laboratory {

    Microscope microscope;

    Result analyze(Sample sample) {
        if (microscope.isInorganic(sample) == true) {
            return Result.INORGANIC;
        }else {
            return analyzeOrganic(sample);
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (!microscope.isHumanoid(sample) == false) {
            return Result.ALIEN;
        }
        else {
            return Result.HUMANOID;
        }
    }
}
