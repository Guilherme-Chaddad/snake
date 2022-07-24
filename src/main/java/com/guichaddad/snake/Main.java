package com.guichaddad.snake;

import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.impl.future.PromiseImpl;

public class Main {
    public static void main(String args[]) throws Exception {
        Vertx vertx = Vertx.vertx();
        Promise<Void> promise = new PromiseImpl<>();
        MainVerticle verticle = new MainVerticle();
        verticle.init(vertx, null);

        verticle.start(promise);
    }

}
