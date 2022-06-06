# spring-kafka

## Kafka

Connect to Kafka shell

```
docker run --rm -v /var/run/docker.sock:/var/run/docker.sock -e HOST_IP=192.168.0.2 -e ZK=192.168.0.2 -i -t wurstmeister/kafka /bin/bash
```
Replace 192.168.0.2 with your IP.

Topics

```
$ $KAFKA_HOME/bin/kafka-topics.sh --create --topic topic --partitions 4 --zookeeper $ZK --replication-factor 1

$ $KAFKA_HOME/bin/kafka-topics.sh --describe --topic topic --zookeeper $ZK
```

Console Producer

```
$ $KAFKA_HOME/bin/kafka-console-producer.sh --topic=topic --broker-list=`broker-list.sh`
```

Console Consumer

```
$ $KAFKA_HOME/bin/kafka-console-consumer.sh --topic=topic --bootstrap-server=`broker-list.sh`
```