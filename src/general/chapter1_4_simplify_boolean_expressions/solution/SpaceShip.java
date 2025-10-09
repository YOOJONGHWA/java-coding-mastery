package general.chapter1_4_simplify_boolean_expressions.solution;

import general.chapter1_4_simplify_boolean_expressions.*;

public class SpaceShip {

    Crew crew;
    FuelTank fuelTank;
    Hull hull;
    Navigator navigator;
    OxygenTank oxygenTank;

    boolean willCrewSurvive() {
        boolean hasEnoughResources = hasEnoughFuel() && hasEnoughOxygen();
        return hull.isIntact() && hasEnoughResources;
    }

    private boolean hasEnoughFuel() {
        return fuelTank.fuel >= navigator.requiredFuelToEarth();
    }

    private boolean hasEnoughOxygen() {
        return  oxygenTank.lastsFor(crew.size) > navigator.timeToEarth();
    }
}
