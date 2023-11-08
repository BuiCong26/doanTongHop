package com.example.doan_tonghop.entity;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class SaveImageEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "id", updatable = false, nullable = false)
        private Long id;

        @Column
        private String imageUrl;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getImageUrl() {
                return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
        }
}
