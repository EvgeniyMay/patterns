package com.patterns.behavioral.mediator.mediator;

import com.patterns.behavioral.mediator.colleague.Colleague;

public interface Mediator {

    void send(String message, Colleague sender);

}
