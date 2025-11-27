package one.digitalinnovation.gof.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ClienteInseridoListener {

    @EventListener
    public void handleClienteInseridoEvent(ClienteInseridoEvent event) {
        System.out.println("[LISTENER] Cliente inserido com sucesso! Notificando sistemas...");
        // Aqui você poderia adicionar a lógica para enviar um e-mail,
        // notificar um serviço de marketing, etc.
    }
}