package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    private final MyLogger logger;
//    private final ObjectProvider<MyLogger> myLoggerProvider;

    public void logic(String id) {
        logger.log("service id = " + id);
//        MyLogger logger = myLoggerProvider.getObject();
    }
}
