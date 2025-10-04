package general.chapter1_3_return_boolean_expression_directly.problem;

public class Astronaut {

    String name;
    int missions;

    boolean isValid() {
        if (missions < 0 || name == null || name.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
