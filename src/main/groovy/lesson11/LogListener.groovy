package lesson11

import com.codeborne.selenide.logevents.LogEvent
import com.codeborne.selenide.logevents.LogEventListener
import groovy.util.logging.Slf4j

@Slf4j
class LogListener implements LogEventListener{
    @Override
    void onEvent(LogEvent event) {
        switch (event.status) {
            case LogEvent.EventStatus.IN_PROGRESS:
                def text = "IN PROGRESS - ${getLogText(event)}"
                log.info(text)
                break
            case LogEvent.EventStatus.PASS:
                def text = getLogText(event)
                log.info(text)
                break
            case LogEvent.EventStatus.FAIL:
                def text = "${getLogText(event)}\r\n${event.error.toString()}"
                log.error(text)
                break
        }
    }

    private static getLogText(LogEvent event) {
        "${event.element}: ${event.subject}"
    }
}
