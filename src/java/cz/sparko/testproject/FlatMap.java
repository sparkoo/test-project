package cz.sparko.testproject;

import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<DeviceWithQueues> deviceWithQueues = Arrays.asList(
                new DeviceWithQueues("device 1", Arrays.asList("q11", "q12", "q13")),
                new DeviceWithQueues("device 2", Arrays.asList("q21", "q22", "q23", "q24", "q25")),
                new DeviceWithQueues("device 3", Arrays.asList("q31")));

        deviceWithQueues.stream().flatMap(x -> x.queues.stream().map(y -> new Queue(x.name, y))).forEach(System.out::println);
    }

    private static class DeviceWithQueues {
        private final String name;
        private final List<String> queues;

        public DeviceWithQueues(String name, List<String> queues) {
            this.name = name;
            this.queues = queues;
        }

        @Override
        public String toString() {
            return "DeviceWithQueues{" +
                    "name='" + name + '\'' +
                    ", queues=" + queues +
                    '}';
        }
    }

    private static class Queue {
        private final String deviceName;
        private final String queueName;

        public Queue(String deviceName, String queueName) {
            this.deviceName = deviceName;
            this.queueName = queueName;
        }

        @Override
        public String toString() {
            return "Queue{" +
                    "deviceName='" + deviceName + '\'' +
                    ", queueName='" + queueName + '\'' +
                    '}';
        }
    }
}
