package k.jms14.pubsub;
import com.sun.messaging.ConnectionConfiguration;
import javax.jms.*;

public class SendSelect {
    public static void main(String[] args) {
        ConnectionFactory factory = new com.sun.messaging.ConnectionFactory();
        try (JMSContext context = factory.createContext("admin", "admin")){
            ((com.sun.messaging.ConnectionFactory) factory).setProperty(ConnectionConfiguration.imqAddressList,
                    "mq://127.0.0.1:7676,mq://127.0.0.1:7676");
            Connection connection = factory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            //TextMessage message = context.createTextMessage();
            //message.setText("symbol='BSTU'");
            Message message = session.createMessage();
            message.setObjectProperty("OS", "Windows");
            Destination ordersQueueSelector = context.createQueue("TradingOrdersQueueSelector");
            JMSProducer producer = context.createProducer();
            producer.send(ordersQueueSelector, message);
            System.out.println("OK");
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}