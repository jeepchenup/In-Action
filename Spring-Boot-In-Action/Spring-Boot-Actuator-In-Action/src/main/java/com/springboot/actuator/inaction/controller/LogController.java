package com.springboot.actuator.inaction.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 控制层
 * 通过Actuator可以控制日志输出级别，不需要重新启动服务
 *
 * @author pc.chen
 */
@RestController
@RequestMapping("/log")
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    /**
     * 展示当前日志等级可用状态
     *
     * @return
     */
    @GetMapping("/show")
    public Map<String, Boolean> showCurrentLoggerInfo() {
        Map<String, Boolean> logInfo = new HashMap<>(4);
        logInfo.put("error", logger.isErrorEnabled());
        logInfo.put("warn", logger.isWarnEnabled());
        logInfo.put("info", logger.isInfoEnabled());
        logInfo.put("debug", logger.isDebugEnabled());
        return logInfo;
    }

    @GetMapping("/print")
    public Integer print() {
        logger.debug("debug ====");
        logger.info("info ====");
        logger.warn("warn ====");
        logger.error("error ====");
        return 200;
    }
}
