package com.equipo12.retobc.model.accountrq.gateways;

import com.equipo12.retobc.model.accountrq.AccountRS;
import reactor.core.publisher.Flux;

public interface AccountRQGateway {

   Flux<AccountRS> getBalance();
}
