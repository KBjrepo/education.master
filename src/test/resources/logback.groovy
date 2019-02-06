import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.filter.ThresholdFilter

final String LOG_PATTERN = "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"

appender("STDOUT", ConsoleAppender) {
    filter(ThresholdFilter) {
        level = INFO
    }
    encoder(PatternLayoutEncoder) {
        pattern = LOG_PATTERN
    }
}

//appender("FILE", FileAppender) {
//    file = "c:\\EDU\\Homework\\info.txt"
//    filter(ThresholdFilter) {
//        level = INFO
//    }
//    encoder(PatternLayoutEncoder) {
//        pattern = LOG_PATTERN
//    }
//}

root(INFO, ["STDOUT","FILE"])
