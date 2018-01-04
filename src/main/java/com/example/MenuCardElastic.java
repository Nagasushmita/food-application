package com.example;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "menucard",type = "food",shards = 1,replicas = 0)

public class MenuCardElastic {
    public class MenuCard {
        @PrimaryKey
        private String id;
        private String name;
        private double price;

        public MenuCard() {
        }

        public MenuCard(String id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

}
