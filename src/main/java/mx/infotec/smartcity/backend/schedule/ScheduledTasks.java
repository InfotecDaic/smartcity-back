package mx.infotec.smartcity.backend.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import mx.infotec.smartcity.backend.persistence.TokenRecoveryRepository;

@Component
public class ScheduledTasks {

    private static final Logger LOG = LoggerFactory.getLogger(ScheduledTasks.class);
    
    @Autowired
    private TokenRecoveryRepository tokenRepository;
    
    
    
    @Scheduled(cron = "0 0 * * * *")
    public void deleteToken() {
        
    }
    
}
