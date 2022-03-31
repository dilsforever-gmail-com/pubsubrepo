package com.gcp.bigquerydemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@Slf4j
public class PubsubController {


    @Autowired
    private BigquerydemoApplication.PubsubOutboundGateway messagingGateway;

    @PostMapping("/")
    public ResponseEntity publishTest() {
        Logger.getLogger("pubsub").info("In publish test success!!");
        return new ResponseEntity<String>("Posted successfully",HttpStatus.OK);
    }

    @PostMapping("/postMessage")
    public ResponseEntity publishMessage(@RequestParam("message") String message) {
        Logger.getLogger("pubsub").info("In post message");
      messagingGateway.sendToPubsub(message);
        return new ResponseEntity<String>("Posted successfully",HttpStatus.CREATED);
    }

    @PostMapping("/postClaimLog")
    public ResponseEntity publishLog(@RequestBody ClaimDispositionLog message) {

        messagingGateway.sendToPubsub(message.toString());
        return new ResponseEntity<String>("Posted successfully",HttpStatus.CREATED);
    }

}
