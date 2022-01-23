package com.osman.springbootbookseller.repository.projection;

import java.time.LocalDateTime;

public interface IPurchaseItem {
    String getTitle();
    String getPrice();
    LocalDateTime getPurchaseTime();
}
