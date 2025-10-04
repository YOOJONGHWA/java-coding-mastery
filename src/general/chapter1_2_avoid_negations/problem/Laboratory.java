package general.chapter1_2_avoid_negations.problem;

import general.Microscope;
import general.Result;
import general.Sample;


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
