package general.chapter1_5_avoid_nullpointerexception_in_conditionals.solution;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Collections;

/*
*   모든 인수에 대해 null 값 여부 확인
*   도메인에 따른 제한을 확인
*   메서드 서명 내 인수 순서에 따라 확인 -> 매개변수 유효성 검사를 적절한 순서로 수행
* */
public class Logbook {

    void writeMessage(String message, Path location) throws IOException {
        if (message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("The message is invalid!");
        }

        if (location == null || Files.isDirectory(location)) {
            throw new IllegalArgumentException("The path is invalid!");
        }

        String entry = LocalDate.now() + ": " + message;
        Files.write(location, Collections.singletonList(entry),
                StandardCharsets.UTF_8, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }
}
