package general.chapter1_8_ensure_code_symmetry.solution;

import general.CruiseControl;
import general.User;

import java.util.Objects;

/*
*   각 코드 블록은 서로 다른 접근 유형을 별개의 if문으로 묶어서 분리
*
* */
class BoardComputer {

    CruiseControl cruiseControl;

    void authorize(User user) {
        Objects.requireNonNull(user);
        if (user.isUnknown()) {
            cruiseControl.logUnauthorizedAccessAttempt();
            return;
        }

        if (user.isAstronaut()) {
            cruiseControl.grantAccess(user);
        } else if (user.isCommander()) {
            cruiseControl.grantAccess(user);
            cruiseControl.grantAdminAccess(user);
        }
    }
}
