package pro.sky.ShelterTelegramBot.service;

import ch.qos.logback.core.net.server.Client;
import pro.sky.ShelterTelegramBot.model.ClientStatus;

import java.util.Collection;

public interface ClientStatusService {

    ClientStatus create(ClientStatus clientStatus);

    ClientStatus delete(Long id);

    ClientStatus get(Long id);
    ClientStatus registration(Long id);

    Collection<ClientStatus> findAll();

    int clickCat(Long id,int click);
    int clickDog(Long id,int click);
   // String interest(ClientStatus clientStatus);
}
