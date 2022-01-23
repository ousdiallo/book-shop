package com.osman.springbootbookseller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "purchase_history")
public class PurchaseHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "book_id", nullable = false)
    private Long bookId;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "purchased_at" , nullable = false)
    private LocalDateTime purchaseTime;
}
