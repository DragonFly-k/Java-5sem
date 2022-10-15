package k.jms14.p2p;
import com.sun.messaging.ConnectionConfiguration;
import com.sun.messaging.ConnectionFactory;

import javax.jms.*;

public class receiver0{
    public static void main(String[] args) throws javax.jms.JMSException {
        javax.jms.ConnectionFactory factory = new com.sun.messaging.ConnectionFactory();
        try (JMSContext context = factory.createContext("admin", "admin")){
            ((com.sun.messaging.ConnectionFactory) factory).setProperty(ConnectionConfiguration.imqAddressList,
                    "mq://127.0.0.1:7676,mq://127.0.0.1:7676");
            Connection connection = factory.createConnection();
            Destination cardsQueue = context.createQueue("BrokerBank");
            JMSConsumer consumer = context.createConsumer(cardsQueue);
            connection.start();
            System.out.println("Wait...");
            while (true){
                Message m = consumer.receive();
                if(m != null){
                    if(m instanceof TextMessage){
                        System.out.println(((TextMessage) m).getText());
                    } else{
                        break;
                    }
                }
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}