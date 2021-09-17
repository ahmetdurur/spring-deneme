package com.folksdev.bookstore.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table
@Getter
@Setter
@Data
@Builder
@Entity(name = "bookOrder")
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userName;
    @ElementCollection(targetClass=Integer.class)
    private List<Integer> bookList;
    private Double totalPrice;


}
