package dev.engripaye.customersmsschedular.scheduler;


import dev.engripaye.customersmsschedular.service.GoogleSheetService;
import dev.engripaye.customersmsschedular.service.SmsService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CustomerSmsScheduler {

    private final GoogleSheetService sheetService;
    private final SmsService smsService;

    public CustomerSmsScheduler(GoogleSheetService sheetService, SmsService smsService) {
        this.sheetService = sheetService;
        this.smsService = smsService;
    }

    // Runs every day at 10 PM
    @Scheduled(cron = "0 0 22 * * ?")
    public void sendDailySms(){

    }
}
