package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;
import org.springframework.context.ApplicationEvent;

public class ClienteInseridoEvent extends ApplicationEvent {

    public ClienteInseridoEvent(Object source, Cliente cliente) {
        super(source);
    }
}