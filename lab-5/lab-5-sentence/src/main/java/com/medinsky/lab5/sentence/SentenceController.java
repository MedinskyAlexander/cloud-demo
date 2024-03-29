package com.medinsky.lab5.sentence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class SentenceController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sentence")
    public @ResponseBody
    String getWord() {
        return getWord("SUBJECT") + " "
                + getWord("VERB") + " "
                + getWord("ARTICLE") + " "
                + getWord("ADJECTIVE") + " "
                + getWord("NOUN") + "."
                ;
    }

    public String getWord(String service) {
        return restTemplate.getForObject("http://" + service, String.class);
    }


}
