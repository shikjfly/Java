package cc.openhome.interfaces_anonymous;

import java.util.ArrayList;

public class ClientQueue {
    private ArrayList clients = new ArrayList();
    private ArrayList listenrs = new ArrayList();

    public void add(Client client) {
        clients.add(client);
        ClientEvent event = new ClientEvent(client);
        for (int i = 0; i < listenrs.size(); i++) {
            ClientListener listener = (ClientListener)listenrs.get(i);
            listener.clientAdded(event);
        }
    }
    public void remove(Client client) {
        clients.remove(client);
        ClientEvent event = new ClientEvent(client);
        for (int i = 0; i < listenrs.size(); i++) {
            ClientListener listener = (ClientListener)listenrs.get(i);
            listener.clientRemoved(event);
        }
    }
    
}
