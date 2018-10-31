package io.lamar.chucknorrisjokes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ChucksScheduledTask {
    private  static  final Logger log = LoggerFactory.getLogger(ChucksScheduledTask.class);

    @Scheduled(fixedRate = 5000)
    public void getNewJoke(){

        RestTemplate restTemplate = new RestTemplate();
        Joke quote = restTemplate.getForObject(
                "http://api.icndb.com/jokes/random", Joke.class);
        log.info(quote.toString());


    }
}
