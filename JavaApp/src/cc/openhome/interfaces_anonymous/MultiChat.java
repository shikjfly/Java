package cc.openhome.interfaces_anonymous;

public class MultiChat {
    public static void main(String[] args) {
        Client c1 = new Client("127.0.0.1", "localhost");
        Client c2 = new Client("192.168.0.2", "Justing");
        Client c3 = new Client("192.168.0.1", "tenda");
        ClientQueue queue = new ClientQueue();
        queue.addClientListener(new ClientListener() {
            @Override
            public void clientAdded(ClientEvent event) {
                System.out.printf("%s 从 %s 联机%n", event.getName(), event.getIp());
            }

            @Override
            public void clientRemoved(ClientEvent event) {
                System.out.printf("%s 从 %s 脱机%n", event.getName(), event.getIp());
            }
        });
        
        queue.add(c1);
        queue.add(c2);
        queue.add(c3);
        queue.remove(c1);
        queue.remove(c2);
        queue.remove(c3);
        
    }
}
