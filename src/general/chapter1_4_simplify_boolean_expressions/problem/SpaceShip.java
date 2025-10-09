package general.chapter1_4_simplify_boolean_expressions.problem;

import general.chapter1_4_simplify_boolean_expressions.*;

public class SpaceShip {

    Crew crew;
    FuelTank fuelTank;
    Hull hull;
    Navigator navigator;
    OxygenTank oxygenTank;

    boolean willCrewSurvive() {
        return hull.holes == 0 &&
                fuelTank.fuel >= navigator.requiredFuelToEarth() &&
                oxygenTank.lastsFor(crew.size) > navigator.timeToEarth();
    }
}
