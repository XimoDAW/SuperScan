package com.superscann.SuperScann.controller;

import com.superscann.SuperScann.controller.model.MarketWeb;
import com.superscann.SuperScann.domain.service.MarketService;
import com.superscann.SuperScann.http_response.Response;
import com.superscann.SuperScann.mapper.MarketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketController {
    @Autowired
    private MarketService marketService;

    @Autowired
    private MarketMapper marketMapper;

    @GetMapping("/markets/{id}")
    public Response getMarketById(@PathVariable int id) {
        MarketWeb marketWeb = marketMapper.toMarketWeb(marketService.findById(id));
        return new Response(marketWeb);

        /*
        if (marketWeb != null) {
            return ResponseEntity.ok(marketWeb);
        } else {
            return ResponseEntity.notFound().build();
        }*/
    }
}

