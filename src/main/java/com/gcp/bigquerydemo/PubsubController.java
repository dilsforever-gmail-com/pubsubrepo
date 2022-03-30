package com.gcp.bigquerydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PubsubController {

    @Autowired
    private BigquerydemoApplication.PubsubOutboundGateway messagingGateway;

    @PostMapping("/postMessage")
    public ResponseEntity publishMessage(@RequestParam("message") String message) {
      messagingGateway.sendToPubsub(message);
        return new ResponseEntity<String>("Posted successfully",HttpStatus.CREATED);
    }

    @PostMapping("/postClaimLog")
    public ResponseEntity publishLog(@RequestBody ClaimDispositionLog message) {

        messagingGateway.sendToPubsub(message.toString());
        return new ResponseEntity<String>("Posted successfully",HttpStatus.CREATED);
    }

}
