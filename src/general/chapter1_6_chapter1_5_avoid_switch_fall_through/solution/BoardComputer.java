package general.chapter1_6_chapter1_5_avoid_switch_fall_through.solution;

import java.util.Objects;

import general.CruiseControl;
import general.User;

class BoardComputer {

    CruiseControl cruiseControl;

    void authorize(User user) {
        Objects.requireNonNull(user);
        switch (user.getRank()) {
            case UNKNOWN:
                cruiseControl.logUnauthorizedAccessAttempt();
                break;
            case ASTRONAUT:
                cruiseControl.grantAccess(user);
                break;
            case COMMANDER:
                cruiseControl.grantAccess(user);
                cruiseControl.grantAdminAccess(user);
                break;
        }
    }
}
