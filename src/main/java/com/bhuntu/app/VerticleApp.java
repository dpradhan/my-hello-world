package com.bhuntu.app;

import io.vertx.core.AbstractVerticle;

public class VerticleApp extends AbstractVerticle
{
    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(req -> req.response().end("Hello World Bhuntu 5!")).listen(8000);
    }
}
